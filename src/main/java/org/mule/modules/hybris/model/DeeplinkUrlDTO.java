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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deeplinkUrlDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deeplinkUrlDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}itemDTO">
 *       &lt;sequence>
 *         &lt;element name="barcodeMedias" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="barcodeMedia" type="{}barcodeMediaDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="baseUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deeplinkUrlDTO", propOrder = {
    "barcodeMedias",
    "baseUrl",
    "name"
})
public class DeeplinkUrlDTO
    extends ItemDTO
{

    protected DeeplinkUrlDTO.BarcodeMedias barcodeMedias;
    protected String baseUrl;
    protected String name;
    @XmlAttribute(name = "code")
    protected String code;

    /**
     * Gets the value of the barcodeMedias property.
     * 
     * @return
     *     possible object is
     *     {@link DeeplinkUrlDTO.BarcodeMedias }
     *     
     */
    public DeeplinkUrlDTO.BarcodeMedias getBarcodeMedias() {
        return barcodeMedias;
    }

    /**
     * Sets the value of the barcodeMedias property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeeplinkUrlDTO.BarcodeMedias }
     *     
     */
    public void setBarcodeMedias(DeeplinkUrlDTO.BarcodeMedias value) {
        this.barcodeMedias = value;
    }

    /**
     * Gets the value of the baseUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseUrl() {
        return baseUrl;
    }

    /**
     * Sets the value of the baseUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseUrl(String value) {
        this.baseUrl = value;
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
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
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
     *         &lt;element name="barcodeMedia" type="{}barcodeMediaDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "barcodeMedia"
    })
    public static class BarcodeMedias {

        protected List<BarcodeMediaDTO> barcodeMedia;

        /**
         * Gets the value of the barcodeMedia property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the barcodeMedia property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBarcodeMedia().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BarcodeMediaDTO }
         * 
         * 
         */
        public List<BarcodeMediaDTO> getBarcodeMedia() {
            if (barcodeMedia == null) {
                barcodeMedia = new ArrayList<BarcodeMediaDTO>();
            }
            return this.barcodeMedia;
        }

    }

}
