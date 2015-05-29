
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fakultas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fakultas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idFak" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="keteranganFak" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="namaFak" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fakultas", propOrder = {
    "idFak",
    "keteranganFak",
    "namaFak"
})
public class Fakultas {

    protected Integer idFak;
    protected String keteranganFak;
    protected String namaFak;

    /**
     * Gets the value of the idFak property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdFak() {
        return idFak;
    }

    /**
     * Sets the value of the idFak property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdFak(Integer value) {
        this.idFak = value;
    }

    /**
     * Gets the value of the keteranganFak property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeteranganFak() {
        return keteranganFak;
    }

    /**
     * Sets the value of the keteranganFak property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeteranganFak(String value) {
        this.keteranganFak = value;
    }

    /**
     * Gets the value of the namaFak property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamaFak() {
        return namaFak;
    }

    /**
     * Sets the value of the namaFak property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamaFak(String value) {
        this.namaFak = value;
    }

}
