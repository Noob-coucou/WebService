
package com.webserver;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.webserver package. 
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

    private final static QName _DecryptString_QNAME = new QName("http://www.webserver.com/", "decryptString");
    private final static QName _EncryptStringResponse_QNAME = new QName("http://www.webserver.com/", "encryptStringResponse");
    private final static QName _DecryptStringResponse_QNAME = new QName("http://www.webserver.com/", "decryptStringResponse");
    private final static QName _EncryptString_QNAME = new QName("http://www.webserver.com/", "encryptString");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.webserver
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EncryptString }
     * 
     */
    public EncryptString createEncryptString() {
        return new EncryptString();
    }

    /**
     * Create an instance of {@link EncryptStringResponse }
     * 
     */
    public EncryptStringResponse createEncryptStringResponse() {
        return new EncryptStringResponse();
    }

    /**
     * Create an instance of {@link DecryptStringResponse }
     * 
     */
    public DecryptStringResponse createDecryptStringResponse() {
        return new DecryptStringResponse();
    }

    /**
     * Create an instance of {@link DecryptString }
     * 
     */
    public DecryptString createDecryptString() {
        return new DecryptString();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecryptString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webserver.com/", name = "decryptString")
    public JAXBElement<DecryptString> createDecryptString(DecryptString value) {
        return new JAXBElement<DecryptString>(_DecryptString_QNAME, DecryptString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncryptStringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webserver.com/", name = "encryptStringResponse")
    public JAXBElement<EncryptStringResponse> createEncryptStringResponse(EncryptStringResponse value) {
        return new JAXBElement<EncryptStringResponse>(_EncryptStringResponse_QNAME, EncryptStringResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecryptStringResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webserver.com/", name = "decryptStringResponse")
    public JAXBElement<DecryptStringResponse> createDecryptStringResponse(DecryptStringResponse value) {
        return new JAXBElement<DecryptStringResponse>(_DecryptStringResponse_QNAME, DecryptStringResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncryptString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.webserver.com/", name = "encryptString")
    public JAXBElement<EncryptString> createEncryptString(EncryptString value) {
        return new JAXBElement<EncryptString>(_EncryptString_QNAME, EncryptString.class, null, value);
    }

}
