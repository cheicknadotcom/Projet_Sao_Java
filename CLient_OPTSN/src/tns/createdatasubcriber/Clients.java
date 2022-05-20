
package tns.createdatasubcriber;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour clients complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="clients">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activedata" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="appels" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hotline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="listeService" type="{http://createDataSubcriber.tns}serviceActive" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="numeroTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="renvoiappel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roaming" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clients", propOrder = {
    "activedata",
    "appels",
    "date",
    "hotline",
    "id",
    "listeService",
    "numeroTel",
    "renvoiappel",
    "roaming",
    "sms"
})
public class Clients {

    protected boolean activedata;
    protected String appels;
    protected String date;
    protected String hotline;
    protected int id;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "string")
    protected List<ServiceActive> listeService;
    protected String numeroTel;
    protected String renvoiappel;
    protected String roaming;
    protected String sms;

    /**
     * Obtient la valeur de la propriété activedata.
     * 
     */
    public boolean isActivedata() {
        return activedata;
    }

    /**
     * Définit la valeur de la propriété activedata.
     * 
     */
    public void setActivedata(boolean value) {
        this.activedata = value;
    }

    /**
     * Obtient la valeur de la propriété appels.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppels() {
        return appels;
    }

    /**
     * Définit la valeur de la propriété appels.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppels(String value) {
        this.appels = value;
    }

    /**
     * Obtient la valeur de la propriété date.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Définit la valeur de la propriété date.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Obtient la valeur de la propriété hotline.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotline() {
        return hotline;
    }

    /**
     * Définit la valeur de la propriété hotline.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotline(String value) {
        this.hotline = value;
    }

    /**
     * Obtient la valeur de la propriété id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the listeService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listeService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListeService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceActive }
     * 
     * 
     */
    public List<ServiceActive> getListeService() {
        if (listeService == null) {
            listeService = new ArrayList<ServiceActive>();
        }
        return this.listeService;
    }

    /**
     * Obtient la valeur de la propriété numeroTel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroTel() {
        return numeroTel;
    }

    /**
     * Définit la valeur de la propriété numeroTel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroTel(String value) {
        this.numeroTel = value;
    }

    /**
     * Obtient la valeur de la propriété renvoiappel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenvoiappel() {
        return renvoiappel;
    }

    /**
     * Définit la valeur de la propriété renvoiappel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenvoiappel(String value) {
        this.renvoiappel = value;
    }

    /**
     * Obtient la valeur de la propriété roaming.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoaming() {
        return roaming;
    }

    /**
     * Définit la valeur de la propriété roaming.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoaming(String value) {
        this.roaming = value;
    }

    /**
     * Obtient la valeur de la propriété sms.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSms() {
        return sms;
    }

    /**
     * Définit la valeur de la propriété sms.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSms(String value) {
        this.sms = value;
    }

}
