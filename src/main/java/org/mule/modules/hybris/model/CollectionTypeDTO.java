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
 * <p>Java class for collectionTypeDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="collectionTypeDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}typeDTO">
 *       &lt;sequence>
 *         &lt;element name="elementType" type="{}typeDTO" minOccurs="0"/>
 *         &lt;element name="typeOfCollection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "collectionTypeDTO", propOrder = {
    "elementType",
    "typeOfCollection"
})
public class CollectionTypeDTO
    extends TypeDTO
{

    protected TypeDTO elementType;
    protected String typeOfCollection;

    /**
     * Gets the value of the elementType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDTO }
     *     
     */
    public TypeDTO getElementType() {
        return elementType;
    }

    /**
     * Sets the value of the elementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDTO }
     *     
     */
    public void setElementType(TypeDTO value) {
        this.elementType = value;
    }

    /**
     * Gets the value of the typeOfCollection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfCollection() {
        return typeOfCollection;
    }

    /**
     * Sets the value of the typeOfCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfCollection(String value) {
        this.typeOfCollection = value;
    }

}
