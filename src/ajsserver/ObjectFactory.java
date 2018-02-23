
package ajsserver;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ajsserver package. 
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

    private final static QName _GetPrezencneListinyUcastnika_QNAME = new QName("http://AJSServer/", "getPrezencneListinyUcastnika");
    private final static QName _PridajUcastnikaResponse_QNAME = new QName("http://AJSServer/", "pridajUcastnikaResponse");
    private final static QName _GetPrezencneListiny_QNAME = new QName("http://AJSServer/", "getPrezencneListiny");
    private final static QName _VymazUcastnika_QNAME = new QName("http://AJSServer/", "vymazUcastnika");
    private final static QName _GetPrezencneListinyUcastnikaResponse_QNAME = new QName("http://AJSServer/", "getPrezencneListinyUcastnikaResponse");
    private final static QName _VymazUcastnikaResponse_QNAME = new QName("http://AJSServer/", "vymazUcastnikaResponse");
    private final static QName _GetUcastnikovResponse_QNAME = new QName("http://AJSServer/", "getUcastnikovResponse");
    private final static QName _GetZoznamUcastnikov_QNAME = new QName("http://AJSServer/", "getZoznamUcastnikov");
    private final static QName _PridajPredmet_QNAME = new QName("http://AJSServer/", "pridajPredmet");
    private final static QName _PridajPredmetResponse_QNAME = new QName("http://AJSServer/", "pridajPredmetResponse");
    private final static QName _GetUcastnikov_QNAME = new QName("http://AJSServer/", "getUcastnikov");
    private final static QName _GetPredmety_QNAME = new QName("http://AJSServer/", "getPredmety");
    private final static QName _PridajPrezencnuListinu_QNAME = new QName("http://AJSServer/", "pridajPrezencnuListinu");
    private final static QName _GetZoznamUcastnikovResponse_QNAME = new QName("http://AJSServer/", "getZoznamUcastnikovResponse");
    private final static QName _AjsException_QNAME = new QName("http://AJSServer/", "Ajs_Exception");
    private final static QName _GetPredmetyResponse_QNAME = new QName("http://AJSServer/", "getPredmetyResponse");
    private final static QName _GetPrezencneListinyResponse_QNAME = new QName("http://AJSServer/", "getPrezencneListinyResponse");
    private final static QName _PridajPrezencnuListinuResponse_QNAME = new QName("http://AJSServer/", "pridajPrezencnuListinuResponse");
    private final static QName _VymazPrezencnuListinuResponse_QNAME = new QName("http://AJSServer/", "vymazPrezencnuListinuResponse");
    private final static QName _PridajUcastnika_QNAME = new QName("http://AJSServer/", "pridajUcastnika");
    private final static QName _VymazPrezencnuListinu_QNAME = new QName("http://AJSServer/", "vymazPrezencnuListinu");
    private final static QName _VymazPredmet_QNAME = new QName("http://AJSServer/", "vymazPredmet");
    private final static QName _VymazPredmetResponse_QNAME = new QName("http://AJSServer/", "vymazPredmetResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ajsserver
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PridajPredmetResponse }
     * 
     */
    public PridajPredmetResponse createPridajPredmetResponse() {
        return new PridajPredmetResponse();
    }

    /**
     * Create an instance of {@link GetUcastnikov }
     * 
     */
    public GetUcastnikov createGetUcastnikov() {
        return new GetUcastnikov();
    }

    /**
     * Create an instance of {@link GetPredmety }
     * 
     */
    public GetPredmety createGetPredmety() {
        return new GetPredmety();
    }

    /**
     * Create an instance of {@link PridajPrezencnuListinu }
     * 
     */
    public PridajPrezencnuListinu createPridajPrezencnuListinu() {
        return new PridajPrezencnuListinu();
    }

    /**
     * Create an instance of {@link GetZoznamUcastnikovResponse }
     * 
     */
    public GetZoznamUcastnikovResponse createGetZoznamUcastnikovResponse() {
        return new GetZoznamUcastnikovResponse();
    }

    /**
     * Create an instance of {@link AjsException }
     * 
     */
    public AjsException createAjsException() {
        return new AjsException();
    }

    /**
     * Create an instance of {@link GetPredmetyResponse }
     * 
     */
    public GetPredmetyResponse createGetPredmetyResponse() {
        return new GetPredmetyResponse();
    }

    /**
     * Create an instance of {@link GetPrezencneListinyResponse }
     * 
     */
    public GetPrezencneListinyResponse createGetPrezencneListinyResponse() {
        return new GetPrezencneListinyResponse();
    }

    /**
     * Create an instance of {@link PridajPrezencnuListinuResponse }
     * 
     */
    public PridajPrezencnuListinuResponse createPridajPrezencnuListinuResponse() {
        return new PridajPrezencnuListinuResponse();
    }

    /**
     * Create an instance of {@link VymazPrezencnuListinuResponse }
     * 
     */
    public VymazPrezencnuListinuResponse createVymazPrezencnuListinuResponse() {
        return new VymazPrezencnuListinuResponse();
    }

    /**
     * Create an instance of {@link PridajUcastnika }
     * 
     */
    public PridajUcastnika createPridajUcastnika() {
        return new PridajUcastnika();
    }

    /**
     * Create an instance of {@link VymazPrezencnuListinu }
     * 
     */
    public VymazPrezencnuListinu createVymazPrezencnuListinu() {
        return new VymazPrezencnuListinu();
    }

    /**
     * Create an instance of {@link VymazPredmet }
     * 
     */
    public VymazPredmet createVymazPredmet() {
        return new VymazPredmet();
    }

    /**
     * Create an instance of {@link VymazPredmetResponse }
     * 
     */
    public VymazPredmetResponse createVymazPredmetResponse() {
        return new VymazPredmetResponse();
    }

    /**
     * Create an instance of {@link GetPrezencneListinyUcastnika }
     * 
     */
    public GetPrezencneListinyUcastnika createGetPrezencneListinyUcastnika() {
        return new GetPrezencneListinyUcastnika();
    }

    /**
     * Create an instance of {@link PridajUcastnikaResponse }
     * 
     */
    public PridajUcastnikaResponse createPridajUcastnikaResponse() {
        return new PridajUcastnikaResponse();
    }

    /**
     * Create an instance of {@link GetPrezencneListiny }
     * 
     */
    public GetPrezencneListiny createGetPrezencneListiny() {
        return new GetPrezencneListiny();
    }

    /**
     * Create an instance of {@link VymazUcastnika }
     * 
     */
    public VymazUcastnika createVymazUcastnika() {
        return new VymazUcastnika();
    }

    /**
     * Create an instance of {@link GetPrezencneListinyUcastnikaResponse }
     * 
     */
    public GetPrezencneListinyUcastnikaResponse createGetPrezencneListinyUcastnikaResponse() {
        return new GetPrezencneListinyUcastnikaResponse();
    }

    /**
     * Create an instance of {@link VymazUcastnikaResponse }
     * 
     */
    public VymazUcastnikaResponse createVymazUcastnikaResponse() {
        return new VymazUcastnikaResponse();
    }

    /**
     * Create an instance of {@link GetUcastnikovResponse }
     * 
     */
    public GetUcastnikovResponse createGetUcastnikovResponse() {
        return new GetUcastnikovResponse();
    }

    /**
     * Create an instance of {@link GetZoznamUcastnikov }
     * 
     */
    public GetZoznamUcastnikov createGetZoznamUcastnikov() {
        return new GetZoznamUcastnikov();
    }

    /**
     * Create an instance of {@link PridajPredmet }
     * 
     */
    public PridajPredmet createPridajPredmet() {
        return new PridajPredmet();
    }

    /**
     * Create an instance of {@link Predmet }
     * 
     */
    public Predmet createPredmet() {
        return new Predmet();
    }

    /**
     * Create an instance of {@link Ucastnik }
     * 
     */
    public Ucastnik createUcastnik() {
        return new Ucastnik();
    }

    /**
     * Create an instance of {@link PrezencnaListina }
     * 
     */
    public PrezencnaListina createPrezencnaListina() {
        return new PrezencnaListina();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPrezencneListinyUcastnika }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://AJSServer/", name = "getPrezencneListinyUcastnika")
    public JAXBElement<GetPrezencneListinyUcastnika> createGetPrezencneListinyUcastnika(GetPrezencneListinyUcastnika value) {
        return new JAXBElement<GetPrezencneListinyUcastnika>(_GetPrezencneListinyUcastnika_QNAME, GetPrezencneListinyUcastnika.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PridajUcastnikaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://AJSServer/", name = "pridajUcastnikaResponse")
    public JAXBElement<PridajUcastnikaResponse> createPridajUcastnikaResponse(PridajUcastnikaResponse value) {
        return new JAXBElement<PridajUcastnikaResponse>(_PridajUcastnikaResponse_QNAME, PridajUcastnikaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPrezencneListiny }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://AJSServer/", name = "getPrezencneListiny")
    public JAXBElement<GetPrezencneListiny> createGetPrezencneListiny(GetPrezencneListiny value) {
        return new JAXBElement<GetPrezencneListiny>(_GetPrezencneListiny_QNAME, GetPrezencneListiny.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VymazUcastnika }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://AJSServer/", name = "vymazUcastnika")
    public JAXBElement<VymazUcastnika> createVymazUcastnika(VymazUcastnika value) {
        return new JAXBElement<VymazUcastnika>(_VymazUcastnika_QNAME, VymazUcastnika.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPrezencneListinyUcastnikaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://AJSServer/", name = "getPrezencneListinyUcastnikaResponse")
    public JAXBElement<GetPrezencneListinyUcastnikaResponse> createGetPrezencneListinyUcastnikaResponse(GetPrezencneListinyUcastnikaResponse value) {
        return new JAXBElement<GetPrezencneListinyUcastnikaResponse>(_GetPrezencneListinyUcastnikaResponse_QNAME, GetPrezencneListinyUcastnikaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VymazUcastnikaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://AJSServer/", name = "vymazUcastnikaResponse")
    public JAXBElement<VymazUcastnikaResponse> createVymazUcastnikaResponse(VymazUcastnikaResponse value) {
        return new JAXBElement<VymazUcastnikaResponse>(_VymazUcastnikaResponse_QNAME, VymazUcastnikaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUcastnikovResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://AJSServer/", name = "getUcastnikovResponse")
    public JAXBElement<GetUcastnikovResponse> createGetUcastnikovResponse(GetUcastnikovResponse value) {
        return new JAXBElement<GetUcastnikovResponse>(_GetUcastnikovResponse_QNAME, GetUcastnikovResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetZoznamUcastnikov }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://AJSServer/", name = "getZoznamUcastnikov")
    public JAXBElement<GetZoznamUcastnikov> createGetZoznamUcastnikov(GetZoznamUcastnikov value) {
        return new JAXBElement<GetZoznamUcastnikov>(_GetZoznamUcastnikov_QNAME, GetZoznamUcastnikov.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PridajPredmet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://AJSServer/", name = "pridajPredmet")
    public JAXBElement<PridajPredmet> createPridajPredmet(PridajPredmet value) {
        return new JAXBElement<PridajPredmet>(_PridajPredmet_QNAME, PridajPredmet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PridajPredmetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://AJSServer/", name = "pridajPredmetResponse")
    public JAXBElement<PridajPredmetResponse> createPridajPredmetResponse(PridajPredmetResponse value) {
        return new JAXBElement<PridajPredmetResponse>(_PridajPredmetResponse_QNAME, PridajPredmetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUcastnikov }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://AJSServer/", name = "getUcastnikov")
    public JAXBElement<GetUcastnikov> createGetUcastnikov(GetUcastnikov value) {
        return new JAXBElement<GetUcastnikov>(_GetUcastnikov_QNAME, GetUcastnikov.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPredmety }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://AJSServer/", name = "getPredmety")
    public JAXBElement<GetPredmety> createGetPredmety(GetPredmety value) {
        return new JAXBElement<GetPredmety>(_GetPredmety_QNAME, GetPredmety.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PridajPrezencnuListinu }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://AJSServer/", name = "pridajPrezencnuListinu")
    public JAXBElement<PridajPrezencnuListinu> createPridajPrezencnuListinu(PridajPrezencnuListinu value) {
        return new JAXBElement<PridajPrezencnuListinu>(_PridajPrezencnuListinu_QNAME, PridajPrezencnuListinu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetZoznamUcastnikovResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://AJSServer/", name = "getZoznamUcastnikovResponse")
    public JAXBElement<GetZoznamUcastnikovResponse> createGetZoznamUcastnikovResponse(GetZoznamUcastnikovResponse value) {
        return new JAXBElement<GetZoznamUcastnikovResponse>(_GetZoznamUcastnikovResponse_QNAME, GetZoznamUcastnikovResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjsException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://AJSServer/", name = "Ajs_Exception")
    public JAXBElement<AjsException> createAjsException(AjsException value) {
        return new JAXBElement<AjsException>(_AjsException_QNAME, AjsException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPredmetyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://AJSServer/", name = "getPredmetyResponse")
    public JAXBElement<GetPredmetyResponse> createGetPredmetyResponse(GetPredmetyResponse value) {
        return new JAXBElement<GetPredmetyResponse>(_GetPredmetyResponse_QNAME, GetPredmetyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPrezencneListinyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://AJSServer/", name = "getPrezencneListinyResponse")
    public JAXBElement<GetPrezencneListinyResponse> createGetPrezencneListinyResponse(GetPrezencneListinyResponse value) {
        return new JAXBElement<GetPrezencneListinyResponse>(_GetPrezencneListinyResponse_QNAME, GetPrezencneListinyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PridajPrezencnuListinuResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://AJSServer/", name = "pridajPrezencnuListinuResponse")
    public JAXBElement<PridajPrezencnuListinuResponse> createPridajPrezencnuListinuResponse(PridajPrezencnuListinuResponse value) {
        return new JAXBElement<PridajPrezencnuListinuResponse>(_PridajPrezencnuListinuResponse_QNAME, PridajPrezencnuListinuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VymazPrezencnuListinuResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://AJSServer/", name = "vymazPrezencnuListinuResponse")
    public JAXBElement<VymazPrezencnuListinuResponse> createVymazPrezencnuListinuResponse(VymazPrezencnuListinuResponse value) {
        return new JAXBElement<VymazPrezencnuListinuResponse>(_VymazPrezencnuListinuResponse_QNAME, VymazPrezencnuListinuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PridajUcastnika }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://AJSServer/", name = "pridajUcastnika")
    public JAXBElement<PridajUcastnika> createPridajUcastnika(PridajUcastnika value) {
        return new JAXBElement<PridajUcastnika>(_PridajUcastnika_QNAME, PridajUcastnika.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VymazPrezencnuListinu }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://AJSServer/", name = "vymazPrezencnuListinu")
    public JAXBElement<VymazPrezencnuListinu> createVymazPrezencnuListinu(VymazPrezencnuListinu value) {
        return new JAXBElement<VymazPrezencnuListinu>(_VymazPrezencnuListinu_QNAME, VymazPrezencnuListinu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VymazPredmet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://AJSServer/", name = "vymazPredmet")
    public JAXBElement<VymazPredmet> createVymazPredmet(VymazPredmet value) {
        return new JAXBElement<VymazPredmet>(_VymazPredmet_QNAME, VymazPredmet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VymazPredmetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://AJSServer/", name = "vymazPredmetResponse")
    public JAXBElement<VymazPredmetResponse> createVymazPredmetResponse(VymazPredmetResponse value) {
        return new JAXBElement<VymazPredmetResponse>(_VymazPredmetResponse_QNAME, VymazPredmetResponse.class, null, value);
    }

}
