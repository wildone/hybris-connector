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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for orderModificationRecordEntryDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orderModificationRecordEntryDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}itemDTO">
 *       &lt;sequence>
 *         &lt;element name="failedMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modificationRecord" type="{}orderModificationRecordDTO" minOccurs="0"/>
 *         &lt;element name="notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderEntriesModificationEntries" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="orderEntryModificationRecordEntry" type="{}orderEntryModificationRecordEntryDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="originalVersion" type="{}orderHistoryEntryDTO" minOccurs="0"/>
 *         &lt;element ref="{}principal" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
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
@XmlType(name = "orderModificationRecordEntryDTO", propOrder = {
    "failedMessage",
    "modificationRecord",
    "notes",
    "orderEntriesModificationEntries",
    "originalVersion",
    "principal",
    "status",
    "timestamp"
})
@XmlSeeAlso({
    OrderCancelRecordEntryDTO.class,
    OrderReturnRecordEntryDTO.class
})
public class OrderModificationRecordEntryDTO
    extends ItemDTO
{

    protected String failedMessage;
    protected OrderModificationRecordDTO modificationRecord;
    protected String notes;
    protected OrderModificationRecordEntryDTO.OrderEntriesModificationEntries orderEntriesModificationEntries;
    protected OrderHistoryEntryDTO originalVersion;
    protected PrincipalDTO principal;
    protected String status;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlAttribute(name = "code")
    protected String code;

    /**
     * Gets the value of the failedMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailedMessage() {
        return failedMessage;
    }

    /**
     * Sets the value of the failedMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailedMessage(String value) {
        this.failedMessage = value;
    }

    /**
     * Gets the value of the modificationRecord property.
     * 
     * @return
     *     possible object is
     *     {@link OrderModificationRecordDTO }
     *     
     */
    public OrderModificationRecordDTO getModificationRecord() {
        return modificationRecord;
    }

    /**
     * Sets the value of the modificationRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderModificationRecordDTO }
     *     
     */
    public void setModificationRecord(OrderModificationRecordDTO value) {
        this.modificationRecord = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the orderEntriesModificationEntries property.
     * 
     * @return
     *     possible object is
     *     {@link OrderModificationRecordEntryDTO.OrderEntriesModificationEntries }
     *     
     */
    public OrderModificationRecordEntryDTO.OrderEntriesModificationEntries getOrderEntriesModificationEntries() {
        return orderEntriesModificationEntries;
    }

    /**
     * Sets the value of the orderEntriesModificationEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderModificationRecordEntryDTO.OrderEntriesModificationEntries }
     *     
     */
    public void setOrderEntriesModificationEntries(OrderModificationRecordEntryDTO.OrderEntriesModificationEntries value) {
        this.orderEntriesModificationEntries = value;
    }

    /**
     * Gets the value of the originalVersion property.
     * 
     * @return
     *     possible object is
     *     {@link OrderHistoryEntryDTO }
     *     
     */
    public OrderHistoryEntryDTO getOriginalVersion() {
        return originalVersion;
    }

    /**
     * Sets the value of the originalVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderHistoryEntryDTO }
     *     
     */
    public void setOriginalVersion(OrderHistoryEntryDTO value) {
        this.originalVersion = value;
    }

    /**
     * Gets the value of the principal property.
     * 
     * @return
     *     possible object is
     *     {@link PrincipalDTO }
     *     
     */
    public PrincipalDTO getPrincipal() {
        return principal;
    }

    /**
     * Sets the value of the principal property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincipalDTO }
     *     
     */
    public void setPrincipal(PrincipalDTO value) {
        this.principal = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
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
     *         &lt;element name="orderEntryModificationRecordEntry" type="{}orderEntryModificationRecordEntryDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "orderEntryModificationRecordEntry"
    })
    public static class OrderEntriesModificationEntries {

        protected List<OrderEntryModificationRecordEntryDTO> orderEntryModificationRecordEntry;

        /**
         * Gets the value of the orderEntryModificationRecordEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the orderEntryModificationRecordEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOrderEntryModificationRecordEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OrderEntryModificationRecordEntryDTO }
         * 
         * 
         */
        public List<OrderEntryModificationRecordEntryDTO> getOrderEntryModificationRecordEntry() {
            if (orderEntryModificationRecordEntry == null) {
                orderEntryModificationRecordEntry = new ArrayList<OrderEntryModificationRecordEntryDTO>();
            }
            return this.orderEntryModificationRecordEntry;
        }

    }

}
