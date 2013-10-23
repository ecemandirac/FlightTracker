
package localstorage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the localstorage package. 
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

    private final static QName _GetFareResponse_QNAME = new QName("http://localStorage/", "getFareResponse");
    private final static QName _NewBookingResponse_QNAME = new QName("http://localStorage/", "newBookingResponse");
    private final static QName _GetFare_QNAME = new QName("http://localStorage/", "getFare");
    private final static QName _NewBooking_QNAME = new QName("http://localStorage/", "newBooking");
    private final static QName _GetFlights_QNAME = new QName("http://localStorage/", "getFlights");
    private final static QName _GetFlightInstancesResponse_QNAME = new QName("http://localStorage/", "getFlightInstancesResponse");
    private final static QName _GetFlightInstances_QNAME = new QName("http://localStorage/", "getFlightInstances");
    private final static QName _AddNewCustomerResponse_QNAME = new QName("http://localStorage/", "addNewCustomerResponse");
    private final static QName _GetAirportsByCity_QNAME = new QName("http://localStorage/", "getAirportsByCity");
    private final static QName _AddNewCustomer_QNAME = new QName("http://localStorage/", "addNewCustomer");
    private final static QName _GetFlightsResponse_QNAME = new QName("http://localStorage/", "getFlightsResponse");
    private final static QName _GetAirportsByCityResponse_QNAME = new QName("http://localStorage/", "getAirportsByCityResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: localstorage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAirportsByCity }
     * 
     */
    public GetAirportsByCity createGetAirportsByCity() {
        return new GetAirportsByCity();
    }

    /**
     * Create an instance of {@link AddNewCustomerResponse }
     * 
     */
    public AddNewCustomerResponse createAddNewCustomerResponse() {
        return new AddNewCustomerResponse();
    }

    /**
     * Create an instance of {@link GetAirportsByCityResponse }
     * 
     */
    public GetAirportsByCityResponse createGetAirportsByCityResponse() {
        return new GetAirportsByCityResponse();
    }

    /**
     * Create an instance of {@link GetFlightsResponse }
     * 
     */
    public GetFlightsResponse createGetFlightsResponse() {
        return new GetFlightsResponse();
    }

    /**
     * Create an instance of {@link AddNewCustomer }
     * 
     */
    public AddNewCustomer createAddNewCustomer() {
        return new AddNewCustomer();
    }

    /**
     * Create an instance of {@link NewBooking }
     * 
     */
    public NewBooking createNewBooking() {
        return new NewBooking();
    }

    /**
     * Create an instance of {@link GetFare }
     * 
     */
    public GetFare createGetFare() {
        return new GetFare();
    }

    /**
     * Create an instance of {@link GetFlights }
     * 
     */
    public GetFlights createGetFlights() {
        return new GetFlights();
    }

    /**
     * Create an instance of {@link NewBookingResponse }
     * 
     */
    public NewBookingResponse createNewBookingResponse() {
        return new NewBookingResponse();
    }

    /**
     * Create an instance of {@link GetFareResponse }
     * 
     */
    public GetFareResponse createGetFareResponse() {
        return new GetFareResponse();
    }

    /**
     * Create an instance of {@link GetFlightInstances }
     * 
     */
    public GetFlightInstances createGetFlightInstances() {
        return new GetFlightInstances();
    }

    /**
     * Create an instance of {@link GetFlightInstancesResponse }
     * 
     */
    public GetFlightInstancesResponse createGetFlightInstancesResponse() {
        return new GetFlightInstancesResponse();
    }

    /**
     * Create an instance of {@link FlightType }
     * 
     */
    public FlightType createFlightType() {
        return new FlightType();
    }

    /**
     * Create an instance of {@link FaresType }
     * 
     */
    public FaresType createFaresType() {
        return new FaresType();
    }

    /**
     * Create an instance of {@link AirportListType }
     * 
     */
    public AirportListType createAirportListType() {
        return new AirportListType();
    }

    /**
     * Create an instance of {@link FlightListType }
     * 
     */
    public FlightListType createFlightListType() {
        return new FlightListType();
    }

    /**
     * Create an instance of {@link AirportType }
     * 
     */
    public AirportType createAirportType() {
        return new AirportType();
    }

    /**
     * Create an instance of {@link FlightInstanceListType }
     * 
     */
    public FlightInstanceListType createFlightInstanceListType() {
        return new FlightInstanceListType();
    }

    /**
     * Create an instance of {@link FlightInstanceType }
     * 
     */
    public FlightInstanceType createFlightInstanceType() {
        return new FlightInstanceType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFareResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localStorage/", name = "getFareResponse")
    public JAXBElement<GetFareResponse> createGetFareResponse(GetFareResponse value) {
        return new JAXBElement<GetFareResponse>(_GetFareResponse_QNAME, GetFareResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewBookingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localStorage/", name = "newBookingResponse")
    public JAXBElement<NewBookingResponse> createNewBookingResponse(NewBookingResponse value) {
        return new JAXBElement<NewBookingResponse>(_NewBookingResponse_QNAME, NewBookingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFare }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localStorage/", name = "getFare")
    public JAXBElement<GetFare> createGetFare(GetFare value) {
        return new JAXBElement<GetFare>(_GetFare_QNAME, GetFare.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NewBooking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localStorage/", name = "newBooking")
    public JAXBElement<NewBooking> createNewBooking(NewBooking value) {
        return new JAXBElement<NewBooking>(_NewBooking_QNAME, NewBooking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlights }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localStorage/", name = "getFlights")
    public JAXBElement<GetFlights> createGetFlights(GetFlights value) {
        return new JAXBElement<GetFlights>(_GetFlights_QNAME, GetFlights.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightInstancesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localStorage/", name = "getFlightInstancesResponse")
    public JAXBElement<GetFlightInstancesResponse> createGetFlightInstancesResponse(GetFlightInstancesResponse value) {
        return new JAXBElement<GetFlightInstancesResponse>(_GetFlightInstancesResponse_QNAME, GetFlightInstancesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightInstances }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localStorage/", name = "getFlightInstances")
    public JAXBElement<GetFlightInstances> createGetFlightInstances(GetFlightInstances value) {
        return new JAXBElement<GetFlightInstances>(_GetFlightInstances_QNAME, GetFlightInstances.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewCustomerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localStorage/", name = "addNewCustomerResponse")
    public JAXBElement<AddNewCustomerResponse> createAddNewCustomerResponse(AddNewCustomerResponse value) {
        return new JAXBElement<AddNewCustomerResponse>(_AddNewCustomerResponse_QNAME, AddNewCustomerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAirportsByCity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localStorage/", name = "getAirportsByCity")
    public JAXBElement<GetAirportsByCity> createGetAirportsByCity(GetAirportsByCity value) {
        return new JAXBElement<GetAirportsByCity>(_GetAirportsByCity_QNAME, GetAirportsByCity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNewCustomer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localStorage/", name = "addNewCustomer")
    public JAXBElement<AddNewCustomer> createAddNewCustomer(AddNewCustomer value) {
        return new JAXBElement<AddNewCustomer>(_AddNewCustomer_QNAME, AddNewCustomer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localStorage/", name = "getFlightsResponse")
    public JAXBElement<GetFlightsResponse> createGetFlightsResponse(GetFlightsResponse value) {
        return new JAXBElement<GetFlightsResponse>(_GetFlightsResponse_QNAME, GetFlightsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAirportsByCityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localStorage/", name = "getAirportsByCityResponse")
    public JAXBElement<GetAirportsByCityResponse> createGetAirportsByCityResponse(GetAirportsByCityResponse value) {
        return new JAXBElement<GetAirportsByCityResponse>(_GetAirportsByCityResponse_QNAME, GetAirportsByCityResponse.class, null, value);
    }

}
