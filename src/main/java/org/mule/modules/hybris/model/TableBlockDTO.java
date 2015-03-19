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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tableBlockDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tableBlockDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}contentBlockDTO">
 *       &lt;sequence>
 *         &lt;element name="allTableTemplates" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tableBlock" type="{}tableBlockDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="cells" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cellEntry" type="{}cellEntryDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="columns" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="columnEntry" type="{}columnEntryDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="footerRowCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="headerRowCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="isTemplate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="locked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="rows" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="rowEntry" type="{}rowEntryDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="tableDataHolders" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="abstractTableDataHolder" type="{}abstractTableDataHolderDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="tableStyle" type="{}tableStyleDTO" minOccurs="0"/>
 *         &lt;element name="tableTemplate" type="{}tableBlockDTO" minOccurs="0"/>
 *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="widthType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tableBlockDTO", propOrder = {
    "allTableTemplates",
    "cells",
    "columns",
    "footerRowCount",
    "headerRowCount",
    "isTemplate",
    "locked",
    "rows",
    "tableDataHolders",
    "tableStyle",
    "tableTemplate",
    "width",
    "widthType"
})
public class TableBlockDTO
    extends ContentBlockDTO
{

    protected TableBlockDTO.AllTableTemplates allTableTemplates;
    protected TableBlockDTO.Cells cells;
    protected TableBlockDTO.Columns columns;
    protected Integer footerRowCount;
    protected Integer headerRowCount;
    protected Boolean isTemplate;
    protected Boolean locked;
    protected TableBlockDTO.Rows rows;
    protected TableBlockDTO.TableDataHolders tableDataHolders;
    protected TableStyleDTO tableStyle;
    protected TableBlockDTO tableTemplate;
    protected Double width;
    protected String widthType;

    /**
     * Gets the value of the allTableTemplates property.
     * 
     * @return
     *     possible object is
     *     {@link TableBlockDTO.AllTableTemplates }
     *     
     */
    public TableBlockDTO.AllTableTemplates getAllTableTemplates() {
        return allTableTemplates;
    }

    /**
     * Sets the value of the allTableTemplates property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableBlockDTO.AllTableTemplates }
     *     
     */
    public void setAllTableTemplates(TableBlockDTO.AllTableTemplates value) {
        this.allTableTemplates = value;
    }

    /**
     * Gets the value of the cells property.
     * 
     * @return
     *     possible object is
     *     {@link TableBlockDTO.Cells }
     *     
     */
    public TableBlockDTO.Cells getCells() {
        return cells;
    }

    /**
     * Sets the value of the cells property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableBlockDTO.Cells }
     *     
     */
    public void setCells(TableBlockDTO.Cells value) {
        this.cells = value;
    }

    /**
     * Gets the value of the columns property.
     * 
     * @return
     *     possible object is
     *     {@link TableBlockDTO.Columns }
     *     
     */
    public TableBlockDTO.Columns getColumns() {
        return columns;
    }

    /**
     * Sets the value of the columns property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableBlockDTO.Columns }
     *     
     */
    public void setColumns(TableBlockDTO.Columns value) {
        this.columns = value;
    }

    /**
     * Gets the value of the footerRowCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFooterRowCount() {
        return footerRowCount;
    }

    /**
     * Sets the value of the footerRowCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFooterRowCount(Integer value) {
        this.footerRowCount = value;
    }

    /**
     * Gets the value of the headerRowCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHeaderRowCount() {
        return headerRowCount;
    }

    /**
     * Sets the value of the headerRowCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHeaderRowCount(Integer value) {
        this.headerRowCount = value;
    }

    /**
     * Gets the value of the isTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTemplate() {
        return isTemplate;
    }

    /**
     * Sets the value of the isTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTemplate(Boolean value) {
        this.isTemplate = value;
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
     * Gets the value of the rows property.
     * 
     * @return
     *     possible object is
     *     {@link TableBlockDTO.Rows }
     *     
     */
    public TableBlockDTO.Rows getRows() {
        return rows;
    }

    /**
     * Sets the value of the rows property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableBlockDTO.Rows }
     *     
     */
    public void setRows(TableBlockDTO.Rows value) {
        this.rows = value;
    }

    /**
     * Gets the value of the tableDataHolders property.
     * 
     * @return
     *     possible object is
     *     {@link TableBlockDTO.TableDataHolders }
     *     
     */
    public TableBlockDTO.TableDataHolders getTableDataHolders() {
        return tableDataHolders;
    }

    /**
     * Sets the value of the tableDataHolders property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableBlockDTO.TableDataHolders }
     *     
     */
    public void setTableDataHolders(TableBlockDTO.TableDataHolders value) {
        this.tableDataHolders = value;
    }

    /**
     * Gets the value of the tableStyle property.
     * 
     * @return
     *     possible object is
     *     {@link TableStyleDTO }
     *     
     */
    public TableStyleDTO getTableStyle() {
        return tableStyle;
    }

    /**
     * Sets the value of the tableStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableStyleDTO }
     *     
     */
    public void setTableStyle(TableStyleDTO value) {
        this.tableStyle = value;
    }

    /**
     * Gets the value of the tableTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link TableBlockDTO }
     *     
     */
    public TableBlockDTO getTableTemplate() {
        return tableTemplate;
    }

    /**
     * Sets the value of the tableTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableBlockDTO }
     *     
     */
    public void setTableTemplate(TableBlockDTO value) {
        this.tableTemplate = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWidth(Double value) {
        this.width = value;
    }

    /**
     * Gets the value of the widthType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidthType() {
        return widthType;
    }

    /**
     * Sets the value of the widthType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidthType(String value) {
        this.widthType = value;
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
     *         &lt;element name="tableBlock" type="{}tableBlockDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "tableBlock"
    })
    public static class AllTableTemplates {

        protected List<TableBlockDTO> tableBlock;

        /**
         * Gets the value of the tableBlock property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tableBlock property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTableBlock().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TableBlockDTO }
         * 
         * 
         */
        public List<TableBlockDTO> getTableBlock() {
            if (tableBlock == null) {
                tableBlock = new ArrayList<TableBlockDTO>();
            }
            return this.tableBlock;
        }

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
     *         &lt;element name="cellEntry" type="{}cellEntryDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "cellEntry"
    })
    public static class Cells {

        protected List<CellEntryDTO> cellEntry;

        /**
         * Gets the value of the cellEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cellEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCellEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CellEntryDTO }
         * 
         * 
         */
        public List<CellEntryDTO> getCellEntry() {
            if (cellEntry == null) {
                cellEntry = new ArrayList<CellEntryDTO>();
            }
            return this.cellEntry;
        }

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
     *         &lt;element name="columnEntry" type="{}columnEntryDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "columnEntry"
    })
    public static class Columns {

        protected List<ColumnEntryDTO> columnEntry;

        /**
         * Gets the value of the columnEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the columnEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getColumnEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ColumnEntryDTO }
         * 
         * 
         */
        public List<ColumnEntryDTO> getColumnEntry() {
            if (columnEntry == null) {
                columnEntry = new ArrayList<ColumnEntryDTO>();
            }
            return this.columnEntry;
        }

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
     *         &lt;element name="rowEntry" type="{}rowEntryDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "rowEntry"
    })
    public static class Rows {

        protected List<RowEntryDTO> rowEntry;

        /**
         * Gets the value of the rowEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rowEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRowEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RowEntryDTO }
         * 
         * 
         */
        public List<RowEntryDTO> getRowEntry() {
            if (rowEntry == null) {
                rowEntry = new ArrayList<RowEntryDTO>();
            }
            return this.rowEntry;
        }

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
     *         &lt;element name="abstractTableDataHolder" type="{}abstractTableDataHolderDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "abstractTableDataHolder"
    })
    public static class TableDataHolders {

        protected List<AbstractTableDataHolderDTO> abstractTableDataHolder;

        /**
         * Gets the value of the abstractTableDataHolder property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the abstractTableDataHolder property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAbstractTableDataHolder().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AbstractTableDataHolderDTO }
         * 
         * 
         */
        public List<AbstractTableDataHolderDTO> getAbstractTableDataHolder() {
            if (abstractTableDataHolder == null) {
                abstractTableDataHolder = new ArrayList<AbstractTableDataHolderDTO>();
            }
            return this.abstractTableDataHolder;
        }

    }

}