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
 * <p>Java class for solrEndpointUrlDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="solrEndpointUrlDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}itemDTO">
 *       &lt;sequence>
 *         &lt;element name="master" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="solrServerConfig" type="{}solrServerConfigDTO" minOccurs="0"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "solrEndpointUrlDTO", propOrder = {
    "master",
    "solrServerConfig",
    "url"
})
public class SolrEndpointUrlDTO
    extends ItemDTO
{

    protected boolean master;
    protected SolrServerConfigDTO solrServerConfig;
    protected String url;

    /**
     * Gets the value of the master property.
     * 
     */
    public boolean isMaster() {
        return master;
    }

    /**
     * Sets the value of the master property.
     * 
     */
    public void setMaster(boolean value) {
        this.master = value;
    }

    /**
     * Gets the value of the solrServerConfig property.
     * 
     * @return
     *     possible object is
     *     {@link SolrServerConfigDTO }
     *     
     */
    public SolrServerConfigDTO getSolrServerConfig() {
        return solrServerConfig;
    }

    /**
     * Sets the value of the solrServerConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolrServerConfigDTO }
     *     
     */
    public void setSolrServerConfig(SolrServerConfigDTO value) {
        this.solrServerConfig = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

}
