/**
 * ConsultaIUEwsdlLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.estudiojj.expedientes.ws.consultaIUE;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.Remote;
import java.util.HashSet;
import java.util.Iterator;

import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;

import org.apache.axis.AxisFault;
import org.apache.axis.EngineConfiguration;
import org.apache.axis.client.Service;

public class ConsultaIUEwsdlLocator extends Service implements ConsultaIUEwsdl {

    public ConsultaIUEwsdlLocator() {
    }


    public ConsultaIUEwsdlLocator(EngineConfiguration config) {
        super(config);
    }

    public ConsultaIUEwsdlLocator(String wsdlLoc, QName sName) throws ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for consultaIUEwsdlPort
    private String consultaIUEwsdlPort_address = "http://expedientes.poderjudicial.gub.uy/wsConsultaIUE.php";

    public String getconsultaIUEwsdlPortAddress() {
        return consultaIUEwsdlPort_address;
    }

    // The WSDD service name defaults to the port name.
    private String consultaIUEwsdlPortWSDDServiceName = "consultaIUEwsdlPort";

    public String getconsultaIUEwsdlPortWSDDServiceName() {
        return consultaIUEwsdlPortWSDDServiceName;
    }

    public void setconsultaIUEwsdlPortWSDDServiceName(String name) {
        consultaIUEwsdlPortWSDDServiceName = name;
    }

    public ConsultaIUEwsdlPortType getconsultaIUEwsdlPort() throws ServiceException {
       URL endpoint;
        try {
            endpoint = new URL(consultaIUEwsdlPort_address);
        }
        catch (MalformedURLException e) {
            throw new ServiceException(e);
        }
        return getconsultaIUEwsdlPort(endpoint);
    }

    public ConsultaIUEwsdlPortType getconsultaIUEwsdlPort(URL portAddress) throws ServiceException {
        try {
            ConsultaIUEwsdlBindingStub _stub = new ConsultaIUEwsdlBindingStub(portAddress, this);
            _stub.setPortName(getconsultaIUEwsdlPortWSDDServiceName());
            return _stub;
        }
        catch (AxisFault e) {
            return null;
        }
    }

    public void setconsultaIUEwsdlPortEndpointAddress(String address) {
        consultaIUEwsdlPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public Remote getPort(Class serviceEndpointInterface) throws ServiceException {
        try {
            if (ConsultaIUEwsdlPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                ConsultaIUEwsdlBindingStub _stub = new ConsultaIUEwsdlBindingStub(new URL(consultaIUEwsdlPort_address), this);
                _stub.setPortName(getconsultaIUEwsdlPortWSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
            throw new ServiceException(t);
        }
        throw new ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public Remote getPort(QName portName, Class serviceEndpointInterface) throws ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("consultaIUEwsdlPort".equals(inputPortName)) {
            return getconsultaIUEwsdlPort();
        }
        else  {
            Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public QName getServiceName() {
        return new QName("urn:consultaIUEwsdl", "consultaIUEwsdl");
    }

    private HashSet ports = null;

    public Iterator getPorts() {
        if (ports == null) {
            ports = new HashSet();
            ports.add(new QName("urn:consultaIUEwsdl", "consultaIUEwsdlPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws ServiceException {
        
if ("consultaIUEwsdlPort".equals(portName)) {
            setconsultaIUEwsdlPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(QName portName, String address) throws ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
