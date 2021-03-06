//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.29 at 12:35:53 PM GMT 
//


package org.mule.modules.hybris.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for abstractBannerComponentDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="abstractBannerComponentDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}simpleCMSComponentDTO">
 *       &lt;sequence>
 *         &lt;element name="external" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element ref="{}media" minOccurs="0"/>
 *         &lt;element name="urlLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abstractBannerComponentDTO", propOrder = {
    "external",
    "media",
    "urlLink"
})
@XmlSeeAlso({
    SimpleBannerComponentDTO.class,
    DynamicBannerComponentDTO.class,
    FlashComponentDTO.class,
    BannerComponentDTO.class,
    ImageMapComponentDTO.class
})
public class AbstractBannerComponentDTO
    extends SimpleCMSComponentDTO
{

    protected boolean external;
    protected MediaDTO media;
    protected String urlLink;

    /**
     * Gets the value of the external property.
     * 
     */
    public boolean isExternal() {
        return external;
    }

    /**
     * Sets the value of the external property.
     * 
     */
    public void setExternal(boolean value) {
        this.external = value;
    }

    /**
     * Gets the value of the media property.
     * 
     * @return
     *     possible object is
     *     {@link MediaDTO }
     *     
     */
    public MediaDTO getMedia() {
        return media;
    }

    /**
     * Sets the value of the media property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaDTO }
     *     
     */
    public void setMedia(MediaDTO value) {
        this.media = value;
    }

    /**
     * Gets the value of the urlLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlLink() {
        return urlLink;
    }

    /**
     * Sets the value of the urlLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlLink(String value) {
        this.urlLink = value;
    }

}
