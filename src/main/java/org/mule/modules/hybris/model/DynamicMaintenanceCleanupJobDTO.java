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
 * <p>Java class for dynamicMaintenanceCleanupJobDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dynamicMaintenanceCleanupJobDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}maintenanceCleanupJobDTO">
 *       &lt;sequence>
 *         &lt;element name="processScript" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="searchScript" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dynamicMaintenanceCleanupJobDTO", propOrder = {
    "processScript",
    "searchScript"
})
public class DynamicMaintenanceCleanupJobDTO
    extends MaintenanceCleanupJobDTO
{

    protected String processScript;
    protected String searchScript;

    /**
     * Gets the value of the processScript property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessScript() {
        return processScript;
    }

    /**
     * Sets the value of the processScript property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessScript(String value) {
        this.processScript = value;
    }

    /**
     * Gets the value of the searchScript property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchScript() {
        return searchScript;
    }

    /**
     * Sets the value of the searchScript property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchScript(String value) {
        this.searchScript = value;
    }

}
