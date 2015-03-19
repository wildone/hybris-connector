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
 * <p>Java class for promotionVoucherDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="promotionVoucherDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}voucherDTO">
 *       &lt;sequence>
 *         &lt;element name="redemptionQuantityLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="redemptionQuantityLimitPerUser" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="voucherCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "promotionVoucherDTO", propOrder = {
    "redemptionQuantityLimit",
    "redemptionQuantityLimitPerUser",
    "voucherCode"
})
public class PromotionVoucherDTO
    extends VoucherDTO
{

    protected Integer redemptionQuantityLimit;
    protected Integer redemptionQuantityLimitPerUser;
    protected String voucherCode;

    /**
     * Gets the value of the redemptionQuantityLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRedemptionQuantityLimit() {
        return redemptionQuantityLimit;
    }

    /**
     * Sets the value of the redemptionQuantityLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRedemptionQuantityLimit(Integer value) {
        this.redemptionQuantityLimit = value;
    }

    /**
     * Gets the value of the redemptionQuantityLimitPerUser property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRedemptionQuantityLimitPerUser() {
        return redemptionQuantityLimitPerUser;
    }

    /**
     * Sets the value of the redemptionQuantityLimitPerUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRedemptionQuantityLimitPerUser(Integer value) {
        this.redemptionQuantityLimitPerUser = value;
    }

    /**
     * Gets the value of the voucherCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoucherCode() {
        return voucherCode;
    }

    /**
     * Sets the value of the voucherCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoucherCode(String value) {
        this.voucherCode = value;
    }

}