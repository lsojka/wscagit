
package org.ponyman.ca;

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
@WebServiceClient(name = "CaPublisherService", targetNamespace = "http://ca.ponyman.org/", wsdlLocation = "http://192.168.117.213:8080/Testservice/CaPublisherService?wsdl")
public class CaPublisherService
    extends Service
{

    private final static URL CAPUBLISHERSERVICE_WSDL_LOCATION;
    private final static WebServiceException CAPUBLISHERSERVICE_EXCEPTION;
    private final static QName CAPUBLISHERSERVICE_QNAME = new QName("http://ca.ponyman.org/", "CaPublisherService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.117.213:8080/Testservice/CaPublisherService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CAPUBLISHERSERVICE_WSDL_LOCATION = url;
        CAPUBLISHERSERVICE_EXCEPTION = e;
    }

    public CaPublisherService() {
        super(__getWsdlLocation(), CAPUBLISHERSERVICE_QNAME);
    }

    public CaPublisherService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CAPUBLISHERSERVICE_QNAME, features);
    }

    public CaPublisherService(URL wsdlLocation) {
        super(wsdlLocation, CAPUBLISHERSERVICE_QNAME);
    }

    public CaPublisherService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CAPUBLISHERSERVICE_QNAME, features);
    }

    public CaPublisherService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CaPublisherService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CaPublisher
     */
    @WebEndpoint(name = "CaPublisherPort")
    public CaPublisher getCaPublisherPort() {
        return super.getPort(new QName("http://ca.ponyman.org/", "CaPublisherPort"), CaPublisher.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CaPublisher
     */
    @WebEndpoint(name = "CaPublisherPort")
    public CaPublisher getCaPublisherPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ca.ponyman.org/", "CaPublisherPort"), CaPublisher.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CAPUBLISHERSERVICE_EXCEPTION!= null) {
            throw CAPUBLISHERSERVICE_EXCEPTION;
        }
        return CAPUBLISHERSERVICE_WSDL_LOCATION;
    }

}
