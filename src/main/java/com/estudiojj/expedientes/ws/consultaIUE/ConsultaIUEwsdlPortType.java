/**
 * ConsultaIUEwsdlPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.estudiojj.expedientes.ws.consultaIUE;

import java.rmi.Remote;
import java.rmi.RemoteException;

import com.estudiojj.expedientes.models.Resultado;

public interface ConsultaIUEwsdlPortType extends Remote {

    /**
     * Dada una iue devuelve los datos de la sede
     */
    public Resultado consultaIUE(String iue) throws RemoteException;
}
