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
 * <p>Java class for indexTestItemDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="indexTestItemDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}itemDTO">
 *       &lt;sequence>
 *         &lt;element name="column1" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="column2" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="column3" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="column4" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="column5" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "indexTestItemDTO", propOrder = {
    "column1",
    "column2",
    "column3",
    "column4",
    "column5"
})
public class IndexTestItemDTO
    extends ItemDTO
{

    protected Short column1;
    protected Short column2;
    protected Short column3;
    protected Short column4;
    protected Short column5;

    /**
     * Gets the value of the column1 property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getColumn1() {
        return column1;
    }

    /**
     * Sets the value of the column1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setColumn1(Short value) {
        this.column1 = value;
    }

    /**
     * Gets the value of the column2 property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getColumn2() {
        return column2;
    }

    /**
     * Sets the value of the column2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setColumn2(Short value) {
        this.column2 = value;
    }

    /**
     * Gets the value of the column3 property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getColumn3() {
        return column3;
    }

    /**
     * Sets the value of the column3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setColumn3(Short value) {
        this.column3 = value;
    }

    /**
     * Gets the value of the column4 property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getColumn4() {
        return column4;
    }

    /**
     * Sets the value of the column4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setColumn4(Short value) {
        this.column4 = value;
    }

    /**
     * Gets the value of the column5 property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getColumn5() {
        return column5;
    }

    /**
     * Sets the value of the column5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setColumn5(Short value) {
        this.column5 = value;
    }

}