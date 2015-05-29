
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dosenWali complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dosenWali">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idWali" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="nip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noreg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dosenWali", propOrder = {
    "idWali",
    "nip",
    "noreg"
})
public class DosenWali {

    protected Integer idWali;
    protected String nip;
    protected String noreg;

    /**
     * Gets the value of the idWali property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdWali() {
        return idWali;
    }

    /**
     * Sets the value of the idWali property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdWali(Integer value) {
        this.idWali = value;
    }

    /**
     * Gets the value of the nip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNip() {
        return nip;
    }

    /**
     * Sets the value of the nip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNip(String value) {
        this.nip = value;
    }

    /**
     * Gets the value of the noreg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoreg() {
        return noreg;
    }

    /**
     * Sets the value of the noreg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoreg(String value) {
        this.noreg = value;
    }

}
