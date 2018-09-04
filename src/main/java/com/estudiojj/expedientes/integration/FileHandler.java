package com.estudiojj.expedientes.integration;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import com.estudiojj.expedientes.models.Resultado;

public class FileHandler {
	
	private static String carpetaExpedientes = "expedientes";
	
	private static FileHandler instance;
	
	private FileHandler() {}
	
	public static FileHandler getInstance() {
		if(instance == null) {
			instance = new FileHandler();
		} 
		return instance;
	}
	
	public List<File> loadExpedientes() throws IOException{
		List<File> files = null;
		try {
			String path = instance.getClass().getResource(carpetaExpedientes).getPath().toString();
			
			files = Files.walk(Paths.get(path))
	                .filter(Files::isRegularFile)
	                .map(Path::toFile)
	                .collect(Collectors.toList());
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
		return files;
	}
	
	public void writeNewFile(Resultado resultado) throws IOException {
		try {
			ClassLoader classloader = ClassLoader.getSystemClassLoader();
			String filepath = classloader.getClass().getClassLoader().getResource("classpath:expedientes").getPath();
			//File path = ResourceUtils.getFile(filepath);
			//File file = ResourceUtils.getFile(path + resultado.getExpediente());
			File file = new File(filepath,resultado.getExpediente());
			if(file.exists()) {
				FileWriter fileWriter = new FileWriter(file);
				PrintWriter printWriter = new PrintWriter(fileWriter);
				printWriter.print(resultado.toString());
				printWriter.close();
			}else {
				File newFile = new File(filepath,resultado.getExpediente());
				FileWriter fileWriter = new FileWriter(newFile);
				PrintWriter printWriter = new PrintWriter(fileWriter);
				printWriter.print(resultado.toString());
				printWriter.close();
			}
		     
		} catch(IOException e) {
			System.out.println(e.getMessage());
		} 
	}

}
