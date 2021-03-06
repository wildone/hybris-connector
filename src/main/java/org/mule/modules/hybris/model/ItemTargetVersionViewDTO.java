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
 * <p>Java class for itemTargetVersionViewDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="itemTargetVersionViewDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}itemDTO">
 *       &lt;sequence>
 *         &lt;element name="sourceItem" type="{}itemDTO" minOccurs="0"/>
 *         &lt;element name="targetItem" type="{}itemDTO" minOccurs="0"/>
 *         &lt;element name="targetVersion" type="{}catalogVersionDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemTargetVersionViewDTO", propOrder = {
    "sourceItem",
    "targetItem",
    "targetVersion"
})
public class ItemTargetVersionViewDTO
    extends ItemDTO
{

    protected ItemDTO sourceItem;
    protected ItemDTO targetItem;
    protected CatalogVersionDTO targetVersion;

    /**
     * Gets the value of the sourceItem property.
     * 
     * @return
     *     possible object is
     *     {@link ItemDTO }
     *     
     */
    public ItemDTO getSourceItem() {
        return sourceItem;
    }

    /**
     * Sets the value of the sourceItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemDTO }
     *     
     */
    public void setSourceItem(ItemDTO value) {
        this.sourceItem = value;
    }

    /**
     * Gets the value of the targetItem property.
     * 
     * @return
     *     possible object is
     *     {@link ItemDTO }
     *     
     */
    public ItemDTO getTargetItem() {
        return targetItem;
    }

    /**
     * Sets the value of the targetItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemDTO }
     *     
     */
    public void setTargetItem(ItemDTO value) {
        this.targetItem = value;
    }

    /**
     * Gets the value of the targetVersion property.
     * 
     * @return
     *     possible object is
     *     {@link CatalogVersionDTO }
     *     
     */
    public CatalogVersionDTO getTargetVersion() {
        return targetVersion;
    }

    /**
     * Sets the value of the targetVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogVersionDTO }
     *     
     */
    public void setTargetVersion(CatalogVersionDTO value) {
        this.targetVersion = value;
    }

}
