
package tns.createdatasubcriber;

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
@WebServiceClient(name = "WSCreateNetworkService", targetNamespace = "http://createDataSubcriber.tns", wsdlLocation = "http://localhost:8284/services/WSCreateNetwork?wsdl")
public class WSCreateNetworkService
    extends Service
{

    private final static URL WSCREATENETWORKSERVICE_WSDL_LOCATION;
    private final static WebServiceException WSCREATENETWORKSERVICE_EXCEPTION;
    private final static QName WSCREATENETWORKSERVICE_QNAME = new QName("http://createDataSubcriber.tns", "WSCreateNetworkService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8284/services/WSCreateNetwork?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSCREATENETWORKSERVICE_WSDL_LOCATION = url;
        WSCREATENETWORKSERVICE_EXCEPTION = e;
    }

    public WSCreateNetworkService() {
        super(__getWsdlLocation(), WSCREATENETWORKSERVICE_QNAME);
    }

    public WSCreateNetworkService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSCREATENETWORKSERVICE_QNAME, features);
    }

    public WSCreateNetworkService(URL wsdlLocation) {
        super(wsdlLocation, WSCREATENETWORKSERVICE_QNAME);
    }

    public WSCreateNetworkService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSCREATENETWORKSERVICE_QNAME, features);
    }

    public WSCreateNetworkService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSCreateNetworkService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WSCreateNetwork
     */
    @WebEndpoint(name = "WSCreateNetworkPort")
    public WSCreateNetwork getWSCreateNetworkPort() {
        return super.getPort(new QName("http://createDataSubcriber.tns", "WSCreateNetworkPort"), WSCreateNetwork.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSCreateNetwork
     */
    @WebEndpoint(name = "WSCreateNetworkPort")
    public WSCreateNetwork getWSCreateNetworkPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://createDataSubcriber.tns", "WSCreateNetworkPort"), WSCreateNetwork.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSCREATENETWORKSERVICE_EXCEPTION!= null) {
            throw WSCREATENETWORKSERVICE_EXCEPTION;
        }
        return WSCREATENETWORKSERVICE_WSDL_LOCATION;
    }

}
