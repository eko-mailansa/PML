
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mataKuliah complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mataKuliah">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idMK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idProg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="jumBangku" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="jumKelas" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="namaMK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noUrut" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="opsi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opsiString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prasyarat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="semester" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="silabus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sks" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mataKuliah", propOrder = {
    "idMK",
    "idProg",
    "jumBangku",
    "jumKelas",
    "namaMK",
    "noUrut",
    "opsi",
    "opsiString",
    "prasyarat",
    "semester",
    "silabus",
    "sks"
})
public class MataKuliah {

    protected String idMK;
    protected int idProg;
    protected int jumBangku;
    protected int jumKelas;
    protected String namaMK;
    protected int noUrut;
    protected String opsi;
    protected String opsiString;
    protected String prasyarat;
    protected int semester;
    protected String silabus;
    protected int sks;

    /**
     * Gets the value of the idMK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdMK() {
        return idMK;
    }

    /**
     * Sets the value of the idMK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdMK(String value) {
        this.idMK = value;
    }

    /**
     * Gets the value of the idProg property.
     * 
     */
    public int getIdProg() {
        return idProg;
    }

    /**
     * Sets the value of the idProg property.
     * 
     */
    public void setIdProg(int value) {
        this.idProg = value;
    }

    /**
     * Gets the value of the jumBangku property.
     * 
     */
    public int getJumBangku() {
        return jumBangku;
    }

    /**
     * Sets the value of the jumBangku property.
     * 
     */
    public void setJumBangku(int value) {
        this.jumBangku = value;
    }

    /**
     * Gets the value of the jumKelas property.
     * 
     */
    public int getJumKelas() {
        return jumKelas;
    }

    /**
     * Sets the value of the jumKelas property.
     * 
     */
    public void setJumKelas(int value) {
        this.jumKelas = value;
    }

    /**
     * Gets the value of the namaMK property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamaMK() {
        return namaMK;
    }

    /**
     * Sets the value of the namaMK property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamaMK(String value) {
        this.namaMK = value;
    }

    /**
     * Gets the value of the noUrut property.
     * 
     */
    public int getNoUrut() {
        return noUrut;
    }

    /**
     * Sets the value of the noUrut property.
     * 
     */
    public void setNoUrut(int value) {
        this.noUrut = value;
    }

    /**
     * Gets the value of the opsi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpsi() {
        return opsi;
    }

    /**
     * Sets the value of the opsi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpsi(String value) {
        this.opsi = value;
    }

    /**
     * Gets the value of the opsiString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpsiString() {
        return opsiString;
    }

    /**
     * Sets the value of the opsiString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpsiString(String value) {
        this.opsiString = value;
    }

    /**
     * Gets the value of the prasyarat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrasyarat() {
        return prasyarat;
    }

    /**
     * Sets the value of the prasyarat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrasyarat(String value) {
        this.prasyarat = value;
    }

    /**
     * Gets the value of the semester property.
     * 
     */
    public int getSemester() {
        return semester;
    }

    /**
     * Sets the value of the semester property.
     * 
     */
    public void setSemester(int value) {
        this.semester = value;
    }

    /**
     * Gets the value of the silabus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSilabus() {
        return silabus;
    }

    /**
     * Sets the value of the silabus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSilabus(String value) {
        this.silabus = value;
    }

    /**
     * Gets the value of the sks property.
     * 
     */
    public int getSks() {
        return sks;
    }

    /**
     * Sets the value of the sks property.
     * 
     */
    public void setSks(int value) {
        this.sks = value;
    }

}
