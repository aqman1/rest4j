//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.15 at 09:57:00 AM MSK 
//


package com.rest4j.impl.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for APIParams complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="APIParams">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="jsonp-param-name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prettify-by-default" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="prettify-param" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APIParams", propOrder = {
    "jsonpParamName",
    "prettifyByDefault",
    "prettifyParam"
})
public class APIParams {

    @XmlElement(name = "jsonp-param-name")
    protected String jsonpParamName;
    @XmlElement(name = "prettify-by-default")
    protected Boolean prettifyByDefault;
    @XmlElement(name = "prettify-param")
    protected String prettifyParam;

    /**
     * Gets the value of the jsonpParamName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJsonpParamName() {
        return jsonpParamName;
    }

    /**
     * Sets the value of the jsonpParamName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJsonpParamName(String value) {
        this.jsonpParamName = value;
    }

    /**
     * Gets the value of the prettifyByDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrettifyByDefault() {
        return prettifyByDefault;
    }

    /**
     * Sets the value of the prettifyByDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrettifyByDefault(Boolean value) {
        this.prettifyByDefault = value;
    }

    /**
     * Gets the value of the prettifyParam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrettifyParam() {
        return prettifyParam;
    }

    /**
     * Sets the value of the prettifyParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrettifyParam(String value) {
        this.prettifyParam = value;
    }

}
