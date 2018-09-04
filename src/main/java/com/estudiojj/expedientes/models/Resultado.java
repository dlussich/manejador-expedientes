/**
 * Resultado.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.estudiojj.expedientes.models;

import java.io.Serializable;
import java.lang.reflect.Array;

import javax.xml.namespace.QName;

import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class Resultado  implements Serializable {
    private String estado;

    private String origen;

    private String expediente;

    private String caratula;

    private String abogado_actor;

    private String abogado_demandante;

    private Giro[] movimientos;

    public Resultado() {
    }

    public Resultado(
           String estado,
           String origen,
           String expediente,
           String caratula,
           String abogado_actor,
           String abogado_demandante,
           Giro[] movimientos) {
           this.estado = estado;
           this.origen = origen;
           this.expediente = expediente;
           this.caratula = caratula;
           this.abogado_actor = abogado_actor;
           this.abogado_demandante = abogado_demandante;
           this.movimientos = movimientos;
    }


    /**
     * Gets the estado value for this Resultado.
     * 
     * @return estado
     */
    public String getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this Resultado.
     * 
     * @param estado
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }


    /**
     * Gets the origen value for this Resultado.
     * 
     * @return origen
     */
    public String getOrigen() {
        return origen;
    }


    /**
     * Sets the origen value for this Resultado.
     * 
     * @param origen
     */
    public void setOrigen(String origen) {
        this.origen = origen;
    }


    /**
     * Gets the expediente value for this Resultado.
     * 
     * @return expediente
     */
    public String getExpediente() {
        return expediente;
    }


    /**
     * Sets the expediente value for this Resultado.
     * 
     * @param expediente
     */
    public void setExpediente(String expediente) {
        this.expediente = expediente;
    }


    /**
     * Gets the caratula value for this Resultado.
     * 
     * @return caratula
     */
    public String getCaratula() {
        return caratula;
    }


    /**
     * Sets the caratula value for this Resultado.
     * 
     * @param caratula
     */
    public void setCaratula(String caratula) {
        this.caratula = caratula;
    }


    /**
     * Gets the abogado_actor value for this Resultado.
     * 
     * @return abogado_actor
     */
    public String getAbogado_actor() {
        return abogado_actor;
    }


    /**
     * Sets the abogado_actor value for this Resultado.
     * 
     * @param abogado_actor
     */
    public void setAbogado_actor(String abogado_actor) {
        this.abogado_actor = abogado_actor;
    }


    /**
     * Gets the abogado_demandante value for this Resultado.
     * 
     * @return abogado_demandante
     */
    public String getAbogado_demandante() {
        return abogado_demandante;
    }


    /**
     * Sets the abogado_demandante value for this Resultado.
     * 
     * @param abogado_demandante
     */
    public void setAbogado_demandante(String abogado_demandante) {
        this.abogado_demandante = abogado_demandante;
    }


    /**
     * Gets the movimientos value for this Resultado.
     * 
     * @return movimientos
     */
    public Giro[] getMovimientos() {
        return movimientos;
    }


    /**
     * Sets the movimientos value for this Resultado.
     * 
     * @param movimientos
     */
    public void setMovimientos(Giro[] movimientos) {
        this.movimientos = movimientos;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Resultado)) return false;
        Resultado other = (Resultado) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.estado==null && other.getEstado()==null) || 
             (this.estado!=null &&
              this.estado.equals(other.getEstado()))) &&
            ((this.origen==null && other.getOrigen()==null) || 
             (this.origen!=null &&
              this.origen.equals(other.getOrigen()))) &&
            ((this.expediente==null && other.getExpediente()==null) || 
             (this.expediente!=null &&
              this.expediente.equals(other.getExpediente()))) &&
            ((this.caratula==null && other.getCaratula()==null) || 
             (this.caratula!=null &&
              this.caratula.equals(other.getCaratula()))) &&
            ((this.abogado_actor==null && other.getAbogado_actor()==null) || 
             (this.abogado_actor!=null &&
              this.abogado_actor.equals(other.getAbogado_actor()))) &&
            ((this.abogado_demandante==null && other.getAbogado_demandante()==null) || 
             (this.abogado_demandante!=null &&
              this.abogado_demandante.equals(other.getAbogado_demandante()))) &&
            ((this.movimientos==null && other.getMovimientos()==null) || 
             (this.movimientos!=null &&
              java.util.Arrays.equals(this.movimientos, other.getMovimientos())));
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
        if (getEstado() != null) {
            _hashCode += getEstado().hashCode();
        }
        if (getOrigen() != null) {
            _hashCode += getOrigen().hashCode();
        }
        if (getExpediente() != null) {
            _hashCode += getExpediente().hashCode();
        }
        if (getCaratula() != null) {
            _hashCode += getCaratula().hashCode();
        }
        if (getAbogado_actor() != null) {
            _hashCode += getAbogado_actor().hashCode();
        }
        if (getAbogado_demandante() != null) {
            _hashCode += getAbogado_demandante().hashCode();
        }
        if (getMovimientos() != null) {
            for (int i=0;
                 i<Array.getLength(getMovimientos());
                 i++) {
                Object obj = Array.get(getMovimientos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static TypeDesc typeDesc =
        new TypeDesc(Resultado.class, true);

    static {
        typeDesc.setXmlType(new QName("urn:consultaIUEwsdl", "resultado"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("estado");
        elemField.setXmlName(new QName("", "estado"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("origen");
        elemField.setXmlName(new QName("", "origen"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expediente");
        elemField.setXmlName(new QName("", "expediente"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("caratula");
        elemField.setXmlName(new QName("", "caratula"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("abogado_actor");
        elemField.setXmlName(new QName("", "abogado_actor"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("abogado_demandante");
        elemField.setXmlName(new QName("", "abogado_demandante"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("movimientos");
        elemField.setXmlName(new QName("", "movimientos"));
        elemField.setXmlType(new QName("urn:consultaIUEwsdl", "giro"));
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
		StringBuilder sb= new StringBuilder();
		sb.append("					"+ this.getEstado() + "\n");
		sb.append(" Origen: " +this.getOrigen() + "\n");
		sb.append(" Expediente: " + this.getExpediente() + "\n");
		sb.append(" Caratula: " + this.getCaratula() + "\n");
		sb.append(" Abogado Actor: " + this.getAbogado_actor() + "\n");
		sb.append(" Abogado Demandante: " + this.getAbogado_demandante() + "\n");
		sb.append("                 " + " MOVIMIENTOS " + "\n");
		sb.append(" Fecha    - ");
		sb.append(" Tipo    - ");
		sb.append(" Decreto    - ");
		sb.append(" Vencimiento  - ");
		sb.append(" Sede \n");
		for(Giro giro: this.getMovimientos()) {
			sb.append(giro.toString() + "\n");
		}
		return sb.toString();
	}

}
