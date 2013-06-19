//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.06.17 at 08:19:37 PM MSK 
//


package com.rest4j.impl.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Endpoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Endpoint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="route" type="{http://rest4j.com/api-description}StringWithParams"/>
 *         &lt;element name="description" type="{http://rest4j.com/api-description}Description"/>
 *         &lt;element name="parameters" type="{http://rest4j.com/api-description}Parameters"/>
 *         &lt;element name="body" type="{http://rest4j.com/api-description}ContentType" minOccurs="0"/>
 *         &lt;element name="response" type="{http://rest4j.com/api-description}ContentType" minOccurs="0"/>
 *         &lt;element name="errors" type="{http://rest4j.com/api-description}Errors"/>
 *         &lt;element name="service" type="{http://rest4j.com/api-description}ServiceEntry"/>
 *         &lt;element name="extra" type="{http://rest4j.com/api-description}ExtraInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="http" use="required" type="{http://rest4j.com/api-description}HttpMethod" />
 *       &lt;attribute name="httpsonly" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Endpoint", propOrder = {
    "route",
    "description",
    "parameters",
    "body",
    "response",
    "errors",
    "service",
    "extra"
})
public class Endpoint {

    @XmlElement(required = true)
    protected StringWithParams route;
    @XmlElement(required = true)
    protected Description description;
    @XmlElement(required = true)
    protected Parameters parameters;
    protected ContentType body;
    protected ContentType response;
    @XmlElement(required = true)
    protected Errors errors;
    @XmlElement(required = true)
    protected ServiceEntry service;
    protected ExtraInfo extra;
    @XmlAttribute(name = "http", required = true)
    protected HttpMethod http;
    @XmlAttribute(name = "httpsonly")
    protected Boolean httpsonly;

    /**
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link StringWithParams }
     *     
     */
    public StringWithParams getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringWithParams }
     *     
     */
    public void setRoute(StringWithParams value) {
        this.route = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link Description }
     *     
     */
    public Description getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link Description }
     *     
     */
    public void setDescription(Description value) {
        this.description = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link Parameters }
     *     
     */
    public Parameters getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parameters }
     *     
     */
    public void setParameters(Parameters value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link ContentType }
     *     
     */
    public ContentType getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentType }
     *     
     */
    public void setBody(ContentType value) {
        this.body = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link ContentType }
     *     
     */
    public ContentType getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentType }
     *     
     */
    public void setResponse(ContentType value) {
        this.response = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link Errors }
     *     
     */
    public Errors getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Errors }
     *     
     */
    public void setErrors(Errors value) {
        this.errors = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceEntry }
     *     
     */
    public ServiceEntry getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceEntry }
     *     
     */
    public void setService(ServiceEntry value) {
        this.service = value;
    }

    /**
     * Gets the value of the extra property.
     * 
     * @return
     *     possible object is
     *     {@link ExtraInfo }
     *     
     */
    public ExtraInfo getExtra() {
        return extra;
    }

    /**
     * Sets the value of the extra property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtraInfo }
     *     
     */
    public void setExtra(ExtraInfo value) {
        this.extra = value;
    }

    /**
     * Gets the value of the http property.
     * 
     * @return
     *     possible object is
     *     {@link HttpMethod }
     *     
     */
    public HttpMethod getHttp() {
        return http;
    }

    /**
     * Sets the value of the http property.
     * 
     * @param value
     *     allowed object is
     *     {@link HttpMethod }
     *     
     */
    public void setHttp(HttpMethod value) {
        this.http = value;
    }

    /**
     * Gets the value of the httpsonly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isHttpsonly() {
        if (httpsonly == null) {
            return false;
        } else {
            return httpsonly;
        }
    }

    /**
     * Sets the value of the httpsonly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHttpsonly(Boolean value) {
        this.httpsonly = value;
    }

}
