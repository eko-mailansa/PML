
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for semester complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="semester">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idSemester" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="semester" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tahun1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tahun2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "semester", propOrder = {
    "idSemester",
    "semester",
    "tahun1",
    "tahun2"
})
public class Semester {

    protected Integer idSemester;
    protected int semester;
    protected int tahun1;
    protected int tahun2;

    /**
     * Gets the value of the idSemester property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSemester() {
        return idSemester;
    }

    /**
     * Sets the value of the idSemester property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSemester(Integer value) {
        this.idSemester = value;
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

}
