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
 * <p>Java class for emailPageTemplateDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="emailPageTemplateDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}pageTemplateDTO">
 *       &lt;sequence>
 *         &lt;element name="htmlTemplate" type="{}rendererTemplateDTO" minOccurs="0"/>
 *         &lt;element name="subject" type="{}rendererTemplateDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "emailPageTemplateDTO", propOrder = {
    "htmlTemplate",
    "subject"
})
public class EmailPageTemplateDTO
    extends PageTemplateDTO
{

    protected RendererTemplateDTO htmlTemplate;
    protected RendererTemplateDTO subject;

    /**
     * Gets the value of the htmlTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link RendererTemplateDTO }
     *     
     */
    public RendererTemplateDTO getHtmlTemplate() {
        return htmlTemplate;
    }

    /**
     * Sets the value of the htmlTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RendererTemplateDTO }
     *     
     */
    public void setHtmlTemplate(RendererTemplateDTO value) {
        this.htmlTemplate = value;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link RendererTemplateDTO }
     *     
     */
    public RendererTemplateDTO getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link RendererTemplateDTO }
     *     
     */
    public void setSubject(RendererTemplateDTO value) {
        this.subject = value;
    }

}
