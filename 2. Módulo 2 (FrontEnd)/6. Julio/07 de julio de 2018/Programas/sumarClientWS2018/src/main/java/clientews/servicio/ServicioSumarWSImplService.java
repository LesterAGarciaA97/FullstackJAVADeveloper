
package clientews.servicio;

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
 * JAX-WS RI 2.2.9-b14002
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ServicioSumarWSImplService", targetNamespace = "http://bean.core.ws.lestergarcia.org/", wsdlLocation = "http://HP-PAVILION:9090/ServicioSumarWSImplService/ServicioSumarWSImpl?wsdl")
public class ServicioSumarWSImplService
    extends Service
{

    private final static URL SERVICIOSUMARWSIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException SERVICIOSUMARWSIMPLSERVICE_EXCEPTION;
    private final static QName SERVICIOSUMARWSIMPLSERVICE_QNAME = new QName("http://bean.core.ws.lestergarcia.org/", "ServicioSumarWSImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://HP-PAVILION:9090/ServicioSumarWSImplService/ServicioSumarWSImpl?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICIOSUMARWSIMPLSERVICE_WSDL_LOCATION = url;
        SERVICIOSUMARWSIMPLSERVICE_EXCEPTION = e;
    }

    public ServicioSumarWSImplService() {
        super(__getWsdlLocation(), SERVICIOSUMARWSIMPLSERVICE_QNAME);
    }

    public ServicioSumarWSImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICIOSUMARWSIMPLSERVICE_QNAME, features);
    }

    public ServicioSumarWSImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICIOSUMARWSIMPLSERVICE_QNAME);
    }

    public ServicioSumarWSImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICIOSUMARWSIMPLSERVICE_QNAME, features);
    }

    public ServicioSumarWSImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServicioSumarWSImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServicioSumarWS
     */
    @WebEndpoint(name = "ServicioSumarWSImplPort")
    public ServicioSumarWS getServicioSumarWSImplPort() {
        return super.getPort(new QName("http://bean.core.ws.lestergarcia.org/", "ServicioSumarWSImplPort"), ServicioSumarWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServicioSumarWS
     */
    @WebEndpoint(name = "ServicioSumarWSImplPort")
    public ServicioSumarWS getServicioSumarWSImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://bean.core.ws.lestergarcia.org/", "ServicioSumarWSImplPort"), ServicioSumarWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICIOSUMARWSIMPLSERVICE_EXCEPTION!= null) {
            throw SERVICIOSUMARWSIMPLSERVICE_EXCEPTION;
        }
        return SERVICIOSUMARWSIMPLSERVICE_WSDL_LOCATION;
    }

}
