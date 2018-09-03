package com.expedientes.manejadorexpedientes.ws.client;

import java.rmi.RemoteException;

import org.apache.commons.logging.impl.Log4JLogger;

import com.expedientes.manejadorexpedientes.models.Resultado;
import com.expedientes.manejadorexpedientes.ws.consultaIUE.ConsultaIUEwsdlLocator;
import com.expedientes.manejadorexpedientes.ws.consultaIUE.ConsultaIUEwsdlPortType;

public class ConsultaIUEwsdlPortTypeProxy implements ConsultaIUEwsdlPortType {

  private static Log4JLogger logger = new Log4JLogger(ConsultaIUEwsdlPortTypeProxy.class.getName());
  private String _endpoint = null;
  private com.expedientes.manejadorexpedientes.ws.consultaIUE.ConsultaIUEwsdlPortType consultaIUEwsdlPortType = null;
  
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
  
  public com.expedientes.manejadorexpedientes.ws.consultaIUE.ConsultaIUEwsdlPortType getConsultaIUEwsdlPortType() {
    if (consultaIUEwsdlPortType == null)
      _initConsultaIUEwsdlPortTypeProxy();
    return consultaIUEwsdlPortType;
  }

	@Override
	public Resultado consultaIUE(String iue) throws RemoteException {
		Resultado resultado = null;
		try {
			logger.info("Accediendo al web service consultaIUE, buscando expediente " + iue);
			resultado = this.getConsultaIUEwsdlPortType().consultaIUE(iue);
		}catch (RemoteException re) {
			logger.info("No se pudo obtener info sobre el expediente "+ iue);
			logger.error(re.getMessage());
		}
		return resultado;
	}
  
  
}