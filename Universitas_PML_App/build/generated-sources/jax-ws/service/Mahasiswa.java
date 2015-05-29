
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mahasiswa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mahasiswa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alamat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idProg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="kodePos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="namaMahasiswa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nim" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noReg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mahasiswa", propOrder = {
    "alamat",
    "idProg",
    "kodePos",
    "namaMahasiswa",
    "nim",
    "noReg"
})
public class Mahasiswa {

    protected String alamat;
    protected int idProg;
    protected String kodePos;
    protected String namaMahasiswa;
    protected String nim;
    protected String noReg;

    /**
     * Gets the value of the alamat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * Sets the value of the alamat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlamat(String value) {
        this.alamat = value;
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
     * Gets the value of the kodePos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodePos() {
        return kodePos;
    }

    /**
     * Sets the value of the kodePos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodePos(String value) {
        this.kodePos = value;
    }

    /**
     * Gets the value of the namaMahasiswa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamaMahasiswa() {
        return namaMahasiswa;
    }

    /**
     * Sets the value of the namaMahasiswa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamaMahasiswa(String value) {
        this.namaMahasiswa = value;
    }

    /**
     * Gets the value of the nim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNim() {
        return nim;
    }

    /**
     * Sets the value of the nim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNim(String value) {
        this.nim = value;
    }

    /**
     * Gets the value of the noReg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoReg() {
        return noReg;
    }

    /**
     * Sets the value of the noReg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoReg(String value) {
        this.noReg = value;
    }

}
