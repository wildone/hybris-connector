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
 * <p>Java class for expressionPlaceholderDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="expressionPlaceholderDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}placeholderDTO">
 *       &lt;sequence>
 *         &lt;element name="getExpression" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="setExpression" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "expressionPlaceholderDTO", propOrder = {
    "getExpression",
    "setExpression"
})
public class ExpressionPlaceholderDTO
    extends PlaceholderDTO
{

    protected String getExpression;
    protected String setExpression;

    /**
     * Gets the value of the getExpression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetExpression() {
        return getExpression;
    }

    /**
     * Sets the value of the getExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetExpression(String value) {
        this.getExpression = value;
    }

    /**
     * Gets the value of the setExpression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetExpression() {
        return setExpression;
    }

    /**
     * Sets the value of the setExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetExpression(String value) {
        this.setExpression = value;
    }

}
