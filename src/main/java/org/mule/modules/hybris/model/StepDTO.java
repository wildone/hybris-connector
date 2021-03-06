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
 * <p>Java class for stepDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stepDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}itemDTO">
 *       &lt;sequence>
 *         &lt;element name="batchJob" type="{}batchJobDTO" minOccurs="0"/>
 *         &lt;element name="errorMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="synchronous" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stepDTO", propOrder = {
    "batchJob",
    "errorMode",
    "synchronous"
})
@XmlSeeAlso({
    BmeCatImportStepDTO.class,
    MediaProcessorStepDTO.class
})
public class StepDTO
    extends ItemDTO
{

    protected BatchJobDTO batchJob;
    protected String errorMode;
    protected Boolean synchronous;
    @XmlAttribute(name = "code")
    protected String code;
    @XmlAttribute(name = "sequenceNumber")
    protected Integer sequenceNumber;

    /**
     * Gets the value of the batchJob property.
     * 
     * @return
     *     possible object is
     *     {@link BatchJobDTO }
     *     
     */
    public BatchJobDTO getBatchJob() {
        return batchJob;
    }

    /**
     * Sets the value of the batchJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchJobDTO }
     *     
     */
    public void setBatchJob(BatchJobDTO value) {
        this.batchJob = value;
    }

    /**
     * Gets the value of the errorMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMode() {
        return errorMode;
    }

    /**
     * Sets the value of the errorMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMode(String value) {
        this.errorMode = value;
    }

    /**
     * Gets the value of the synchronous property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSynchronous() {
        return synchronous;
    }

    /**
     * Sets the value of the synchronous property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSynchronous(Boolean value) {
        this.synchronous = value;
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

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSequenceNumber(Integer value) {
        this.sequenceNumber = value;
    }

}
