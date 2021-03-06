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
 * <p>Java class for fraudSymptomScoringDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fraudSymptomScoringDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}itemDTO">
 *       &lt;sequence>
 *         &lt;element name="explanation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fraudReport" type="{}fraudReportDTO" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="score" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fraudSymptomScoringDTO", propOrder = {
    "explanation",
    "fraudReport",
    "name",
    "score"
})
public class FraudSymptomScoringDTO
    extends ItemDTO
{

    protected String explanation;
    protected FraudReportDTO fraudReport;
    protected String name;
    protected double score;

    /**
     * Gets the value of the explanation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExplanation() {
        return explanation;
    }

    /**
     * Sets the value of the explanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExplanation(String value) {
        this.explanation = value;
    }

    /**
     * Gets the value of the fraudReport property.
     * 
     * @return
     *     possible object is
     *     {@link FraudReportDTO }
     *     
     */
    public FraudReportDTO getFraudReport() {
        return fraudReport;
    }

    /**
     * Sets the value of the fraudReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link FraudReportDTO }
     *     
     */
    public void setFraudReport(FraudReportDTO value) {
        this.fraudReport = value;
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
     * Gets the value of the score property.
     * 
     */
    public double getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     */
    public void setScore(double value) {
        this.score = value;
    }

}
