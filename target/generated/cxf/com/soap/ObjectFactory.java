
package com.soap;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.soap package. 
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

    private final static QName _GetHuman_QNAME = new QName("http://soap.com/", "getHuman");
    private final static QName _GetHumanResponse_QNAME = new QName("http://soap.com/", "getHumanResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetHuman }
     * 
     */
    public GetHuman createGetHuman() {
        return new GetHuman();
    }

    /**
     * Create an instance of {@link GetHumanResponse }
     * 
     */
    public GetHumanResponse createGetHumanResponse() {
        return new GetHumanResponse();
    }

    /**
     * Create an instance of {@link Human }
     * 
     */
    public Human createHuman() {
        return new Human();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHuman }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetHuman }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.com/", name = "getHuman")
    public JAXBElement<GetHuman> createGetHuman(GetHuman value) {
        return new JAXBElement<GetHuman>(_GetHuman_QNAME, GetHuman.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHumanResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetHumanResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://soap.com/", name = "getHumanResponse")
    public JAXBElement<GetHumanResponse> createGetHumanResponse(GetHumanResponse value) {
        return new JAXBElement<GetHumanResponse>(_GetHumanResponse_QNAME, GetHumanResponse.class, null, value);
    }

}
