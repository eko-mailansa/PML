
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for opsi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="opsi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idOpsi" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="namaOpsi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "opsi", propOrder = {
    "idOpsi",
    "namaOpsi"
})
public class Opsi {

    protected Integer idOpsi;
    protected String namaOpsi;

    /**
     * Gets the value of the idOpsi property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdOpsi() {
        return idOpsi;
    }

    /**
     * Sets the value of the idOpsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdOpsi(Integer value) {
        this.idOpsi = value;
    }

    /**
     * Gets the value of the namaOpsi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamaOpsi() {
        return namaOpsi;
    }

    /**
     * Sets the value of the namaOpsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamaOpsi(String value) {
        this.namaOpsi = value;
    }

}
