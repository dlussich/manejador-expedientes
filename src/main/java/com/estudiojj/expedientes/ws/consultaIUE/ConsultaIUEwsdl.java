/**
 * ConsultaIUEwsdl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.estudiojj.expedientes.ws.consultaIUE;

import java.net.URL;

import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;

public interface ConsultaIUEwsdl extends Service {
    public String getconsultaIUEwsdlPortAddress();

    public ConsultaIUEwsdlPortType getconsultaIUEwsdlPort() throws ServiceException;

    public ConsultaIUEwsdlPortType getconsultaIUEwsdlPort(URL portAddress) throws ServiceException;
}
