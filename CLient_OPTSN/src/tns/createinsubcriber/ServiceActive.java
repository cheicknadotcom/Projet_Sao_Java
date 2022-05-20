
package tns.createinsubcriber;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour serviceActive.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="serviceActive">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="HOTLINE"/>
 *     &lt;enumeration value="RENVOIAPPEL"/>
 *     &lt;enumeration value="ROAMING"/>
 *     &lt;enumeration value="APPEL"/>
 *     &lt;enumeration value="DATA"/>
 *     &lt;enumeration value="NON"/>
 *     &lt;enumeration value="SMS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "serviceActive")
@XmlEnum
public enum ServiceActive {

    HOTLINE,
    RENVOIAPPEL,
    ROAMING,
    APPEL,
    DATA,
    NON,
    SMS;

    public String value() {
        return name();
    }

    public static ServiceActive fromValue(String v) {
        return valueOf(v);
    }

}
