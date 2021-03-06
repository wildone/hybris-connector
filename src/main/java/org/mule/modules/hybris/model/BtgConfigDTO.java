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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for btgConfigDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="btgConfigDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}itemDTO">
 *       &lt;sequence>
 *         &lt;element name="defaultCatalogVersion" type="{}catalogVersionDTO" minOccurs="0"/>
 *         &lt;element name="defaultTimeUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usedRuleTypes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="bTGRuleType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "btgConfigDTO", propOrder = {
    "defaultCatalogVersion",
    "defaultTimeUnit",
    "usedRuleTypes"
})
public class BtgConfigDTO
    extends ItemDTO
{

    protected CatalogVersionDTO defaultCatalogVersion;
    protected String defaultTimeUnit;
    protected BtgConfigDTO.UsedRuleTypes usedRuleTypes;

    /**
     * Gets the value of the defaultCatalogVersion property.
     * 
     * @return
     *     possible object is
     *     {@link CatalogVersionDTO }
     *     
     */
    public CatalogVersionDTO getDefaultCatalogVersion() {
        return defaultCatalogVersion;
    }

    /**
     * Sets the value of the defaultCatalogVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogVersionDTO }
     *     
     */
    public void setDefaultCatalogVersion(CatalogVersionDTO value) {
        this.defaultCatalogVersion = value;
    }

    /**
     * Gets the value of the defaultTimeUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultTimeUnit() {
        return defaultTimeUnit;
    }

    /**
     * Sets the value of the defaultTimeUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultTimeUnit(String value) {
        this.defaultTimeUnit = value;
    }

    /**
     * Gets the value of the usedRuleTypes property.
     * 
     * @return
     *     possible object is
     *     {@link BtgConfigDTO.UsedRuleTypes }
     *     
     */
    public BtgConfigDTO.UsedRuleTypes getUsedRuleTypes() {
        return usedRuleTypes;
    }

    /**
     * Sets the value of the usedRuleTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BtgConfigDTO.UsedRuleTypes }
     *     
     */
    public void setUsedRuleTypes(BtgConfigDTO.UsedRuleTypes value) {
        this.usedRuleTypes = value;
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
     *         &lt;element name="bTGRuleType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "btgRuleType"
    })
    public static class UsedRuleTypes {

        @XmlElement(name = "bTGRuleType")
        protected List<String> btgRuleType;

        /**
         * Gets the value of the btgRuleType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the btgRuleType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBTGRuleType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getBTGRuleType() {
            if (btgRuleType == null) {
                btgRuleType = new ArrayList<String>();
            }
            return this.btgRuleType;
        }

    }

}
