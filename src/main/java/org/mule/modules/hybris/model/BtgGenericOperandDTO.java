//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.29 at 12:35:53 PM GMT 
//


package org.mule.modules.hybris.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for btgGenericOperandDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="btgGenericOperandDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}btgOperandDTO">
 *       &lt;sequence>
 *         &lt;element name="beanId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "btgGenericOperandDTO", propOrder = {
    "beanId"
})
@XmlSeeAlso({
    BtgAbstractCartOperandDTO.class,
    BtgAbstractWCMSOperandDTO.class,
    BtgAbstractScriptOperandDTO.class,
    BtgAbstractReferenceOperandDTO.class,
    BtgAbstractCustomerOperandDTO.class,
    BtgAbstractOrderOperandDTO.class
})
public class BtgGenericOperandDTO
    extends BtgOperandDTO
{

    protected String beanId;

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

}
