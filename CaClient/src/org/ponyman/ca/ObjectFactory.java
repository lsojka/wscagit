
package org.ponyman.ca;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.ponyman.ca package. 
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

    private final static QName _GetCaDataResponse_QNAME = new QName("http://ca.ponyman.org/", "getCaDataResponse");
    private final static QName _GetCaData_QNAME = new QName("http://ca.ponyman.org/", "getCaData");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.ponyman.ca
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCaData }
     * 
     */
    public GetCaData createGetCaData() {
        return new GetCaData();
    }

    /**
     * Create an instance of {@link GetCaDataResponse }
     * 
     */
    public GetCaDataResponse createGetCaDataResponse() {
        return new GetCaDataResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCaDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ca.ponyman.org/", name = "getCaDataResponse")
    public JAXBElement<GetCaDataResponse> createGetCaDataResponse(GetCaDataResponse value) {
        return new JAXBElement<GetCaDataResponse>(_GetCaDataResponse_QNAME, GetCaDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCaData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ca.ponyman.org/", name = "getCaData")
    public JAXBElement<GetCaData> createGetCaData(GetCaData value) {
        return new JAXBElement<GetCaData>(_GetCaData_QNAME, GetCaData.class, null, value);
    }

}
