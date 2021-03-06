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
 * <p>Java class for productOneToOnePerfectPartnerPromotionDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="productOneToOnePerfectPartnerPromotionDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}productPromotionDTO">
 *       &lt;sequence>
 *         &lt;element name="baseProduct" type="{}productDTO" minOccurs="0"/>
 *         &lt;element name="bundlePrices" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="promotionPriceRow" type="{}promotionPriceRowDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="messageCouldHaveFired" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="messageFired" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="partnerProduct" type="{}productDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productOneToOnePerfectPartnerPromotionDTO", propOrder = {
    "baseProduct",
    "bundlePrices",
    "messageCouldHaveFired",
    "messageFired",
    "partnerProduct"
})
public class ProductOneToOnePerfectPartnerPromotionDTO
    extends ProductPromotionDTO
{

    protected ProductDTO baseProduct;
    protected ProductOneToOnePerfectPartnerPromotionDTO.BundlePrices bundlePrices;
    protected String messageCouldHaveFired;
    protected String messageFired;
    protected ProductDTO partnerProduct;

    /**
     * Gets the value of the baseProduct property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDTO }
     *     
     */
    public ProductDTO getBaseProduct() {
        return baseProduct;
    }

    /**
     * Sets the value of the baseProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDTO }
     *     
     */
    public void setBaseProduct(ProductDTO value) {
        this.baseProduct = value;
    }

    /**
     * Gets the value of the bundlePrices property.
     * 
     * @return
     *     possible object is
     *     {@link ProductOneToOnePerfectPartnerPromotionDTO.BundlePrices }
     *     
     */
    public ProductOneToOnePerfectPartnerPromotionDTO.BundlePrices getBundlePrices() {
        return bundlePrices;
    }

    /**
     * Sets the value of the bundlePrices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductOneToOnePerfectPartnerPromotionDTO.BundlePrices }
     *     
     */
    public void setBundlePrices(ProductOneToOnePerfectPartnerPromotionDTO.BundlePrices value) {
        this.bundlePrices = value;
    }

    /**
     * Gets the value of the messageCouldHaveFired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageCouldHaveFired() {
        return messageCouldHaveFired;
    }

    /**
     * Sets the value of the messageCouldHaveFired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageCouldHaveFired(String value) {
        this.messageCouldHaveFired = value;
    }

    /**
     * Gets the value of the messageFired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageFired() {
        return messageFired;
    }

    /**
     * Sets the value of the messageFired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageFired(String value) {
        this.messageFired = value;
    }

    /**
     * Gets the value of the partnerProduct property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDTO }
     *     
     */
    public ProductDTO getPartnerProduct() {
        return partnerProduct;
    }

    /**
     * Sets the value of the partnerProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDTO }
     *     
     */
    public void setPartnerProduct(ProductDTO value) {
        this.partnerProduct = value;
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
     *         &lt;element name="promotionPriceRow" type="{}promotionPriceRowDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "promotionPriceRow"
    })
    public static class BundlePrices {

        protected List<PromotionPriceRowDTO> promotionPriceRow;

        /**
         * Gets the value of the promotionPriceRow property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the promotionPriceRow property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPromotionPriceRow().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PromotionPriceRowDTO }
         * 
         * 
         */
        public List<PromotionPriceRowDTO> getPromotionPriceRow() {
            if (promotionPriceRow == null) {
                promotionPriceRow = new ArrayList<PromotionPriceRowDTO>();
            }
            return this.promotionPriceRow;
        }

    }

}
