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
 * <p>Java class for solrUpdateStopWordsCronJobDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="solrUpdateStopWordsCronJobDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}cronJobDTO">
 *       &lt;sequence>
 *         &lt;element ref="{}language" minOccurs="0"/>
 *         &lt;element name="solrFacetSearchConfig" type="{}solrFacetSearchConfigDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "solrUpdateStopWordsCronJobDTO", propOrder = {
    "language",
    "solrFacetSearchConfig"
})
public class SolrUpdateStopWordsCronJobDTO
    extends CronJobDTO
{

    protected LanguageDTO language;
    protected SolrFacetSearchConfigDTO solrFacetSearchConfig;

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
     * Gets the value of the solrFacetSearchConfig property.
     * 
     * @return
     *     possible object is
     *     {@link SolrFacetSearchConfigDTO }
     *     
     */
    public SolrFacetSearchConfigDTO getSolrFacetSearchConfig() {
        return solrFacetSearchConfig;
    }

    /**
     * Sets the value of the solrFacetSearchConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolrFacetSearchConfigDTO }
     *     
     */
    public void setSolrFacetSearchConfig(SolrFacetSearchConfigDTO value) {
        this.solrFacetSearchConfig = value;
    }

}
