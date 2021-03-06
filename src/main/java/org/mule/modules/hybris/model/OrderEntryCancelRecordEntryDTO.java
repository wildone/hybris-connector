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
 * <p>Java class for orderEntryCancelRecordEntryDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orderEntryCancelRecordEntryDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}orderEntryModificationRecordEntryDTO">
 *       &lt;sequence>
 *         &lt;element name="cancelReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cancelRequestQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cancelledQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orderEntryCancelRecordEntryDTO", propOrder = {
    "cancelReason",
    "cancelRequestQuantity",
    "cancelledQuantity"
})
public class OrderEntryCancelRecordEntryDTO
    extends OrderEntryModificationRecordEntryDTO
{

    protected String cancelReason;
    protected Integer cancelRequestQuantity;
    protected Integer cancelledQuantity;

    /**
     * Gets the value of the cancelReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelReason() {
        return cancelReason;
    }

    /**
     * Sets the value of the cancelReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelReason(String value) {
        this.cancelReason = value;
    }

    /**
     * Gets the value of the cancelRequestQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCancelRequestQuantity() {
        return cancelRequestQuantity;
    }

    /**
     * Sets the value of the cancelRequestQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCancelRequestQuantity(Integer value) {
        this.cancelRequestQuantity = value;
    }

    /**
     * Gets the value of the cancelledQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCancelledQuantity() {
        return cancelledQuantity;
    }

    /**
     * Sets the value of the cancelledQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCancelledQuantity(Integer value) {
        this.cancelledQuantity = value;
    }

}
