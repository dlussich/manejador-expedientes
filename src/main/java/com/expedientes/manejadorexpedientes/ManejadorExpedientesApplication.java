package com.expedientes.manejadorexpedientes;

import java.io.IOException;
import java.rmi.RemoteException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

import com.expedientes.manejadorexpedientes.integration.FileHandler;
import com.expedientes.manejadorexpedientes.models.Resultado;
import com.expedientes.manejadorexpedientes.ws.client.ConsultaIUEwsdlPortTypeProxy;

@SpringBootApplication
@Configuration
public class ManejadorExpedientesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManejadorExpedientesApplication.class, args);
		ConsultaIUEwsdlPortTypeProxy service = new ConsultaIUEwsdlPortTypeProxy();
		try {
			Resultado result = service.consultaIUE("304-200/2017");
			System.out.println(result);
			FileHandler handler= FileHandler.getInstance();
			handler.writeNewFile(result);
		} catch (RemoteException re) {
			System.out.println(re.getMessage());
		} catch(IOException ie) {
			System.out.println(ie.getMessage());
		}
		
	}
	
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
	    registry
	      .addResourceHandler("/resources/**")
	      .addResourceLocations("/resources/","classpath:/expedientes/");
	}
}
