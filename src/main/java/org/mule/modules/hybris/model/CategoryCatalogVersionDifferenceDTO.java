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
 * <p>Java class for categoryCatalogVersionDifferenceDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="categoryCatalogVersionDifferenceDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}catalogVersionDifferenceDTO">
 *       &lt;sequence>
 *         &lt;element name="mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceCategory" type="{}categoryDTO" minOccurs="0"/>
 *         &lt;element name="targetCategory" type="{}categoryDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "categoryCatalogVersionDifferenceDTO", propOrder = {
    "mode",
    "sourceCategory",
    "targetCategory"
})
public class CategoryCatalogVersionDifferenceDTO
    extends CatalogVersionDifferenceDTO
{

    protected String mode;
    protected CategoryDTO sourceCategory;
    protected CategoryDTO targetCategory;

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
    }

    /**
     * Gets the value of the sourceCategory property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryDTO }
     *     
     */
    public CategoryDTO getSourceCategory() {
        return sourceCategory;
    }

    /**
     * Sets the value of the sourceCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryDTO }
     *     
     */
    public void setSourceCategory(CategoryDTO value) {
        this.sourceCategory = value;
    }

    /**
     * Gets the value of the targetCategory property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryDTO }
     *     
     */
    public CategoryDTO getTargetCategory() {
        return targetCategory;
    }

    /**
     * Sets the value of the targetCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryDTO }
     *     
     */
    public void setTargetCategory(CategoryDTO value) {
        this.targetCategory = value;
    }

}
