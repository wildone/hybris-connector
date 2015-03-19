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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for abstractMobileSendActionDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="abstractMobileSendActionDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}abstractActionDTO">
 *       &lt;sequence>
 *         &lt;element name="defaultLanguage" type="{}languageDTO" minOccurs="0"/>
 *         &lt;element name="filterLists" minOccurs="0">
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
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abstractMobileSendActionDTO", propOrder = {
    "defaultLanguage",
    "filterLists"
})
@XmlSeeAlso({
    MobileSendLinkActionDTO.class,
    MobileSendTextActionDTO.class,
    MobileSendItemLinkActionDTO.class
})
public class AbstractMobileSendActionDTO
    extends AbstractActionDTO
{

    protected LanguageDTO defaultLanguage;
    protected AbstractMobileSendActionDTO.FilterLists filterLists;

    /**
     * Gets the value of the defaultLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageDTO }
     *     
     */
    public LanguageDTO getDefaultLanguage() {
        return defaultLanguage;
    }

    /**
     * Sets the value of the defaultLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageDTO }
     *     
     */
    public void setDefaultLanguage(LanguageDTO value) {
        this.defaultLanguage = value;
    }

    /**
     * Gets the value of the filterLists property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractMobileSendActionDTO.FilterLists }
     *     
     */
    public AbstractMobileSendActionDTO.FilterLists getFilterLists() {
        return filterLists;
    }

    /**
     * Sets the value of the filterLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractMobileSendActionDTO.FilterLists }
     *     
     */
    public void setFilterLists(AbstractMobileSendActionDTO.FilterLists value) {
        this.filterLists = value;
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
    public static class FilterLists {

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

}