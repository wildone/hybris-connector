//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.29 at 12:35:53 PM GMT 
//


package org.mule.modules.hybris.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mapTypeDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mapTypeDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}typeDTO">
 *       &lt;sequence>
 *         &lt;element name="argumentType" type="{}typeDTO" minOccurs="0"/>
 *         &lt;element name="returntype" type="{}typeDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mapTypeDTO", propOrder = {
    "argumentType",
    "returntype"
})
public class MapTypeDTO
    extends TypeDTO
{

    protected TypeDTO argumentType;
    protected TypeDTO returntype;

    /**
     * Gets the value of the argumentType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDTO }
     *     
     */
    public TypeDTO getArgumentType() {
        return argumentType;
    }

    /**
     * Sets the value of the argumentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDTO }
     *     
     */
    public void setArgumentType(TypeDTO value) {
        this.argumentType = value;
    }

    /**
     * Gets the value of the returntype property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDTO }
     *     
     */
    public TypeDTO getReturntype() {
        return returntype;
    }

    /**
     * Sets the value of the returntype property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDTO }
     *     
     */
    public void setReturntype(TypeDTO value) {
        this.returntype = value;
    }

}
