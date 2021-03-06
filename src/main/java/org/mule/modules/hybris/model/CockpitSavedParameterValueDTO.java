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
 * <p>Java class for cockpitSavedParameterValueDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cockpitSavedParameterValueDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}itemDTO">
 *       &lt;sequence>
 *         &lt;element name="caseSensitive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="cockpitSavedQuery" type="{}cockpitSavedQueryDTO" minOccurs="0"/>
 *         &lt;element name="languageIso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operatorQualifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parameterQualifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rawValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cockpitSavedParameterValueDTO", propOrder = {
    "caseSensitive",
    "cockpitSavedQuery",
    "languageIso",
    "operatorQualifier",
    "parameterQualifier",
    "rawValue",
    "reference"
})
public class CockpitSavedParameterValueDTO
    extends ItemDTO
{

    protected Boolean caseSensitive;
    protected CockpitSavedQueryDTO cockpitSavedQuery;
    protected String languageIso;
    protected String operatorQualifier;
    protected String parameterQualifier;
    protected String rawValue;
    protected Boolean reference;

    /**
     * Gets the value of the caseSensitive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCaseSensitive() {
        return caseSensitive;
    }

    /**
     * Sets the value of the caseSensitive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCaseSensitive(Boolean value) {
        this.caseSensitive = value;
    }

    /**
     * Gets the value of the cockpitSavedQuery property.
     * 
     * @return
     *     possible object is
     *     {@link CockpitSavedQueryDTO }
     *     
     */
    public CockpitSavedQueryDTO getCockpitSavedQuery() {
        return cockpitSavedQuery;
    }

    /**
     * Sets the value of the cockpitSavedQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link CockpitSavedQueryDTO }
     *     
     */
    public void setCockpitSavedQuery(CockpitSavedQueryDTO value) {
        this.cockpitSavedQuery = value;
    }

    /**
     * Gets the value of the languageIso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageIso() {
        return languageIso;
    }

    /**
     * Sets the value of the languageIso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageIso(String value) {
        this.languageIso = value;
    }

    /**
     * Gets the value of the operatorQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorQualifier() {
        return operatorQualifier;
    }

    /**
     * Sets the value of the operatorQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorQualifier(String value) {
        this.operatorQualifier = value;
    }

    /**
     * Gets the value of the parameterQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameterQualifier() {
        return parameterQualifier;
    }

    /**
     * Sets the value of the parameterQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameterQualifier(String value) {
        this.parameterQualifier = value;
    }

    /**
     * Gets the value of the rawValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRawValue() {
        return rawValue;
    }

    /**
     * Sets the value of the rawValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRawValue(String value) {
        this.rawValue = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReference(Boolean value) {
        this.reference = value;
    }

}
