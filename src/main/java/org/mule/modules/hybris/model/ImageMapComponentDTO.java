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
 * <p>Java class for imageMapComponentDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="imageMapComponentDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}abstractBannerComponentDTO">
 *       &lt;sequence>
 *         &lt;element name="imageMapHTML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "imageMapComponentDTO", propOrder = {
    "imageMapHTML"
})
public class ImageMapComponentDTO
    extends AbstractBannerComponentDTO
{

    protected String imageMapHTML;

    /**
     * Gets the value of the imageMapHTML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageMapHTML() {
        return imageMapHTML;
    }

    /**
     * Sets the value of the imageMapHTML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageMapHTML(String value) {
        this.imageMapHTML = value;
    }

}