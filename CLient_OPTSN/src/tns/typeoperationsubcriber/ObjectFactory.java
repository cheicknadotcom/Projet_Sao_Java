
package tns.typeoperationsubcriber;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tns.typeoperationsubcriber package. 
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

    private final static QName _TypeOperation_QNAME = new QName("http://typeOperationSubcriber.tns", "TypeOperation");
    private final static QName _TypeOperationResponse_QNAME = new QName("http://typeOperationSubcriber.tns", "TypeOperationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tns.typeoperationsubcriber
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TypeOperationResponse }
     * 
     */
    public TypeOperationResponse createTypeOperationResponse() {
        return new TypeOperationResponse();
    }

    /**
     * Create an instance of {@link TypeOperation }
     * 
     */
    public TypeOperation createTypeOperation() {
        return new TypeOperation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://typeOperationSubcriber.tns", name = "TypeOperation")
    public JAXBElement<TypeOperation> createTypeOperation(TypeOperation value) {
        return new JAXBElement<TypeOperation>(_TypeOperation_QNAME, TypeOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeOperationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://typeOperationSubcriber.tns", name = "TypeOperationResponse")
    public JAXBElement<TypeOperationResponse> createTypeOperationResponse(TypeOperationResponse value) {
        return new JAXBElement<TypeOperationResponse>(_TypeOperationResponse_QNAME, TypeOperationResponse.class, null, value);
    }

}
