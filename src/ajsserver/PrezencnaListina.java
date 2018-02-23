
package ajsserver;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for prezencnaListina complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="prezencnaListina">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datumACas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ucastnici" type="{http://AJSServer/}ucastnik" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uuidPredmetu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prezencnaListina", propOrder = {
    "datumACas",
    "ucastnici",
    "uuid",
    "uuidPredmetu"
})
public class PrezencnaListina {

    protected String datumACas;
    @XmlElement(nillable = true)
    protected List<Ucastnik> ucastnici;
    protected String uuid;
    protected String uuidPredmetu;

    /**
     * Gets the value of the datumACas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatumACas() {
        return datumACas;
    }

    /**
     * Sets the value of the datumACas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatumACas(String value) {
        this.datumACas = value;
    }

    /**
     * Gets the value of the ucastnici property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ucastnici property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUcastnici().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ucastnik }
     * 
     * 
     */
    public List<Ucastnik> getUcastnici() {
        if (ucastnici == null) {
            ucastnici = new ArrayList<Ucastnik>();
        }
        return this.ucastnici;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the uuidPredmetu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuidPredmetu() {
        return uuidPredmetu;
    }

    /**
     * Sets the value of the uuidPredmetu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuidPredmetu(String value) {
        this.uuidPredmetu = value;
    }

}
