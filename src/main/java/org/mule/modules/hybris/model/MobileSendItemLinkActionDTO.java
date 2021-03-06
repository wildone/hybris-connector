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
 * <p>Java class for mobileSendItemLinkActionDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mobileSendItemLinkActionDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}abstractMobileSendActionDTO">
 *       &lt;sequence>
 *         &lt;element name="deeplinkUrl" type="{}deeplinkUrlDTO" minOccurs="0"/>
 *         &lt;element name="defaultItem" type="{}itemDTO" minOccurs="0"/>
 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mobileSendItemLinkActionDTO", propOrder = {
    "deeplinkUrl",
    "defaultItem",
    "subject"
})
public class MobileSendItemLinkActionDTO
    extends AbstractMobileSendActionDTO
{

    protected DeeplinkUrlDTO deeplinkUrl;
    protected ItemDTO defaultItem;
    protected String subject;

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
     * Gets the value of the defaultItem property.
     * 
     * @return
     *     possible object is
     *     {@link ItemDTO }
     *     
     */
    public ItemDTO getDefaultItem() {
        return defaultItem;
    }

    /**
     * Sets the value of the defaultItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemDTO }
     *     
     */
    public void setDefaultItem(ItemDTO value) {
        this.defaultItem = value;
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

}
