
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for programStudi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="programStudi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idFak" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idProg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ketFak" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="namaFak" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="namaProg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "programStudi", propOrder = {
    "idFak",
    "idProg",
    "ketFak",
    "namaFak",
    "namaProg"
})
public class ProgramStudi {

    protected int idFak;
    protected Integer idProg;
    protected String ketFak;
    protected String namaFak;
    protected String namaProg;

    /**
     * Gets the value of the idFak property.
     * 
     */
    public int getIdFak() {
        return idFak;
    }

    /**
     * Sets the value of the idFak property.
     * 
     */
    public void setIdFak(int value) {
        this.idFak = value;
    }

    /**
     * Gets the value of the idProg property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdProg() {
        return idProg;
    }

    /**
     * Sets the value of the idProg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdProg(Integer value) {
        this.idProg = value;
    }

    /**
     * Gets the value of the ketFak property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKetFak() {
        return ketFak;
    }

    /**
     * Sets the value of the ketFak property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKetFak(String value) {
        this.ketFak = value;
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

    /**
     * Gets the value of the namaProg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamaProg() {
        return namaProg;
    }

    /**
     * Sets the value of the namaProg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamaProg(String value) {
        this.namaProg = value;
    }

}
