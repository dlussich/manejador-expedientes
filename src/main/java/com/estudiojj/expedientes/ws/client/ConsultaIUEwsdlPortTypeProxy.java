package com.estudiojj.expedientes.ws.client;

import java.rmi.RemoteException;

import com.estudiojj.expedientes.models.Resultado;
import com.estudiojj.expedientes.ws.consultaIUE.ConsultaIUEwsdlLocator;
import com.estudiojj.expedientes.ws.consultaIUE.ConsultaIUEwsdlPortType;
import org.apache.commons.logging.impl.Log4JLogger;


public class ConsultaIUEwsdlPortTypeProxy implements ConsultaIUEwsdlPortType {
	
  //private static Log4JLogger logger = new Log4JLogger(ConsultaIUEwsdlPortTypeProxy.class.getName());
  private String _endpoint = null;
  private ConsultaIUEwsdlPortType consultaIUEwsdlPortType = null;
  
  public ConsultaIUEwsdlPortTypeProxy() {
    _initConsultaIUEwsdlPortTypeProxy();
  }
  
  public ConsultaIUEwsdlPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initConsultaIUEwsdlPortTypeProxy();
  }
  
  private void _initConsultaIUEwsdlPortTypeProxy() {
    try {
      consultaIUEwsdlPortType = (new ConsultaIUEwsdlLocator()).getconsultaIUEwsdlPort();
      if (consultaIUEwsdlPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)consultaIUEwsdlPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)consultaIUEwsdlPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (consultaIUEwsdlPortType != null)
      ((javax.xml.rpc.Stub)consultaIUEwsdlPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ConsultaIUEwsdlPortType getConsultaIUEwsdlPortType() {
    if (consultaIUEwsdlPortType == null)
      _initConsultaIUEwsdlPortTypeProxy();
    return consultaIUEwsdlPortType;
  }

	@Override
	public Resultado consultaIUE(String iue) throws RemoteException {
		Resultado resultado = null;
		try {
			//logger.info("Consultando web service consultaIUE, buscando informacion sobre expediente " + iue);
			resultado = this.getConsultaIUEwsdlPortType().consultaIUE(iue);
			
		} catch (RemoteException re) {
			//logger.info("No se pudo encontrar informacion sobre expediente " + iue);
			System.out.println(re.getMessage());
		}
		return resultado;
	}
  
  
}