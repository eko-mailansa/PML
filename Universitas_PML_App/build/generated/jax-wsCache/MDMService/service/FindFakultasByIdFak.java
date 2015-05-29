
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for findFakultasByIdFak complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="findFakultasByIdFak">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="param" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "findFakultasByIdFak", propOrder = {
    "param"
})
public class FindFakultasByIdFak {

    protected int param;

    /**
     * Gets the value of the param property.
     * 
     */
    public int getParam() {
        return param;
    }

    /**
     * Sets the value of the param property.
     * 
     */
    public void setParam(int value) {
        this.param = value;
    }

}
