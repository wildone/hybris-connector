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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for itemSyncTimestampDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="itemSyncTimestampDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}itemDTO">
 *       &lt;sequence>
 *         &lt;element name="lastSyncSourceModifiedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastSyncTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="outdated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="pendingAttributeQualifiers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pendingAttributes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="attributeDescriptor" type="{}attributeDescriptorDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="pendingAttributesOwnerJob" type="{}syncItemCronJobDTO" minOccurs="0"/>
 *         &lt;element name="pendingAttributesScheduledTurn" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="sourceItem" type="{}itemDTO" minOccurs="0"/>
 *         &lt;element name="sourceVersion" type="{}catalogVersionDTO" minOccurs="0"/>
 *         &lt;element name="syncJob" type="{}syncItemJobDTO" minOccurs="0"/>
 *         &lt;element name="targetItem" type="{}itemDTO" minOccurs="0"/>
 *         &lt;element name="targetVersion" type="{}catalogVersionDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "itemSyncTimestampDTO", propOrder = {
    "lastSyncSourceModifiedTime",
    "lastSyncTime",
    "outdated",
    "pendingAttributeQualifiers",
    "pendingAttributes",
    "pendingAttributesOwnerJob",
    "pendingAttributesScheduledTurn",
    "sourceItem",
    "sourceVersion",
    "syncJob",
    "targetItem",
    "targetVersion"
})
public class ItemSyncTimestampDTO
    extends ItemDTO
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastSyncSourceModifiedTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastSyncTime;
    protected Boolean outdated;
    protected String pendingAttributeQualifiers;
    protected ItemSyncTimestampDTO.PendingAttributes pendingAttributes;
    protected SyncItemCronJobDTO pendingAttributesOwnerJob;
    protected Integer pendingAttributesScheduledTurn;
    protected ItemDTO sourceItem;
    protected CatalogVersionDTO sourceVersion;
    protected SyncItemJobDTO syncJob;
    protected ItemDTO targetItem;
    protected CatalogVersionDTO targetVersion;

    /**
     * Gets the value of the lastSyncSourceModifiedTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastSyncSourceModifiedTime() {
        return lastSyncSourceModifiedTime;
    }

    /**
     * Sets the value of the lastSyncSourceModifiedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastSyncSourceModifiedTime(XMLGregorianCalendar value) {
        this.lastSyncSourceModifiedTime = value;
    }

    /**
     * Gets the value of the lastSyncTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastSyncTime() {
        return lastSyncTime;
    }

    /**
     * Sets the value of the lastSyncTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastSyncTime(XMLGregorianCalendar value) {
        this.lastSyncTime = value;
    }

    /**
     * Gets the value of the outdated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOutdated() {
        return outdated;
    }

    /**
     * Sets the value of the outdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOutdated(Boolean value) {
        this.outdated = value;
    }

    /**
     * Gets the value of the pendingAttributeQualifiers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPendingAttributeQualifiers() {
        return pendingAttributeQualifiers;
    }

    /**
     * Sets the value of the pendingAttributeQualifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPendingAttributeQualifiers(String value) {
        this.pendingAttributeQualifiers = value;
    }

    /**
     * Gets the value of the pendingAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSyncTimestampDTO.PendingAttributes }
     *     
     */
    public ItemSyncTimestampDTO.PendingAttributes getPendingAttributes() {
        return pendingAttributes;
    }

    /**
     * Sets the value of the pendingAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSyncTimestampDTO.PendingAttributes }
     *     
     */
    public void setPendingAttributes(ItemSyncTimestampDTO.PendingAttributes value) {
        this.pendingAttributes = value;
    }

    /**
     * Gets the value of the pendingAttributesOwnerJob property.
     * 
     * @return
     *     possible object is
     *     {@link SyncItemCronJobDTO }
     *     
     */
    public SyncItemCronJobDTO getPendingAttributesOwnerJob() {
        return pendingAttributesOwnerJob;
    }

    /**
     * Sets the value of the pendingAttributesOwnerJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link SyncItemCronJobDTO }
     *     
     */
    public void setPendingAttributesOwnerJob(SyncItemCronJobDTO value) {
        this.pendingAttributesOwnerJob = value;
    }

    /**
     * Gets the value of the pendingAttributesScheduledTurn property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPendingAttributesScheduledTurn() {
        return pendingAttributesScheduledTurn;
    }

    /**
     * Sets the value of the pendingAttributesScheduledTurn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPendingAttributesScheduledTurn(Integer value) {
        this.pendingAttributesScheduledTurn = value;
    }

    /**
     * Gets the value of the sourceItem property.
     * 
     * @return
     *     possible object is
     *     {@link ItemDTO }
     *     
     */
    public ItemDTO getSourceItem() {
        return sourceItem;
    }

    /**
     * Sets the value of the sourceItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemDTO }
     *     
     */
    public void setSourceItem(ItemDTO value) {
        this.sourceItem = value;
    }

    /**
     * Gets the value of the sourceVersion property.
     * 
     * @return
     *     possible object is
     *     {@link CatalogVersionDTO }
     *     
     */
    public CatalogVersionDTO getSourceVersion() {
        return sourceVersion;
    }

    /**
     * Sets the value of the sourceVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogVersionDTO }
     *     
     */
    public void setSourceVersion(CatalogVersionDTO value) {
        this.sourceVersion = value;
    }

    /**
     * Gets the value of the syncJob property.
     * 
     * @return
     *     possible object is
     *     {@link SyncItemJobDTO }
     *     
     */
    public SyncItemJobDTO getSyncJob() {
        return syncJob;
    }

    /**
     * Sets the value of the syncJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link SyncItemJobDTO }
     *     
     */
    public void setSyncJob(SyncItemJobDTO value) {
        this.syncJob = value;
    }

    /**
     * Gets the value of the targetItem property.
     * 
     * @return
     *     possible object is
     *     {@link ItemDTO }
     *     
     */
    public ItemDTO getTargetItem() {
        return targetItem;
    }

    /**
     * Sets the value of the targetItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemDTO }
     *     
     */
    public void setTargetItem(ItemDTO value) {
        this.targetItem = value;
    }

    /**
     * Gets the value of the targetVersion property.
     * 
     * @return
     *     possible object is
     *     {@link CatalogVersionDTO }
     *     
     */
    public CatalogVersionDTO getTargetVersion() {
        return targetVersion;
    }

    /**
     * Sets the value of the targetVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogVersionDTO }
     *     
     */
    public void setTargetVersion(CatalogVersionDTO value) {
        this.targetVersion = value;
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
     *         &lt;element name="attributeDescriptor" type="{}attributeDescriptorDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "attributeDescriptor"
    })
    public static class PendingAttributes {

        protected List<AttributeDescriptorDTO> attributeDescriptor;

        /**
         * Gets the value of the attributeDescriptor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attributeDescriptor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttributeDescriptor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AttributeDescriptorDTO }
         * 
         * 
         */
        public List<AttributeDescriptorDTO> getAttributeDescriptor() {
            if (attributeDescriptor == null) {
                attributeDescriptor = new ArrayList<AttributeDescriptorDTO>();
            }
            return this.attributeDescriptor;
        }

    }

}
