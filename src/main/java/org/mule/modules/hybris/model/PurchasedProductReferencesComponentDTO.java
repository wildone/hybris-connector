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
 * <p>Java class for purchasedProductReferencesComponentDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="purchasedProductReferencesComponentDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}productReferencesComponentDTO">
 *       &lt;sequence>
 *         &lt;element ref="{}category" minOccurs="0"/>
 *         &lt;element name="filterPurchased" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "purchasedProductReferencesComponentDTO", propOrder = {
    "category",
    "filterPurchased"
})
public class PurchasedProductReferencesComponentDTO
    extends ProductReferencesComponentDTO
{

    protected CategoryDTO category;
    protected boolean filterPurchased;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryDTO }
     *     
     */
    public CategoryDTO getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryDTO }
     *     
     */
    public void setCategory(CategoryDTO value) {
        this.category = value;
    }

    /**
     * Gets the value of the filterPurchased property.
     * 
     */
    public boolean isFilterPurchased() {
        return filterPurchased;
    }

    /**
     * Sets the value of the filterPurchased property.
     * 
     */
    public void setFilterPurchased(boolean value) {
        this.filterPurchased = value;
    }

}