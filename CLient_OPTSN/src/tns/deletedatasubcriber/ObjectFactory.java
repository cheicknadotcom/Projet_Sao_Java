
package tns.deletedatasubcriber;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tns.deletedatasubcriber package. 
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

    private final static QName _SupprimerClientGprs_QNAME = new QName("http://DeleteDataSubcriber.tns", "SupprimerClientGprs");
    private final static QName _SupprimerClientGprsResponse_QNAME = new QName("http://DeleteDataSubcriber.tns", "SupprimerClientGprsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tns.deletedatasubcriber
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SupprimerClientGprsResponse }
     * 
     */
    public SupprimerClientGprsResponse createSupprimerClientGprsResponse() {
        return new SupprimerClientGprsResponse();
    }

    /**
     * Create an instance of {@link SupprimerClientGprs }
     * 
     */
    public SupprimerClientGprs createSupprimerClientGprs() {
        return new SupprimerClientGprs();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerClientGprs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DeleteDataSubcriber.tns", name = "SupprimerClientGprs")
    public JAXBElement<SupprimerClientGprs> createSupprimerClientGprs(SupprimerClientGprs value) {
        return new JAXBElement<SupprimerClientGprs>(_SupprimerClientGprs_QNAME, SupprimerClientGprs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerClientGprsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://DeleteDataSubcriber.tns", name = "SupprimerClientGprsResponse")
    public JAXBElement<SupprimerClientGprsResponse> createSupprimerClientGprsResponse(SupprimerClientGprsResponse value) {
        return new JAXBElement<SupprimerClientGprsResponse>(_SupprimerClientGprsResponse_QNAME, SupprimerClientGprsResponse.class, null, value);
    }

}
