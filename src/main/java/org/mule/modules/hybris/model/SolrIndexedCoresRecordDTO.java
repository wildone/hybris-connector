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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for solrIndexedCoresRecordDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="solrIndexedCoresRecordDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}itemDTO">
 *       &lt;sequence>
 *         &lt;element name="currentIndexDataSubDirectory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indexName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indexOperations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="solrIndexOperationRecord" type="{}solrIndexOperationRecordDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="indexTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="serverMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="coreName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "solrIndexedCoresRecordDTO", propOrder = {
    "currentIndexDataSubDirectory",
    "indexName",
    "indexOperations",
    "indexTime",
    "serverMode"
})
public class SolrIndexedCoresRecordDTO
    extends ItemDTO
{

    protected String currentIndexDataSubDirectory;
    protected String indexName;
    protected SolrIndexedCoresRecordDTO.IndexOperations indexOperations;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar indexTime;
    protected String serverMode;
    @XmlAttribute(name = "coreName")
    protected String coreName;

    /**
     * Gets the value of the currentIndexDataSubDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentIndexDataSubDirectory() {
        return currentIndexDataSubDirectory;
    }

    /**
     * Sets the value of the currentIndexDataSubDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentIndexDataSubDirectory(String value) {
        this.currentIndexDataSubDirectory = value;
    }

    /**
     * Gets the value of the indexName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * Sets the value of the indexName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndexName(String value) {
        this.indexName = value;
    }

    /**
     * Gets the value of the indexOperations property.
     * 
     * @return
     *     possible object is
     *     {@link SolrIndexedCoresRecordDTO.IndexOperations }
     *     
     */
    public SolrIndexedCoresRecordDTO.IndexOperations getIndexOperations() {
        return indexOperations;
    }

    /**
     * Sets the value of the indexOperations property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolrIndexedCoresRecordDTO.IndexOperations }
     *     
     */
    public void setIndexOperations(SolrIndexedCoresRecordDTO.IndexOperations value) {
        this.indexOperations = value;
    }

    /**
     * Gets the value of the indexTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIndexTime() {
        return indexTime;
    }

    /**
     * Sets the value of the indexTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIndexTime(XMLGregorianCalendar value) {
        this.indexTime = value;
    }

    /**
     * Gets the value of the serverMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerMode() {
        return serverMode;
    }

    /**
     * Sets the value of the serverMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerMode(String value) {
        this.serverMode = value;
    }

    /**
     * Gets the value of the coreName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoreName() {
        return coreName;
    }

    /**
     * Sets the value of the coreName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoreName(String value) {
        this.coreName = value;
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
     *         &lt;element name="solrIndexOperationRecord" type="{}solrIndexOperationRecordDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "solrIndexOperationRecord"
    })
    public static class IndexOperations {

        protected List<SolrIndexOperationRecordDTO> solrIndexOperationRecord;

        /**
         * Gets the value of the solrIndexOperationRecord property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the solrIndexOperationRecord property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSolrIndexOperationRecord().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SolrIndexOperationRecordDTO }
         * 
         * 
         */
        public List<SolrIndexOperationRecordDTO> getSolrIndexOperationRecord() {
            if (solrIndexOperationRecord == null) {
                solrIndexOperationRecord = new ArrayList<SolrIndexOperationRecordDTO>();
            }
            return this.solrIndexOperationRecord;
        }

    }

}
