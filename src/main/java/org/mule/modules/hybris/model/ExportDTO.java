//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.29 at 12:35:53 PM GMT 
//


package org.mule.modules.hybris.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for exportDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="exportDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}itemDTO">
 *       &lt;sequence>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exportScript" type="{}impExMediaDTO" minOccurs="0"/>
 *         &lt;element name="exportedData" type="{}impExExportMediaDTO" minOccurs="0"/>
 *         &lt;element name="exportedMedias" type="{}impExExportMediaDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exportDTO", propOrder = {
    "description",
    "exportScript",
    "exportedData",
    "exportedMedias"
})
@XmlSeeAlso({
    ReportDTO.class
})
public class ExportDTO
    extends ItemDTO
{

    protected String description;
    protected ImpExMediaDTO exportScript;
    protected ImpExExportMediaDTO exportedData;
    protected ImpExExportMediaDTO exportedMedias;
    @XmlAttribute(name = "code")
    protected String code;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the exportScript property.
     * 
     * @return
     *     possible object is
     *     {@link ImpExMediaDTO }
     *     
     */
    public ImpExMediaDTO getExportScript() {
        return exportScript;
    }

    /**
     * Sets the value of the exportScript property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImpExMediaDTO }
     *     
     */
    public void setExportScript(ImpExMediaDTO value) {
        this.exportScript = value;
    }

    /**
     * Gets the value of the exportedData property.
     * 
     * @return
     *     possible object is
     *     {@link ImpExExportMediaDTO }
     *     
     */
    public ImpExExportMediaDTO getExportedData() {
        return exportedData;
    }

    /**
     * Sets the value of the exportedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImpExExportMediaDTO }
     *     
     */
    public void setExportedData(ImpExExportMediaDTO value) {
        this.exportedData = value;
    }

    /**
     * Gets the value of the exportedMedias property.
     * 
     * @return
     *     possible object is
     *     {@link ImpExExportMediaDTO }
     *     
     */
    public ImpExExportMediaDTO getExportedMedias() {
        return exportedMedias;
    }

    /**
     * Sets the value of the exportedMedias property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImpExExportMediaDTO }
     *     
     */
    public void setExportedMedias(ImpExExportMediaDTO value) {
        this.exportedMedias = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

}