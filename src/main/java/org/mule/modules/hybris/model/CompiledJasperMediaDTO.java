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
 * <p>Java class for compiledJasperMediaDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="compiledJasperMediaDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}jasperMediaDTO">
 *       &lt;sequence>
 *         &lt;element name="compiledReport" type="{}mediaDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "compiledJasperMediaDTO", propOrder = {
    "compiledReport"
})
public class CompiledJasperMediaDTO
    extends JasperMediaDTO
{

    protected MediaDTO compiledReport;

    /**
     * Gets the value of the compiledReport property.
     * 
     * @return
     *     possible object is
     *     {@link MediaDTO }
     *     
     */
    public MediaDTO getCompiledReport() {
        return compiledReport;
    }

    /**
     * Sets the value of the compiledReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaDTO }
     *     
     */
    public void setCompiledReport(MediaDTO value) {
        this.compiledReport = value;
    }

}