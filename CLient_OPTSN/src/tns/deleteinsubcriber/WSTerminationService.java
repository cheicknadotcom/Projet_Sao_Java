
package tns.deleteinsubcriber;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WSTerminationService", targetNamespace = "http://deleteInSubcriber.tns", wsdlLocation = "http://localhost:8282/services/WSTermination?wsdl")
public class WSTerminationService
    extends Service
{

    private final static URL WSTERMINATIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException WSTERMINATIONSERVICE_EXCEPTION;
    private final static QName WSTERMINATIONSERVICE_QNAME = new QName("http://deleteInSubcriber.tns", "WSTerminationService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8282/services/WSTermination?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSTERMINATIONSERVICE_WSDL_LOCATION = url;
        WSTERMINATIONSERVICE_EXCEPTION = e;
    }

    public WSTerminationService() {
        super(__getWsdlLocation(), WSTERMINATIONSERVICE_QNAME);
    }

    public WSTerminationService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSTERMINATIONSERVICE_QNAME, features);
    }

    public WSTerminationService(URL wsdlLocation) {
        super(wsdlLocation, WSTERMINATIONSERVICE_QNAME);
    }

    public WSTerminationService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSTERMINATIONSERVICE_QNAME, features);
    }

    public WSTerminationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSTerminationService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WSTermination
     */
    @WebEndpoint(name = "WSTerminationPort")
    public WSTermination getWSTerminationPort() {
        return super.getPort(new QName("http://deleteInSubcriber.tns", "WSTerminationPort"), WSTermination.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSTermination
     */
    @WebEndpoint(name = "WSTerminationPort")
    public WSTermination getWSTerminationPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://deleteInSubcriber.tns", "WSTerminationPort"), WSTermination.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSTERMINATIONSERVICE_EXCEPTION!= null) {
            throw WSTERMINATIONSERVICE_EXCEPTION;
        }
        return WSTERMINATIONSERVICE_WSDL_LOCATION;
    }

}
