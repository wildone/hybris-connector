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
 * <p>Java class for miniCartComponentDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="miniCartComponentDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}simpleCMSComponentDTO">
 *       &lt;sequence>
 *         &lt;element name="lightboxBannerComponent" type="{}simpleBannerComponentDTO" minOccurs="0"/>
 *         &lt;element name="shownProductCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalDisplay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "miniCartComponentDTO", propOrder = {
    "lightboxBannerComponent",
    "shownProductCount",
    "title",
    "totalDisplay"
})
public class MiniCartComponentDTO
    extends SimpleCMSComponentDTO
{

    protected SimpleBannerComponentDTO lightboxBannerComponent;
    protected int shownProductCount;
    protected String title;
    protected String totalDisplay;

    /**
     * Gets the value of the lightboxBannerComponent property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleBannerComponentDTO }
     *     
     */
    public SimpleBannerComponentDTO getLightboxBannerComponent() {
        return lightboxBannerComponent;
    }

    /**
     * Sets the value of the lightboxBannerComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleBannerComponentDTO }
     *     
     */
    public void setLightboxBannerComponent(SimpleBannerComponentDTO value) {
        this.lightboxBannerComponent = value;
    }

    /**
     * Gets the value of the shownProductCount property.
     * 
     */
    public int getShownProductCount() {
        return shownProductCount;
    }

    /**
     * Sets the value of the shownProductCount property.
     * 
     */
    public void setShownProductCount(int value) {
        this.shownProductCount = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the totalDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalDisplay() {
        return totalDisplay;
    }

    /**
     * Sets the value of the totalDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalDisplay(String value) {
        this.totalDisplay = value;
    }

}
