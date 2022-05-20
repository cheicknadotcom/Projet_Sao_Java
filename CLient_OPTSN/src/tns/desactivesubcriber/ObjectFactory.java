
package tns.desactivesubcriber;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tns.desactivesubcriber package. 
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

    private final static QName _SupprimerClientHlrResponse_QNAME = new QName("http://desactiveSubcriber.tns", "SupprimerClientHlrResponse");
    private final static QName _SupprimerClientHlr_QNAME = new QName("http://desactiveSubcriber.tns", "SupprimerClientHlr");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tns.desactivesubcriber
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SupprimerClientHlr }
     * 
     */
    public SupprimerClientHlr createSupprimerClientHlr() {
        return new SupprimerClientHlr();
    }

    /**
     * Create an instance of {@link SupprimerClientHlrResponse }
     * 
     */
    public SupprimerClientHlrResponse createSupprimerClientHlrResponse() {
        return new SupprimerClientHlrResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerClientHlrResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://desactiveSubcriber.tns", name = "SupprimerClientHlrResponse")
    public JAXBElement<SupprimerClientHlrResponse> createSupprimerClientHlrResponse(SupprimerClientHlrResponse value) {
        return new JAXBElement<SupprimerClientHlrResponse>(_SupprimerClientHlrResponse_QNAME, SupprimerClientHlrResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerClientHlr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://desactiveSubcriber.tns", name = "SupprimerClientHlr")
    public JAXBElement<SupprimerClientHlr> createSupprimerClientHlr(SupprimerClientHlr value) {
        return new JAXBElement<SupprimerClientHlr>(_SupprimerClientHlr_QNAME, SupprimerClientHlr.class, null, value);
    }

}
