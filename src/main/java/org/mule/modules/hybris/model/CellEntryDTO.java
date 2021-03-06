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
 * <p>Java class for cellEntryDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cellEntryDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}itemDTO">
 *       &lt;sequence>
 *         &lt;element name="catalogVersion" type="{}catalogVersionDTO" minOccurs="0"/>
 *         &lt;element name="cellStyle" type="{}cellStyleDTO" minOccurs="0"/>
 *         &lt;element name="cellStyleExpression" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cellText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colSpan" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="column" type="{}columnEntryDTO" minOccurs="0"/>
 *         &lt;element name="convert" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="extendedCellStyleExpression" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="mergeHorizontal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="mergeVertical" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="postProcessingExpression" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preProcessingExpression" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="row" type="{}rowEntryDTO" minOccurs="0"/>
 *         &lt;element name="rowSpan" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "cellEntryDTO", propOrder = {
    "catalogVersion",
    "cellStyle",
    "cellStyleExpression",
    "cellText",
    "colSpan",
    "column",
    "convert",
    "extendedCellStyleExpression",
    "id",
    "locked",
    "mergeHorizontal",
    "mergeVertical",
    "postProcessingExpression",
    "preProcessingExpression",
    "row",
    "rowSpan",
    "table"
})
public class CellEntryDTO
    extends ItemDTO
{

    protected CatalogVersionDTO catalogVersion;
    protected CellStyleDTO cellStyle;
    protected String cellStyleExpression;
    protected String cellText;
    protected Integer colSpan;
    protected ColumnEntryDTO column;
    protected Boolean convert;
    protected String extendedCellStyleExpression;
    protected String id;
    protected Boolean locked;
    protected Boolean mergeHorizontal;
    protected Boolean mergeVertical;
    protected String postProcessingExpression;
    protected String preProcessingExpression;
    protected RowEntryDTO row;
    protected Integer rowSpan;
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
     * Gets the value of the cellStyle property.
     * 
     * @return
     *     possible object is
     *     {@link CellStyleDTO }
     *     
     */
    public CellStyleDTO getCellStyle() {
        return cellStyle;
    }

    /**
     * Sets the value of the cellStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link CellStyleDTO }
     *     
     */
    public void setCellStyle(CellStyleDTO value) {
        this.cellStyle = value;
    }

    /**
     * Gets the value of the cellStyleExpression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellStyleExpression() {
        return cellStyleExpression;
    }

    /**
     * Sets the value of the cellStyleExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellStyleExpression(String value) {
        this.cellStyleExpression = value;
    }

    /**
     * Gets the value of the cellText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellText() {
        return cellText;
    }

    /**
     * Sets the value of the cellText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellText(String value) {
        this.cellText = value;
    }

    /**
     * Gets the value of the colSpan property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getColSpan() {
        return colSpan;
    }

    /**
     * Sets the value of the colSpan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setColSpan(Integer value) {
        this.colSpan = value;
    }

    /**
     * Gets the value of the column property.
     * 
     * @return
     *     possible object is
     *     {@link ColumnEntryDTO }
     *     
     */
    public ColumnEntryDTO getColumn() {
        return column;
    }

    /**
     * Sets the value of the column property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColumnEntryDTO }
     *     
     */
    public void setColumn(ColumnEntryDTO value) {
        this.column = value;
    }

    /**
     * Gets the value of the convert property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConvert() {
        return convert;
    }

    /**
     * Sets the value of the convert property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConvert(Boolean value) {
        this.convert = value;
    }

    /**
     * Gets the value of the extendedCellStyleExpression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedCellStyleExpression() {
        return extendedCellStyleExpression;
    }

    /**
     * Sets the value of the extendedCellStyleExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedCellStyleExpression(String value) {
        this.extendedCellStyleExpression = value;
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
     * Gets the value of the locked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocked() {
        return locked;
    }

    /**
     * Sets the value of the locked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocked(Boolean value) {
        this.locked = value;
    }

    /**
     * Gets the value of the mergeHorizontal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMergeHorizontal() {
        return mergeHorizontal;
    }

    /**
     * Sets the value of the mergeHorizontal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMergeHorizontal(Boolean value) {
        this.mergeHorizontal = value;
    }

    /**
     * Gets the value of the mergeVertical property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMergeVertical() {
        return mergeVertical;
    }

    /**
     * Sets the value of the mergeVertical property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMergeVertical(Boolean value) {
        this.mergeVertical = value;
    }

    /**
     * Gets the value of the postProcessingExpression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostProcessingExpression() {
        return postProcessingExpression;
    }

    /**
     * Sets the value of the postProcessingExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostProcessingExpression(String value) {
        this.postProcessingExpression = value;
    }

    /**
     * Gets the value of the preProcessingExpression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreProcessingExpression() {
        return preProcessingExpression;
    }

    /**
     * Sets the value of the preProcessingExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreProcessingExpression(String value) {
        this.preProcessingExpression = value;
    }

    /**
     * Gets the value of the row property.
     * 
     * @return
     *     possible object is
     *     {@link RowEntryDTO }
     *     
     */
    public RowEntryDTO getRow() {
        return row;
    }

    /**
     * Sets the value of the row property.
     * 
     * @param value
     *     allowed object is
     *     {@link RowEntryDTO }
     *     
     */
    public void setRow(RowEntryDTO value) {
        this.row = value;
    }

    /**
     * Gets the value of the rowSpan property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRowSpan() {
        return rowSpan;
    }

    /**
     * Sets the value of the rowSpan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRowSpan(Integer value) {
        this.rowSpan = value;
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
