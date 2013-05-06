//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.06 at 12:42:11 PM MSK 
//


package com.rest4j.impl.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.rest4j.impl.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Api_QNAME = new QName("http://rest4j.com/api-description", "api");
    private final static QName _StringWithParamsParam_QNAME = new QName("http://rest4j.com/api-description", "param");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.rest4j.impl.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Endpoint }
     * 
     */
    public Endpoint createEndpoint() {
        return new Endpoint();
    }

    /**
     * Create an instance of {@link ComplexField }
     * 
     */
    public ComplexField createComplexField() {
        return new ComplexField();
    }

    /**
     * Create an instance of {@link Description }
     * 
     */
    public Description createDescription() {
        return new Description();
    }

    /**
     * Create an instance of {@link API }
     * 
     */
    public API createAPI() {
        return new API();
    }

    /**
     * Create an instance of {@link SimpleField }
     * 
     */
    public SimpleField createSimpleField() {
        return new SimpleField();
    }

    /**
     * Create an instance of {@link Parameter }
     * 
     */
    public Parameter createParameter() {
        return new Parameter();
    }

    /**
     * Create an instance of {@link Values }
     * 
     */
    public Values createValues() {
        return new Values();
    }

    /**
     * Create an instance of {@link JsonType }
     * 
     */
    public JsonType createJsonType() {
        return new JsonType();
    }

    /**
     * Create an instance of {@link StringWithParams }
     * 
     */
    public StringWithParams createStringWithParams() {
        return new StringWithParams();
    }

    /**
     * Create an instance of {@link ServiceEntry }
     * 
     */
    public ServiceEntry createServiceEntry() {
        return new ServiceEntry();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link Model }
     * 
     */
    public Model createModel() {
        return new Model();
    }

    /**
     * Create an instance of {@link Errors }
     * 
     */
    public Errors createErrors() {
        return new Errors();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link ContentType }
     * 
     */
    public ContentType createContentType() {
        return new ContentType();
    }

    /**
     * Create an instance of {@link Parameters }
     * 
     */
    public Parameters createParameters() {
        return new Parameters();
    }

    /**
     * Create an instance of {@link Field }
     * 
     */
    public Field createField() {
        return new Field();
    }

    /**
     * Create an instance of {@link Fields }
     * 
     */
    public Fields createFields() {
        return new Fields();
    }

    /**
     * Create an instance of {@link PatchType }
     * 
     */
    public PatchType createPatchType() {
        return new PatchType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link API }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rest4j.com/api-description", name = "api")
    public JAXBElement<API> createApi(API value) {
        return new JAXBElement<API>(_Api_QNAME, API.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://rest4j.com/api-description", name = "param", scope = StringWithParams.class)
    public JAXBElement<String> createStringWithParamsParam(String value) {
        return new JAXBElement<String>(_StringWithParamsParam_QNAME, String.class, StringWithParams.class, value);
    }

}
