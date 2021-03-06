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
 * <p>Java class for hyend2PrecedenceRuleDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hyend2PrecedenceRuleDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}hyend2AbstractItemDTO">
 *       &lt;sequence>
 *         &lt;element name="dimensionValueItem" type="{}itemDTO" minOccurs="0"/>
 *         &lt;element name="dimensionValueString" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fromDimension" type="{}hyend2DimensionDTO" minOccurs="0"/>
 *         &lt;element name="indexSchema" type="{}hyend2IndexSchemaDTO" minOccurs="0"/>
 *         &lt;element name="ruleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="to" type="{}hyend2DimensionDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hyend2PrecedenceRuleDTO", propOrder = {
    "dimensionValueItem",
    "dimensionValueString",
    "fromDimension",
    "indexSchema",
    "ruleType",
    "to"
})
public class Hyend2PrecedenceRuleDTO
    extends Hyend2AbstractItemDTO
{

    protected ItemDTO dimensionValueItem;
    protected String dimensionValueString;
    protected Hyend2DimensionDTO fromDimension;
    protected Hyend2IndexSchemaDTO indexSchema;
    protected String ruleType;
    protected Hyend2DimensionDTO to;

    /**
     * Gets the value of the dimensionValueItem property.
     * 
     * @return
     *     possible object is
     *     {@link ItemDTO }
     *     
     */
    public ItemDTO getDimensionValueItem() {
        return dimensionValueItem;
    }

    /**
     * Sets the value of the dimensionValueItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemDTO }
     *     
     */
    public void setDimensionValueItem(ItemDTO value) {
        this.dimensionValueItem = value;
    }

    /**
     * Gets the value of the dimensionValueString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimensionValueString() {
        return dimensionValueString;
    }

    /**
     * Sets the value of the dimensionValueString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimensionValueString(String value) {
        this.dimensionValueString = value;
    }

    /**
     * Gets the value of the fromDimension property.
     * 
     * @return
     *     possible object is
     *     {@link Hyend2DimensionDTO }
     *     
     */
    public Hyend2DimensionDTO getFromDimension() {
        return fromDimension;
    }

    /**
     * Sets the value of the fromDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Hyend2DimensionDTO }
     *     
     */
    public void setFromDimension(Hyend2DimensionDTO value) {
        this.fromDimension = value;
    }

    /**
     * Gets the value of the indexSchema property.
     * 
     * @return
     *     possible object is
     *     {@link Hyend2IndexSchemaDTO }
     *     
     */
    public Hyend2IndexSchemaDTO getIndexSchema() {
        return indexSchema;
    }

    /**
     * Sets the value of the indexSchema property.
     * 
     * @param value
     *     allowed object is
     *     {@link Hyend2IndexSchemaDTO }
     *     
     */
    public void setIndexSchema(Hyend2IndexSchemaDTO value) {
        this.indexSchema = value;
    }

    /**
     * Gets the value of the ruleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleType() {
        return ruleType;
    }

    /**
     * Sets the value of the ruleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleType(String value) {
        this.ruleType = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link Hyend2DimensionDTO }
     *     
     */
    public Hyend2DimensionDTO getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link Hyend2DimensionDTO }
     *     
     */
    public void setTo(Hyend2DimensionDTO value) {
        this.to = value;
    }

}
