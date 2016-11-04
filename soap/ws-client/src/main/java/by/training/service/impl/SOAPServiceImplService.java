
package by.training.service.impl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

import by.training.service.SOAPService;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SOAPServiceImplService", targetNamespace = "http://impl.service.training.by/", wsdlLocation = "http://localhost:8081/server/soap?wsdl")
public class SOAPServiceImplService
    extends Service
{

    private final static URL SOAPSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException SOAPSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName SOAPSERVICEIMPLSERVICE_QNAME = new QName("http://impl.service.training.by/", "SOAPServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8081/server/soap?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SOAPSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        SOAPSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public SOAPServiceImplService() {
        super(__getWsdlLocation(), SOAPSERVICEIMPLSERVICE_QNAME);
    }

    public SOAPServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SOAPSERVICEIMPLSERVICE_QNAME, features);
    }

    public SOAPServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SOAPSERVICEIMPLSERVICE_QNAME);
    }

    public SOAPServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SOAPSERVICEIMPLSERVICE_QNAME, features);
    }

    public SOAPServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SOAPServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SOAPService
     */
    @WebEndpoint(name = "SOAPServiceImplPort")
    public SOAPService getSOAPServiceImplPort() {
        return super.getPort(new QName("http://impl.service.training.by/", "SOAPServiceImplPort"), SOAPService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SOAPService
     */
    @WebEndpoint(name = "SOAPServiceImplPort")
    public SOAPService getSOAPServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://impl.service.training.by/", "SOAPServiceImplPort"), SOAPService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SOAPSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw SOAPSERVICEIMPLSERVICE_EXCEPTION;
        }
        return SOAPSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}