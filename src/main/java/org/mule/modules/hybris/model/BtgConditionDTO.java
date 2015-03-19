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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for btgConditionDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="btgConditionDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}btgItemDTO">
 *       &lt;sequence>
 *         &lt;element name="beanId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="evaluationScope" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="results" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="bTGConditionResult" type="{}btgConditionResultDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="rule" type="{}btgRuleDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "btgConditionDTO", propOrder = {
    "beanId",
    "evaluationScope",
    "results",
    "rule"
})
@XmlSeeAlso({
    BtgExpressionDTO.class
})
public class BtgConditionDTO
    extends BtgItemDTO
{

    protected String beanId;
    protected String evaluationScope;
    protected BtgConditionDTO.Results results;
    protected BtgRuleDTO rule;

    /**
     * Gets the value of the beanId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeanId() {
        return beanId;
    }

    /**
     * Sets the value of the beanId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeanId(String value) {
        this.beanId = value;
    }

    /**
     * Gets the value of the evaluationScope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvaluationScope() {
        return evaluationScope;
    }

    /**
     * Sets the value of the evaluationScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvaluationScope(String value) {
        this.evaluationScope = value;
    }

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link BtgConditionDTO.Results }
     *     
     */
    public BtgConditionDTO.Results getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link BtgConditionDTO.Results }
     *     
     */
    public void setResults(BtgConditionDTO.Results value) {
        this.results = value;
    }

    /**
     * Gets the value of the rule property.
     * 
     * @return
     *     possible object is
     *     {@link BtgRuleDTO }
     *     
     */
    public BtgRuleDTO getRule() {
        return rule;
    }

    /**
     * Sets the value of the rule property.
     * 
     * @param value
     *     allowed object is
     *     {@link BtgRuleDTO }
     *     
     */
    public void setRule(BtgRuleDTO value) {
        this.rule = value;
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
     *         &lt;element name="bTGConditionResult" type="{}btgConditionResultDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "btgConditionResult"
    })
    public static class Results {

        @XmlElement(name = "bTGConditionResult")
        protected List<BtgConditionResultDTO> btgConditionResult;

        /**
         * Gets the value of the btgConditionResult property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the btgConditionResult property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBTGConditionResult().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BtgConditionResultDTO }
         * 
         * 
         */
        public List<BtgConditionResultDTO> getBTGConditionResult() {
            if (btgConditionResult == null) {
                btgConditionResult = new ArrayList<BtgConditionResultDTO>();
            }
            return this.btgConditionResult;
        }

    }

}