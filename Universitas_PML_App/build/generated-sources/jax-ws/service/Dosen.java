
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dosen complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dosen">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="namaDosen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="peran" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dosen", propOrder = {
    "namaDosen",
    "nip",
    "peran"
})
public class Dosen {

    protected String namaDosen;
    protected String nip;
    protected int peran;

    /**
     * Gets the value of the namaDosen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamaDosen() {
        return namaDosen;
    }

    /**
     * Sets the value of the namaDosen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamaDosen(String value) {
        this.namaDosen = value;
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
     * Gets the value of the peran property.
     * 
     */
    public int getPeran() {
        return peran;
    }

    /**
     * Sets the value of the peran property.
     * 
     */
    public void setPeran(int value) {
        this.peran = value;
    }

}
