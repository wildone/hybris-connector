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
 * <p>Java class for orderCancelRecordEntryDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orderCancelRecordEntryDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}orderModificationRecordEntryDTO">
 *       &lt;sequence>
 *         &lt;element name="cancelReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cancelResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refusedMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orderCancelRecordEntryDTO", propOrder = {
    "cancelReason",
    "cancelResult",
    "refusedMessage"
})
public class OrderCancelRecordEntryDTO
    extends OrderModificationRecordEntryDTO
{

    protected String cancelReason;
    protected String cancelResult;
    protected String refusedMessage;

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
     * Gets the value of the cancelResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelResult() {
        return cancelResult;
    }

    /**
     * Sets the value of the cancelResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelResult(String value) {
        this.cancelResult = value;
    }

    /**
     * Gets the value of the refusedMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefusedMessage() {
        return refusedMessage;
    }

    /**
     * Sets the value of the refusedMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefusedMessage(String value) {
        this.refusedMessage = value;
    }

}