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
 * <p>Java class for exportDataCronJobDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="exportDataCronJobDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}cronJobDTO">
 *       &lt;sequence>
 *         &lt;element name="baseStore" type="{}baseStoreDTO" minOccurs="0"/>
 *         &lt;element name="cmsSite" type="{}cmsSiteDTO" minOccurs="0"/>
 *         &lt;element ref="{}currency" minOccurs="0"/>
 *         &lt;element name="dataGenerationPipeline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="historyEntries" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="exportDataHistoryEntry" type="{}exportDataHistoryEntryDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{}language" minOccurs="0"/>
 *         &lt;element name="thirdPartyHost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="thirdPartyPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="thirdPartyUsername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{}user" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportDataCronJobDTO", propOrder = {
    "baseStore",
    "cmsSite",
    "currency",
    "dataGenerationPipeline",
    "historyEntries",
    "language",
    "thirdPartyHost",
    "thirdPartyPassword",
    "thirdPartyUsername",
    "user"
})
public class ExportDataCronJobDTO
    extends CronJobDTO
{

    protected BaseStoreDTO baseStore;
    protected CmsSiteDTO cmsSite;
    protected CurrencyDTO currency;
    protected String dataGenerationPipeline;
    protected ExportDataCronJobDTO.HistoryEntries historyEntries;
    protected LanguageDTO language;
    protected String thirdPartyHost;
    protected String thirdPartyPassword;
    protected String thirdPartyUsername;
    protected UserDTO user;

    /**
     * Gets the value of the baseStore property.
     * 
     * @return
     *     possible object is
     *     {@link BaseStoreDTO }
     *     
     */
    public BaseStoreDTO getBaseStore() {
        return baseStore;
    }

    /**
     * Sets the value of the baseStore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseStoreDTO }
     *     
     */
    public void setBaseStore(BaseStoreDTO value) {
        this.baseStore = value;
    }

    /**
     * Gets the value of the cmsSite property.
     * 
     * @return
     *     possible object is
     *     {@link CmsSiteDTO }
     *     
     */
    public CmsSiteDTO getCmsSite() {
        return cmsSite;
    }

    /**
     * Sets the value of the cmsSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmsSiteDTO }
     *     
     */
    public void setCmsSite(CmsSiteDTO value) {
        this.cmsSite = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyDTO }
     *     
     */
    public CurrencyDTO getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyDTO }
     *     
     */
    public void setCurrency(CurrencyDTO value) {
        this.currency = value;
    }

    /**
     * Gets the value of the dataGenerationPipeline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataGenerationPipeline() {
        return dataGenerationPipeline;
    }

    /**
     * Sets the value of the dataGenerationPipeline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataGenerationPipeline(String value) {
        this.dataGenerationPipeline = value;
    }

    /**
     * Gets the value of the historyEntries property.
     * 
     * @return
     *     possible object is
     *     {@link ExportDataCronJobDTO.HistoryEntries }
     *     
     */
    public ExportDataCronJobDTO.HistoryEntries getHistoryEntries() {
        return historyEntries;
    }

    /**
     * Sets the value of the historyEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportDataCronJobDTO.HistoryEntries }
     *     
     */
    public void setHistoryEntries(ExportDataCronJobDTO.HistoryEntries value) {
        this.historyEntries = value;
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
     * Gets the value of the thirdPartyHost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyHost() {
        return thirdPartyHost;
    }

    /**
     * Sets the value of the thirdPartyHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyHost(String value) {
        this.thirdPartyHost = value;
    }

    /**
     * Gets the value of the thirdPartyPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyPassword() {
        return thirdPartyPassword;
    }

    /**
     * Sets the value of the thirdPartyPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyPassword(String value) {
        this.thirdPartyPassword = value;
    }

    /**
     * Gets the value of the thirdPartyUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyUsername() {
        return thirdPartyUsername;
    }

    /**
     * Sets the value of the thirdPartyUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyUsername(String value) {
        this.thirdPartyUsername = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link UserDTO }
     *     
     */
    public UserDTO getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDTO }
     *     
     */
    public void setUser(UserDTO value) {
        this.user = value;
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
     *         &lt;element name="exportDataHistoryEntry" type="{}exportDataHistoryEntryDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "exportDataHistoryEntry"
    })
    public static class HistoryEntries {

        protected List<ExportDataHistoryEntryDTO> exportDataHistoryEntry;

        /**
         * Gets the value of the exportDataHistoryEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the exportDataHistoryEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExportDataHistoryEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ExportDataHistoryEntryDTO }
         * 
         * 
         */
        public List<ExportDataHistoryEntryDTO> getExportDataHistoryEntry() {
            if (exportDataHistoryEntry == null) {
                exportDataHistoryEntry = new ArrayList<ExportDataHistoryEntryDTO>();
            }
            return this.exportDataHistoryEntry;
        }

    }

}
