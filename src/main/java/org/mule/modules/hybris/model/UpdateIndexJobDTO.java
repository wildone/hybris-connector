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
 * <p>Java class for updateIndexJobDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateIndexJobDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}jobDTO">
 *       &lt;sequence>
 *         &lt;element name="maxUpdatesPerRun" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateIndexJobDTO", propOrder = {
    "maxUpdatesPerRun"
})
public class UpdateIndexJobDTO
    extends JobDTO
{

    protected Integer maxUpdatesPerRun;

    /**
     * Gets the value of the maxUpdatesPerRun property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxUpdatesPerRun() {
        return maxUpdatesPerRun;
    }

    /**
     * Sets the value of the maxUpdatesPerRun property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxUpdatesPerRun(Integer value) {
        this.maxUpdatesPerRun = value;
    }

}