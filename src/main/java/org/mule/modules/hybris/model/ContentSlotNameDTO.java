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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contentSlotNameDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contentSlotNameDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}itemDTO">
 *       &lt;sequence>
 *         &lt;element name="compTypeGroup" type="{}componentTypeGroupDTO" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="template" type="{}pageTemplateDTO" minOccurs="0"/>
 *         &lt;element name="validComponentTypes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cMSComponentType" type="{}cmsComponentTypeDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contentSlotNameDTO", propOrder = {
    "compTypeGroup",
    "name",
    "template",
    "validComponentTypes"
})
public class ContentSlotNameDTO
    extends ItemDTO
{

    protected ComponentTypeGroupDTO compTypeGroup;
    protected String name;
    protected PageTemplateDTO template;
    protected ContentSlotNameDTO.ValidComponentTypes validComponentTypes;

    /**
     * Gets the value of the compTypeGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ComponentTypeGroupDTO }
     *     
     */
    public ComponentTypeGroupDTO getCompTypeGroup() {
        return compTypeGroup;
    }

    /**
     * Sets the value of the compTypeGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentTypeGroupDTO }
     *     
     */
    public void setCompTypeGroup(ComponentTypeGroupDTO value) {
        this.compTypeGroup = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the template property.
     * 
     * @return
     *     possible object is
     *     {@link PageTemplateDTO }
     *     
     */
    public PageTemplateDTO getTemplate() {
        return template;
    }

    /**
     * Sets the value of the template property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageTemplateDTO }
     *     
     */
    public void setTemplate(PageTemplateDTO value) {
        this.template = value;
    }

    /**
     * Gets the value of the validComponentTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ContentSlotNameDTO.ValidComponentTypes }
     *     
     */
    public ContentSlotNameDTO.ValidComponentTypes getValidComponentTypes() {
        return validComponentTypes;
    }

    /**
     * Sets the value of the validComponentTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentSlotNameDTO.ValidComponentTypes }
     *     
     */
    public void setValidComponentTypes(ContentSlotNameDTO.ValidComponentTypes value) {
        this.validComponentTypes = value;
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
     *         &lt;element name="cMSComponentType" type="{}cmsComponentTypeDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "cmsComponentType"
    })
    public static class ValidComponentTypes {

        @XmlElement(name = "cMSComponentType")
        protected List<CmsComponentTypeDTO> cmsComponentType;

        /**
         * Gets the value of the cmsComponentType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cmsComponentType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCMSComponentType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CmsComponentTypeDTO }
         * 
         * 
         */
        public List<CmsComponentTypeDTO> getCMSComponentType() {
            if (cmsComponentType == null) {
                cmsComponentType = new ArrayList<CmsComponentTypeDTO>();
            }
            return this.cmsComponentType;
        }

    }

}
