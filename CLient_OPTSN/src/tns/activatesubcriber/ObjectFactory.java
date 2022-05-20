
package tns.activatesubcriber;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tns.activatesubcriber package. 
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

    private final static QName _CreerClientHLR_QNAME = new QName("http://activateSubcriber.tns", "CreerClientHLR");
    private final static QName _CreerClientHLRResponse_QNAME = new QName("http://activateSubcriber.tns", "CreerClientHLRResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tns.activatesubcriber
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreerClientHLR }
     * 
     */
    public CreerClientHLR createCreerClientHLR() {
        return new CreerClientHLR();
    }

    /**
     * Create an instance of {@link CreerClientHLRResponse }
     * 
     */
    public CreerClientHLRResponse createCreerClientHLRResponse() {
        return new CreerClientHLRResponse();
    }

    /**
     * Create an instance of {@link Clients }
     * 
     */
    public Clients createClients() {
        return new Clients();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreerClientHLR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activateSubcriber.tns", name = "CreerClientHLR")
    public JAXBElement<CreerClientHLR> createCreerClientHLR(CreerClientHLR value) {
        return new JAXBElement<CreerClientHLR>(_CreerClientHLR_QNAME, CreerClientHLR.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreerClientHLRResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://activateSubcriber.tns", name = "CreerClientHLRResponse")
    public JAXBElement<CreerClientHLRResponse> createCreerClientHLRResponse(CreerClientHLRResponse value) {
        return new JAXBElement<CreerClientHLRResponse>(_CreerClientHLRResponse_QNAME, CreerClientHLRResponse.class, null, value);
    }

}
