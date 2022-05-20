
package tns.createdatasubcriber;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tns.createdatasubcriber package. 
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

    private final static QName _CreerClientgprs_QNAME = new QName("http://createDataSubcriber.tns", "creerClientgprs");
    private final static QName _CreerClientgprsResponse_QNAME = new QName("http://createDataSubcriber.tns", "creerClientgprsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tns.createdatasubcriber
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreerClientgprs }
     * 
     */
    public CreerClientgprs createCreerClientgprs() {
        return new CreerClientgprs();
    }

    /**
     * Create an instance of {@link CreerClientgprsResponse }
     * 
     */
    public CreerClientgprsResponse createCreerClientgprsResponse() {
        return new CreerClientgprsResponse();
    }

    /**
     * Create an instance of {@link Clients }
     * 
     */
    public Clients createClients() {
        return new Clients();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreerClientgprs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://createDataSubcriber.tns", name = "creerClientgprs")
    public JAXBElement<CreerClientgprs> createCreerClientgprs(CreerClientgprs value) {
        return new JAXBElement<CreerClientgprs>(_CreerClientgprs_QNAME, CreerClientgprs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreerClientgprsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://createDataSubcriber.tns", name = "creerClientgprsResponse")
    public JAXBElement<CreerClientgprsResponse> createCreerClientgprsResponse(CreerClientgprsResponse value) {
        return new JAXBElement<CreerClientgprsResponse>(_CreerClientgprsResponse_QNAME, CreerClientgprsResponse.class, null, value);
    }

}
