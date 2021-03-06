//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.29 at 12:35:53 PM GMT 
//


package org.mule.modules.hybris.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hyend2CasEacConfigurationDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hyend2CasEacConfigurationDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}hyend2AbstractItemDTO">
 *       &lt;sequence>
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="autoBaseline" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="availableLanguages" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}language" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="casAppName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="casHost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="casPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="eacAppName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eacHost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eacPort" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="indexSchemas" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="hyend2IndexSchema" type="{}hyend2IndexSchemaDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hyend2CasEacConfigurationDTO", propOrder = {
    "active",
    "autoBaseline",
    "availableLanguages",
    "casAppName",
    "casHost",
    "casPort",
    "eacAppName",
    "eacHost",
    "eacPort",
    "indexSchemas",
    "name"
})
public class Hyend2CasEacConfigurationDTO
    extends Hyend2AbstractItemDTO
{

    protected Boolean active;
    protected Boolean autoBaseline;
    protected Hyend2CasEacConfigurationDTO.AvailableLanguages availableLanguages;
    protected String casAppName;
    protected String casHost;
    protected Integer casPort;
    protected String eacAppName;
    protected String eacHost;
    protected Integer eacPort;
    protected Hyend2CasEacConfigurationDTO.IndexSchemas indexSchemas;
    protected String name;

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActive(Boolean value) {
        this.active = value;
    }

    /**
     * Gets the value of the autoBaseline property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoBaseline() {
        return autoBaseline;
    }

    /**
     * Sets the value of the autoBaseline property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoBaseline(Boolean value) {
        this.autoBaseline = value;
    }

    /**
     * Gets the value of the availableLanguages property.
     * 
     * @return
     *     possible object is
     *     {@link Hyend2CasEacConfigurationDTO.AvailableLanguages }
     *     
     */
    public Hyend2CasEacConfigurationDTO.AvailableLanguages getAvailableLanguages() {
        return availableLanguages;
    }

    /**
     * Sets the value of the availableLanguages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Hyend2CasEacConfigurationDTO.AvailableLanguages }
     *     
     */
    public void setAvailableLanguages(Hyend2CasEacConfigurationDTO.AvailableLanguages value) {
        this.availableLanguages = value;
    }

    /**
     * Gets the value of the casAppName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCasAppName() {
        return casAppName;
    }

    /**
     * Sets the value of the casAppName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCasAppName(String value) {
        this.casAppName = value;
    }

    /**
     * Gets the value of the casHost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCasHost() {
        return casHost;
    }

    /**
     * Sets the value of the casHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCasHost(String value) {
        this.casHost = value;
    }

    /**
     * Gets the value of the casPort property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCasPort() {
        return casPort;
    }

    /**
     * Sets the value of the casPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCasPort(Integer value) {
        this.casPort = value;
    }

    /**
     * Gets the value of the eacAppName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEacAppName() {
        return eacAppName;
    }

    /**
     * Sets the value of the eacAppName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEacAppName(String value) {
        this.eacAppName = value;
    }

    /**
     * Gets the value of the eacHost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEacHost() {
        return eacHost;
    }

    /**
     * Sets the value of the eacHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEacHost(String value) {
        this.eacHost = value;
    }

    /**
     * Gets the value of the eacPort property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEacPort() {
        return eacPort;
    }

    /**
     * Sets the value of the eacPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEacPort(Integer value) {
        this.eacPort = value;
    }

    /**
     * Gets the value of the indexSchemas property.
     * 
     * @return
     *     possible object is
     *     {@link Hyend2CasEacConfigurationDTO.IndexSchemas }
     *     
     */
    public Hyend2CasEacConfigurationDTO.IndexSchemas getIndexSchemas() {
        return indexSchemas;
    }

    /**
     * Sets the value of the indexSchemas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Hyend2CasEacConfigurationDTO.IndexSchemas }
     *     
     */
    public void setIndexSchemas(Hyend2CasEacConfigurationDTO.IndexSchemas value) {
        this.indexSchemas = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{}language" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "language"
    })
    public static class AvailableLanguages {

        protected List<LanguageDTO> language;

        /**
         * Gets the value of the language property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the language property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLanguage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LanguageDTO }
         * 
         * 
         */
        public List<LanguageDTO> getLanguage() {
            if (language == null) {
                language = new ArrayList<LanguageDTO>();
            }
            return this.language;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="hyend2IndexSchema" type="{}hyend2IndexSchemaDTO" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "hyend2IndexSchema"
    })
    public static class IndexSchemas {

        protected List<Hyend2IndexSchemaDTO> hyend2IndexSchema;

        /**
         * Gets the value of the hyend2IndexSchema property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hyend2IndexSchema property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHyend2IndexSchema().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Hyend2IndexSchemaDTO }
         * 
         * 
         */
        public List<Hyend2IndexSchemaDTO> getHyend2IndexSchema() {
            if (hyend2IndexSchema == null) {
                hyend2IndexSchema = new ArrayList<Hyend2IndexSchemaDTO>();
            }
            return this.hyend2IndexSchema;
        }

    }

}
