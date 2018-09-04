/**
 * Giro.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.estudiojj.expedientes.models;

import java.io.Serializable;

import javax.xml.namespace.QName;

import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class Giro  implements Serializable {
    private String fecha;

    private String tipo;

    private String decreto;

    private String vencimiento;

    private String sede;

    public Giro() {
    }

    public Giro(
           String fecha,
           String tipo,
           String decreto,
           String vencimiento,
           String sede) {
           this.fecha = fecha;
           this.tipo = tipo;
           this.decreto = decreto;
           this.vencimiento = vencimiento;
           this.sede = sede;
    }


    /**
     * Gets the fecha value for this Giro.
     * 
     * @return fecha
     */
    public String getFecha() {
        return fecha;
    }


    /**
     * Sets the fecha value for this Giro.
     * 
     * @param fecha
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    /**
     * Gets the tipo value for this Giro.
     * 
     * @return tipo
     */
    public String getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this Giro.
     * 
     * @param tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    /**
     * Gets the decreto value for this Giro.
     * 
     * @return decreto
     */
    public String getDecreto() {
        return decreto;
    }


    /**
     * Sets the decreto value for this Giro.
     * 
     * @param decreto
     */
    public void setDecreto(String decreto) {
        this.decreto = decreto;
    }


    /**
     * Gets the vencimiento value for this Giro.
     * 
     * @return vencimiento
     */
    public String getVencimiento() {
        return vencimiento;
    }


    /**
     * Sets the vencimiento value for this Giro.
     * 
     * @param vencimiento
     */
    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }


    /**
     * Gets the sede value for this Giro.
     * 
     * @return sede
     */
    public String getSede() {
        return sede;
    }


    /**
     * Sets the sede value for this Giro.
     * 
     * @param sede
     */
    public void setSede(String sede) {
        this.sede = sede;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Giro)) return false;
        Giro other = (Giro) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fecha==null && other.getFecha()==null) || 
             (this.fecha!=null &&
              this.fecha.equals(other.getFecha()))) &&
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo()))) &&
            ((this.decreto==null && other.getDecreto()==null) || 
             (this.decreto!=null &&
              this.decreto.equals(other.getDecreto()))) &&
            ((this.vencimiento==null && other.getVencimiento()==null) || 
             (this.vencimiento!=null &&
              this.vencimiento.equals(other.getVencimiento()))) &&
            ((this.sede==null && other.getSede()==null) || 
             (this.sede!=null &&
              this.sede.equals(other.getSede())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getFecha() != null) {
            _hashCode += getFecha().hashCode();
        }
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        if (getDecreto() != null) {
            _hashCode += getDecreto().hashCode();
        }
        if (getVencimiento() != null) {
            _hashCode += getVencimiento().hashCode();
        }
        if (getSede() != null) {
            _hashCode += getSede().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static TypeDesc typeDesc =
        new TypeDesc(Giro.class, true);

    static {
        typeDesc.setXmlType(new QName("urn:consultaIUEwsdl", "giro"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("fecha");
        elemField.setXmlName(new QName("", "fecha"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new QName("", "tipo"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("decreto");
        elemField.setXmlName(new QName("", "decreto"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vencimiento");
        elemField.setXmlName(new QName("", "vencimiento"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sede");
        elemField.setXmlName(new QName("", "sede"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static Serializer getSerializer(
           String mechType, 
           Class _javaType,  
           QName _xmlType) {
        return 
          new  BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static Deserializer getDeserializer(
           String mechType, 
           Class _javaType,  
           QName _xmlType) {
        return 
          new  BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }
    
    @Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("* " + this.getFecha() + " - ");
		sb.append(this.getTipo() + " - ");
		sb.append(this.getDecreto() + " - ");
		sb.append(this.getVencimiento() + " - ");
		sb.append(this.getSede());
		return sb.toString();
	}

}
