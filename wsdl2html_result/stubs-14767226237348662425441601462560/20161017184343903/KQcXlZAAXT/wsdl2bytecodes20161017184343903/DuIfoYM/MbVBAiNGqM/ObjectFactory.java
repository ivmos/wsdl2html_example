
package wsdl2bytecodes20161017184343903.DuIfoYM.MbVBAiNGqM;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wsdl2bytecodes20161017184343903.DuIfoYM.MbVBAiNGqM package. 
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

    private final static QName _Method1Response_QNAME = new QName("http://ws.example.com/", "method1Response");
    private final static QName _Method1_QNAME = new QName("http://ws.example.com/", "method1");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsdl2bytecodes20161017184343903.DuIfoYM.MbVBAiNGqM
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Method1 }
     * 
     */
    public Method1 createMethod1() {
        return new Method1();
    }

    /**
     * Create an instance of {@link Method1Response }
     * 
     */
    public Method1Response createMethod1Response() {
        return new Method1Response();
    }

    /**
     * Create an instance of {@link Method1Result }
     * 
     */
    public Method1Result createMethod1Result() {
        return new Method1Result();
    }

    /**
     * Create an instance of {@link Session }
     * 
     */
    public Session createSession() {
        return new Session();
    }

    /**
     * Create an instance of {@link ErrorResult }
     * 
     */
    public ErrorResult createErrorResult() {
        return new ErrorResult();
    }

    /**
     * Create an instance of {@link UserId }
     * 
     */
    public UserId createUserId() {
        return new UserId();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Method1Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.example.com/", name = "method1Response")
    public JAXBElement<Method1Response> createMethod1Response(Method1Response value) {
        return new JAXBElement<Method1Response>(_Method1Response_QNAME, Method1Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Method1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.example.com/", name = "method1")
    public JAXBElement<Method1> createMethod1(Method1 value) {
        return new JAXBElement<Method1>(_Method1_QNAME, Method1 .class, null, value);
    }

}
