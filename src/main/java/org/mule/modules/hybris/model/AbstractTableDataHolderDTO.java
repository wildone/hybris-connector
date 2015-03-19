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
 * <p>Java class for abstractTableDataHolderDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="abstractTableDataHolderDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}itemDTO">
 *       &lt;sequence>
 *         &lt;element name="catalogVersion" type="{}catalogVersionDTO" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parametersInternal" type="{}mapParameterValueDTO" minOccurs="0"/>
 *         &lt;element name="table" type="{}tableBlockDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abstractTableDataHolderDTO", propOrder = {
    "catalogVersion",
    "id",
    "parametersInternal",
    "table"
})
@XmlSeeAlso({
    AxisDataHolderDTO.class,
    TableDataHolderDTO.class,
    CellDataHolderDTO.class
})
public class AbstractTableDataHolderDTO
    extends ItemDTO
{

    protected CatalogVersionDTO catalogVersion;
    protected String id;
    protected MapParameterValueDTO parametersInternal;
    protected TableBlockDTO table;

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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the parametersInternal property.
     * 
     * @return
     *     possible object is
     *     {@link MapParameterValueDTO }
     *     
     */
    public MapParameterValueDTO getParametersInternal() {
        return parametersInternal;
    }

    /**
     * Sets the value of the parametersInternal property.
     * 
     * @param value
     *     allowed object is
     *     {@link MapParameterValueDTO }
     *     
     */
    public void setParametersInternal(MapParameterValueDTO value) {
        this.parametersInternal = value;
    }

    /**
     * Gets the value of the table property.
     * 
     * @return
     *     possible object is
     *     {@link TableBlockDTO }
     *     
     */
    public TableBlockDTO getTable() {
        return table;
    }

    /**
     * Sets the value of the table property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableBlockDTO }
     *     
     */
    public void setTable(TableBlockDTO value) {
        this.table = value;
    }

}