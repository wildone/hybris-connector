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
 * <p>Java class for impExImportCronJobDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="impExImportCronJobDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}cronJobDTO">
 *       &lt;sequence>
 *         &lt;element name="dumpFileEncoding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dumpingAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableCodeExecution" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableExternalCodeExecution" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableExternalSyntaxParsing" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enableHmcSavedValues" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="externalDataCollection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="impExMedia" type="{}impExMediaDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="jobMedia" type="{}impExMediaDTO" minOccurs="0"/>
 *         &lt;element name="lastSuccessfulLine" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="legacyMode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="locale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxThreads" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="mediasMedia" type="{}mediaDTO" minOccurs="0"/>
 *         &lt;element name="mediasTarget" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unresolvedDataStore" type="{}impExMediaDTO" minOccurs="0"/>
 *         &lt;element name="unzipMediasMedia" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="valueCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="workMedia" type="{}impExMediaDTO" minOccurs="0"/>
 *         &lt;element name="zipentry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "impExImportCronJobDTO", propOrder = {
    "dumpFileEncoding",
    "dumpingAllowed",
    "enableCodeExecution",
    "enableExternalCodeExecution",
    "enableExternalSyntaxParsing",
    "enableHmcSavedValues",
    "externalDataCollection",
    "jobMedia",
    "lastSuccessfulLine",
    "legacyMode",
    "locale",
    "maxThreads",
    "mediasMedia",
    "mediasTarget",
    "mode",
    "unresolvedDataStore",
    "unzipMediasMedia",
    "valueCount",
    "workMedia",
    "zipentry"
})
@XmlSeeAlso({
    BmeCatImportWithCsvCronJobDTO.class,
    ClassificationImportCronJobDTO.class,
    ImportCockpitCronJobDTO.class
})
public class ImpExImportCronJobDTO
    extends CronJobDTO
{

    protected String dumpFileEncoding;
    protected Boolean dumpingAllowed;
    protected Boolean enableCodeExecution;
    protected Boolean enableExternalCodeExecution;
    protected Boolean enableExternalSyntaxParsing;
    protected Boolean enableHmcSavedValues;
    protected ImpExImportCronJobDTO.ExternalDataCollection externalDataCollection;
    protected ImpExMediaDTO jobMedia;
    protected Integer lastSuccessfulLine;
    protected Boolean legacyMode;
    protected String locale;
    protected Integer maxThreads;
    protected MediaDTO mediasMedia;
    protected String mediasTarget;
    protected String mode;
    protected ImpExMediaDTO unresolvedDataStore;
    protected Boolean unzipMediasMedia;
    protected Integer valueCount;
    protected ImpExMediaDTO workMedia;
    protected String zipentry;

    /**
     * Gets the value of the dumpFileEncoding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDumpFileEncoding() {
        return dumpFileEncoding;
    }

    /**
     * Sets the value of the dumpFileEncoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDumpFileEncoding(String value) {
        this.dumpFileEncoding = value;
    }

    /**
     * Gets the value of the dumpingAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDumpingAllowed() {
        return dumpingAllowed;
    }

    /**
     * Sets the value of the dumpingAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDumpingAllowed(Boolean value) {
        this.dumpingAllowed = value;
    }

    /**
     * Gets the value of the enableCodeExecution property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableCodeExecution() {
        return enableCodeExecution;
    }

    /**
     * Sets the value of the enableCodeExecution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableCodeExecution(Boolean value) {
        this.enableCodeExecution = value;
    }

    /**
     * Gets the value of the enableExternalCodeExecution property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableExternalCodeExecution() {
        return enableExternalCodeExecution;
    }

    /**
     * Sets the value of the enableExternalCodeExecution property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableExternalCodeExecution(Boolean value) {
        this.enableExternalCodeExecution = value;
    }

    /**
     * Gets the value of the enableExternalSyntaxParsing property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableExternalSyntaxParsing() {
        return enableExternalSyntaxParsing;
    }

    /**
     * Sets the value of the enableExternalSyntaxParsing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableExternalSyntaxParsing(Boolean value) {
        this.enableExternalSyntaxParsing = value;
    }

    /**
     * Gets the value of the enableHmcSavedValues property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnableHmcSavedValues() {
        return enableHmcSavedValues;
    }

    /**
     * Sets the value of the enableHmcSavedValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnableHmcSavedValues(Boolean value) {
        this.enableHmcSavedValues = value;
    }

    /**
     * Gets the value of the externalDataCollection property.
     * 
     * @return
     *     possible object is
     *     {@link ImpExImportCronJobDTO.ExternalDataCollection }
     *     
     */
    public ImpExImportCronJobDTO.ExternalDataCollection getExternalDataCollection() {
        return externalDataCollection;
    }

    /**
     * Sets the value of the externalDataCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImpExImportCronJobDTO.ExternalDataCollection }
     *     
     */
    public void setExternalDataCollection(ImpExImportCronJobDTO.ExternalDataCollection value) {
        this.externalDataCollection = value;
    }

    /**
     * Gets the value of the jobMedia property.
     * 
     * @return
     *     possible object is
     *     {@link ImpExMediaDTO }
     *     
     */
    public ImpExMediaDTO getJobMedia() {
        return jobMedia;
    }

    /**
     * Sets the value of the jobMedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImpExMediaDTO }
     *     
     */
    public void setJobMedia(ImpExMediaDTO value) {
        this.jobMedia = value;
    }

    /**
     * Gets the value of the lastSuccessfulLine property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLastSuccessfulLine() {
        return lastSuccessfulLine;
    }

    /**
     * Sets the value of the lastSuccessfulLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLastSuccessfulLine(Integer value) {
        this.lastSuccessfulLine = value;
    }

    /**
     * Gets the value of the legacyMode property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLegacyMode() {
        return legacyMode;
    }

    /**
     * Sets the value of the legacyMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLegacyMode(Boolean value) {
        this.legacyMode = value;
    }

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocale(String value) {
        this.locale = value;
    }

    /**
     * Gets the value of the maxThreads property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxThreads() {
        return maxThreads;
    }

    /**
     * Sets the value of the maxThreads property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxThreads(Integer value) {
        this.maxThreads = value;
    }

    /**
     * Gets the value of the mediasMedia property.
     * 
     * @return
     *     possible object is
     *     {@link MediaDTO }
     *     
     */
    public MediaDTO getMediasMedia() {
        return mediasMedia;
    }

    /**
     * Sets the value of the mediasMedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaDTO }
     *     
     */
    public void setMediasMedia(MediaDTO value) {
        this.mediasMedia = value;
    }

    /**
     * Gets the value of the mediasTarget property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediasTarget() {
        return mediasTarget;
    }

    /**
     * Sets the value of the mediasTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediasTarget(String value) {
        this.mediasTarget = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
    }

    /**
     * Gets the value of the unresolvedDataStore property.
     * 
     * @return
     *     possible object is
     *     {@link ImpExMediaDTO }
     *     
     */
    public ImpExMediaDTO getUnresolvedDataStore() {
        return unresolvedDataStore;
    }

    /**
     * Sets the value of the unresolvedDataStore property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImpExMediaDTO }
     *     
     */
    public void setUnresolvedDataStore(ImpExMediaDTO value) {
        this.unresolvedDataStore = value;
    }

    /**
     * Gets the value of the unzipMediasMedia property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnzipMediasMedia() {
        return unzipMediasMedia;
    }

    /**
     * Sets the value of the unzipMediasMedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnzipMediasMedia(Boolean value) {
        this.unzipMediasMedia = value;
    }

    /**
     * Gets the value of the valueCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValueCount() {
        return valueCount;
    }

    /**
     * Sets the value of the valueCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValueCount(Integer value) {
        this.valueCount = value;
    }

    /**
     * Gets the value of the workMedia property.
     * 
     * @return
     *     possible object is
     *     {@link ImpExMediaDTO }
     *     
     */
    public ImpExMediaDTO getWorkMedia() {
        return workMedia;
    }

    /**
     * Sets the value of the workMedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImpExMediaDTO }
     *     
     */
    public void setWorkMedia(ImpExMediaDTO value) {
        this.workMedia = value;
    }

    /**
     * Gets the value of the zipentry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipentry() {
        return zipentry;
    }

    /**
     * Sets the value of the zipentry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipentry(String value) {
        this.zipentry = value;
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
     *         &lt;element name="impExMedia" type="{}impExMediaDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "impExMedia"
    })
    public static class ExternalDataCollection {

        protected List<ImpExMediaDTO> impExMedia;

        /**
         * Gets the value of the impExMedia property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the impExMedia property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getImpExMedia().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ImpExMediaDTO }
         * 
         * 
         */
        public List<ImpExMediaDTO> getImpExMedia() {
            if (impExMedia == null) {
                impExMedia = new ArrayList<ImpExMediaDTO>();
            }
            return this.impExMedia;
        }

    }

}
