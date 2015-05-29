
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for statusBayar complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="statusBayar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idSemester" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idStatusBayar" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="jenisBayar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="jumBayar" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="noReg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="semester" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="statusAktif" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="statusAktifString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusBayar" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="statusBayarString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusDaftar" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="statusDaftarString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tahun1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tahun2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tglBayar" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tglBayarString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "statusBayar", propOrder = {
    "idSemester",
    "idStatusBayar",
    "jenisBayar",
    "jumBayar",
    "noReg",
    "semester",
    "statusAktif",
    "statusAktifString",
    "statusBayar",
    "statusBayarString",
    "statusDaftar",
    "statusDaftarString",
    "tahun1",
    "tahun2",
    "tglBayar",
    "tglBayarString"
})
public class StatusBayar {

    protected int idSemester;
    protected Integer idStatusBayar;
    protected String jenisBayar;
    protected double jumBayar;
    protected String noReg;
    protected int semester;
    protected boolean statusAktif;
    protected String statusAktifString;
    protected boolean statusBayar;
    protected String statusBayarString;
    protected boolean statusDaftar;
    protected String statusDaftarString;
    protected int tahun1;
    protected int tahun2;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tglBayar;
    protected String tglBayarString;

    /**
     * Gets the value of the idSemester property.
     * 
     */
    public int getIdSemester() {
        return idSemester;
    }

    /**
     * Sets the value of the idSemester property.
     * 
     */
    public void setIdSemester(int value) {
        this.idSemester = value;
    }

    /**
     * Gets the value of the idStatusBayar property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdStatusBayar() {
        return idStatusBayar;
    }

    /**
     * Sets the value of the idStatusBayar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdStatusBayar(Integer value) {
        this.idStatusBayar = value;
    }

    /**
     * Gets the value of the jenisBayar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJenisBayar() {
        return jenisBayar;
    }

    /**
     * Sets the value of the jenisBayar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJenisBayar(String value) {
        this.jenisBayar = value;
    }

    /**
     * Gets the value of the jumBayar property.
     * 
     */
    public double getJumBayar() {
        return jumBayar;
    }

    /**
     * Sets the value of the jumBayar property.
     * 
     */
    public void setJumBayar(double value) {
        this.jumBayar = value;
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
     * Gets the value of the statusAktif property.
     * 
     */
    public boolean isStatusAktif() {
        return statusAktif;
    }

    /**
     * Sets the value of the statusAktif property.
     * 
     */
    public void setStatusAktif(boolean value) {
        this.statusAktif = value;
    }

    /**
     * Gets the value of the statusAktifString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusAktifString() {
        return statusAktifString;
    }

    /**
     * Sets the value of the statusAktifString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusAktifString(String value) {
        this.statusAktifString = value;
    }

    /**
     * Gets the value of the statusBayar property.
     * 
     */
    public boolean isStatusBayar() {
        return statusBayar;
    }

    /**
     * Sets the value of the statusBayar property.
     * 
     */
    public void setStatusBayar(boolean value) {
        this.statusBayar = value;
    }

    /**
     * Gets the value of the statusBayarString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusBayarString() {
        return statusBayarString;
    }

    /**
     * Sets the value of the statusBayarString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusBayarString(String value) {
        this.statusBayarString = value;
    }

    /**
     * Gets the value of the statusDaftar property.
     * 
     */
    public boolean isStatusDaftar() {
        return statusDaftar;
    }

    /**
     * Sets the value of the statusDaftar property.
     * 
     */
    public void setStatusDaftar(boolean value) {
        this.statusDaftar = value;
    }

    /**
     * Gets the value of the statusDaftarString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDaftarString() {
        return statusDaftarString;
    }

    /**
     * Sets the value of the statusDaftarString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDaftarString(String value) {
        this.statusDaftarString = value;
    }

    /**
     * Gets the value of the tahun1 property.
     * 
     */
    public int getTahun1() {
        return tahun1;
    }

    /**
     * Sets the value of the tahun1 property.
     * 
     */
    public void setTahun1(int value) {
        this.tahun1 = value;
    }

    /**
     * Gets the value of the tahun2 property.
     * 
     */
    public int getTahun2() {
        return tahun2;
    }

    /**
     * Sets the value of the tahun2 property.
     * 
     */
    public void setTahun2(int value) {
        this.tahun2 = value;
    }

    /**
     * Gets the value of the tglBayar property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTglBayar() {
        return tglBayar;
    }

    /**
     * Sets the value of the tglBayar property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTglBayar(XMLGregorianCalendar value) {
        this.tglBayar = value;
    }

    /**
     * Gets the value of the tglBayarString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTglBayarString() {
        return tglBayarString;
    }

    /**
     * Sets the value of the tglBayarString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTglBayarString(String value) {
        this.tglBayarString = value;
    }

}
