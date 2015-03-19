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
 * <p>Java class for mobileSendMessageCronJobDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mobileSendMessageCronJobDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}cronJobDTO">
 *       &lt;sequence>
 *         &lt;element name="deeplinkUrl" type="{}deeplinkUrlDTO" minOccurs="0"/>
 *         &lt;element ref="{}item" minOccurs="0"/>
 *         &lt;element ref="{}language" minOccurs="0"/>
 *         &lt;element name="link" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="phoneNumbers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="phoneNumber" type="{}phoneNumberDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="recipientPhoneNumberLists" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="phoneNumberList" type="{}phoneNumberListDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="recipients" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}user" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="template" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mobileSendMessageCronJobDTO", propOrder = {
    "deeplinkUrl",
    "item",
    "language",
    "link",
    "phoneNumbers",
    "recipientPhoneNumberLists",
    "recipients",
    "subject",
    "template"
})
public class MobileSendMessageCronJobDTO
    extends CronJobDTO
{

    protected DeeplinkUrlDTO deeplinkUrl;
    protected ItemDTO item;
    protected LanguageDTO language;
    protected Boolean link;
    protected MobileSendMessageCronJobDTO.PhoneNumbers phoneNumbers;
    protected MobileSendMessageCronJobDTO.RecipientPhoneNumberLists recipientPhoneNumberLists;
    protected MobileSendMessageCronJobDTO.Recipients recipients;
    protected String subject;
    protected String template;

    /**
     * Gets the value of the deeplinkUrl property.
     * 
     * @return
     *     possible object is
     *     {@link DeeplinkUrlDTO }
     *     
     */
    public DeeplinkUrlDTO getDeeplinkUrl() {
        return deeplinkUrl;
    }

    /**
     * Sets the value of the deeplinkUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeeplinkUrlDTO }
     *     
     */
    public void setDeeplinkUrl(DeeplinkUrlDTO value) {
        this.deeplinkUrl = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link ItemDTO }
     *     
     */
    public ItemDTO getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemDTO }
     *     
     */
    public void setItem(ItemDTO value) {
        this.item = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageDTO }
     *     
     */
    public LanguageDTO getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageDTO }
     *     
     */
    public void setLanguage(LanguageDTO value) {
        this.language = value;
    }

    /**
     * Gets the value of the link property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLink() {
        return link;
    }

    /**
     * Sets the value of the link property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLink(Boolean value) {
        this.link = value;
    }

    /**
     * Gets the value of the phoneNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link MobileSendMessageCronJobDTO.PhoneNumbers }
     *     
     */
    public MobileSendMessageCronJobDTO.PhoneNumbers getPhoneNumbers() {
        return phoneNumbers;
    }

    /**
     * Sets the value of the phoneNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileSendMessageCronJobDTO.PhoneNumbers }
     *     
     */
    public void setPhoneNumbers(MobileSendMessageCronJobDTO.PhoneNumbers value) {
        this.phoneNumbers = value;
    }

    /**
     * Gets the value of the recipientPhoneNumberLists property.
     * 
     * @return
     *     possible object is
     *     {@link MobileSendMessageCronJobDTO.RecipientPhoneNumberLists }
     *     
     */
    public MobileSendMessageCronJobDTO.RecipientPhoneNumberLists getRecipientPhoneNumberLists() {
        return recipientPhoneNumberLists;
    }

    /**
     * Sets the value of the recipientPhoneNumberLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileSendMessageCronJobDTO.RecipientPhoneNumberLists }
     *     
     */
    public void setRecipientPhoneNumberLists(MobileSendMessageCronJobDTO.RecipientPhoneNumberLists value) {
        this.recipientPhoneNumberLists = value;
    }

    /**
     * Gets the value of the recipients property.
     * 
     * @return
     *     possible object is
     *     {@link MobileSendMessageCronJobDTO.Recipients }
     *     
     */
    public MobileSendMessageCronJobDTO.Recipients getRecipients() {
        return recipients;
    }

    /**
     * Sets the value of the recipients property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileSendMessageCronJobDTO.Recipients }
     *     
     */
    public void setRecipients(MobileSendMessageCronJobDTO.Recipients value) {
        this.recipients = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the template property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplate() {
        return template;
    }

    /**
     * Sets the value of the template property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplate(String value) {
        this.template = value;
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
     *         &lt;element name="phoneNumber" type="{}phoneNumberDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "phoneNumber"
    })
    public static class PhoneNumbers {

        protected List<PhoneNumberDTO> phoneNumber;

        /**
         * Gets the value of the phoneNumber property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the phoneNumber property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPhoneNumber().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PhoneNumberDTO }
         * 
         * 
         */
        public List<PhoneNumberDTO> getPhoneNumber() {
            if (phoneNumber == null) {
                phoneNumber = new ArrayList<PhoneNumberDTO>();
            }
            return this.phoneNumber;
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
     *         &lt;element name="phoneNumberList" type="{}phoneNumberListDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "phoneNumberList"
    })
    public static class RecipientPhoneNumberLists {

        protected List<PhoneNumberListDTO> phoneNumberList;

        /**
         * Gets the value of the phoneNumberList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the phoneNumberList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPhoneNumberList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PhoneNumberListDTO }
         * 
         * 
         */
        public List<PhoneNumberListDTO> getPhoneNumberList() {
            if (phoneNumberList == null) {
                phoneNumberList = new ArrayList<PhoneNumberListDTO>();
            }
            return this.phoneNumberList;
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
     *         &lt;element ref="{}user" maxOccurs="unbounded" minOccurs="0"/>
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
        "user"
    })
    public static class Recipients {

        protected List<UserDTO> user;

        /**
         * Gets the value of the user property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the user property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUser().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UserDTO }
         * 
         * 
         */
        public List<UserDTO> getUser() {
            if (user == null) {
                user = new ArrayList<UserDTO>();
            }
            return this.user;
        }

    }

}