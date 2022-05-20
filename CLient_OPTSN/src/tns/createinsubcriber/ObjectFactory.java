
package tns.createinsubcriber;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tns.createinsubcriber package. 
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

    private final static QName _CreerClientINResponse_QNAME = new QName("http://createINSubcriber.tns", "creerClientINResponse");
    private final static QName _CreerClientIN_QNAME = new QName("http://createINSubcriber.tns", "creerClientIN");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tns.createinsubcriber
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreerClientIN }
     * 
     */
    public CreerClientIN createCreerClientIN() {
        return new CreerClientIN();
    }

    /**
     * Create an instance of {@link CreerClientINResponse }
     * 
     */
    public CreerClientINResponse createCreerClientINResponse() {
        return new CreerClientINResponse();
    }

    /**
     * Create an instance of {@link Clients }
     * 
     */
    public Clients createClients() {
        return new Clients();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreerClientINResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://createINSubcriber.tns", name = "creerClientINResponse")
    public JAXBElement<CreerClientINResponse> createCreerClientINResponse(CreerClientINResponse value) {
        return new JAXBElement<CreerClientINResponse>(_CreerClientINResponse_QNAME, CreerClientINResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreerClientIN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://createINSubcriber.tns", name = "creerClientIN")
    public JAXBElement<CreerClientIN> createCreerClientIN(CreerClientIN value) {
        return new JAXBElement<CreerClientIN>(_CreerClientIN_QNAME, CreerClientIN.class, null, value);
    }

}
