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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for solrIndexConfigDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="solrIndexConfigDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}itemDTO">
 *       &lt;sequence>
 *         &lt;element name="batchSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="exportPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indexMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberOfThreads" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "solrIndexConfigDTO", propOrder = {
    "batchSize",
    "exportPath",
    "indexMode",
    "numberOfThreads"
})
public class SolrIndexConfigDTO
    extends ItemDTO
{

    protected int batchSize;
    protected String exportPath;
    protected String indexMode;
    protected int numberOfThreads;
    @XmlAttribute(name = "name")
    protected String name;

    /**
     * Gets the value of the batchSize property.
     * 
     */
    public int getBatchSize() {
        return batchSize;
    }

    /**
     * Sets the value of the batchSize property.
     * 
     */
    public void setBatchSize(int value) {
        this.batchSize = value;
    }

    /**
     * Gets the value of the exportPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExportPath() {
        return exportPath;
    }

    /**
     * Sets the value of the exportPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportPath(String value) {
        this.exportPath = value;
    }

    /**
     * Gets the value of the indexMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndexMode() {
        return indexMode;
    }

    /**
     * Sets the value of the indexMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndexMode(String value) {
        this.indexMode = value;
    }

    /**
     * Gets the value of the numberOfThreads property.
     * 
     */
    public int getNumberOfThreads() {
        return numberOfThreads;
    }

    /**
     * Sets the value of the numberOfThreads property.
     * 
     */
    public void setNumberOfThreads(int value) {
        this.numberOfThreads = value;
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

}
