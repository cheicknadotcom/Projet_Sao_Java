
package tns.createdatasubcriber;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour creerClientgprs complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="creerClientgprs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Clients" type="{http://createDataSubcriber.tns}clients" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creerClientgprs", propOrder = {
    "clients"
})
public class CreerClientgprs {

    @XmlElement(name = "Clients")
    protected Clients clients;

    /**
     * Obtient la valeur de la propriété clients.
     * 
     * @return
     *     possible object is
     *     {@link Clients }
     *     
     */
    public Clients getClients() {
        return clients;
    }

    /**
     * Définit la valeur de la propriété clients.
     * 
     * @param value
     *     allowed object is
     *     {@link Clients }
     *     
     */
    public void setClients(Clients value) {
        this.clients = value;
    }

}
