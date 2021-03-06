//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.29 at 12:35:53 PM GMT 
//


package org.mule.modules.hybris.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for celumPicturesIntegrationCronJobBaseDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="celumPicturesIntegrationCronJobBaseDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}cronJobDTO">
 *       &lt;sequence>
 *         &lt;element name="catalogVersion" type="{}catalogVersionDTO" minOccurs="0"/>
 *         &lt;element name="dateLimitOverride" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="immediateDownload" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "celumPicturesIntegrationCronJobBaseDTO", propOrder = {
    "catalogVersion",
    "dateLimitOverride",
    "immediateDownload"
})
@XmlSeeAlso({
    FilePicturesIntegrationCronJobDTO.class,
    CelumInformationFieldPicturesIntegrationCronJobDTO.class
})
public class CelumPicturesIntegrationCronJobBaseDTO
    extends CronJobDTO
{

    protected CatalogVersionDTO catalogVersion;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLimitOverride;
    protected Boolean immediateDownload;

    /**
     * Gets the value of the catalogVersion property.
     * 
     * @return
     *     possible object is
     *     {@link CatalogVersionDTO }
     *     
     */
    public CatalogVersionDTO getCatalogVersion() {
        return catalogVersion;
    }

    /**
     * Sets the value of the catalogVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogVersionDTO }
     *     
     */
    public void setCatalogVersion(CatalogVersionDTO value) {
        this.catalogVersion = value;
    }

    /**
     * Gets the value of the dateLimitOverride property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLimitOverride() {
        return dateLimitOverride;
    }

    /**
     * Sets the value of the dateLimitOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLimitOverride(XMLGregorianCalendar value) {
        this.dateLimitOverride = value;
    }

    /**
     * Gets the value of the immediateDownload property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isImmediateDownload() {
        return immediateDownload;
    }

    /**
     * Sets the value of the immediateDownload property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImmediateDownload(Boolean value) {
        this.immediateDownload = value;
    }

}
