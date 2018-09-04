package com.estudiojj.expedientes;



import java.rmi.RemoteException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.estudiojj.expedientes.models.Resultado;
import com.estudiojj.expedientes.ws.client.ConsultaIUEwsdlPortTypeProxy;



@SpringBootApplication
public class ExpedientesApplication {

	//private static Log4JLogger logger = new Log4JLogger(ExpedientesApplication.class.getName());
	
	public static void main(String[] args) {
		SpringApplication.run(ExpedientesApplication.class, args);
		ConsultaIUEwsdlPortTypeProxy service = new ConsultaIUEwsdlPortTypeProxy();
		try {
			Resultado result = service.consultaIUE("304-200/2017");
			System.out.println(result);
			
		} catch (RemoteException re) {
			System.out.println(re.getMessage());
		}
	}
}
