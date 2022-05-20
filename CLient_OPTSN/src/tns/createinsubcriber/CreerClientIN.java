
package tns.createinsubcriber;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour creerClientIN complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="creerClientIN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Clients" type="{http://createINSubcriber.tns}clients" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creerClientIN", propOrder = {
    "clients"
})
public class CreerClientIN {

    @XmlElement(name = "Clients")
    protected Clients clients;

    /**
     * Obtient la valeur de la propri�t� clients.
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
     * D�finit la valeur de la propri�t� clients.
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
