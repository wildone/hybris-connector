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
 * <p>Java class for languageConfigurationDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="languageConfigurationDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}abstractLuceneItemDTO">
 *       &lt;sequence>
 *         &lt;element name="analyzerDefinition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indexedLanguage" type="{}languageDTO" minOccurs="0"/>
 *         &lt;element name="luceneIndex" type="{}luceneIndexDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "languageConfigurationDTO", propOrder = {
    "analyzerDefinition",
    "indexedLanguage",
    "luceneIndex"
})
public class LanguageConfigurationDTO
    extends AbstractLuceneItemDTO
{

    protected String analyzerDefinition;
    protected LanguageDTO indexedLanguage;
    protected LuceneIndexDTO luceneIndex;

    /**
     * Gets the value of the analyzerDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnalyzerDefinition() {
        return analyzerDefinition;
    }

    /**
     * Sets the value of the analyzerDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnalyzerDefinition(String value) {
        this.analyzerDefinition = value;
    }

    /**
     * Gets the value of the indexedLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageDTO }
     *     
     */
    public LanguageDTO getIndexedLanguage() {
        return indexedLanguage;
    }

    /**
     * Sets the value of the indexedLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageDTO }
     *     
     */
    public void setIndexedLanguage(LanguageDTO value) {
        this.indexedLanguage = value;
    }

    /**
     * Gets the value of the luceneIndex property.
     * 
     * @return
     *     possible object is
     *     {@link LuceneIndexDTO }
     *     
     */
    public LuceneIndexDTO getLuceneIndex() {
        return luceneIndex;
    }

    /**
     * Sets the value of the luceneIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link LuceneIndexDTO }
     *     
     */
    public void setLuceneIndex(LuceneIndexDTO value) {
        this.luceneIndex = value;
    }

}
