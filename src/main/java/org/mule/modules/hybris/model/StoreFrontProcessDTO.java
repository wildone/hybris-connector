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
 * <p>Java class for storeFrontProcessDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="storeFrontProcessDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}businessProcessDTO">
 *       &lt;sequence>
 *         &lt;element name="site" type="{}baseSiteDTO" minOccurs="0"/>
 *         &lt;element name="store" type="{}baseStoreDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "storeFrontProcessDTO", propOrder = {
    "site",
    "store"
})
@XmlSeeAlso({
    StoreFrontCustomerProcessDTO.class
})
public class StoreFrontProcessDTO
    extends BusinessProcessDTO
{

    protected BaseSiteDTO site;
    protected BaseStoreDTO store;

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link BaseSiteDTO }
     *     
     */
    public BaseSiteDTO getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseSiteDTO }
     *     
     */
    public void setSite(BaseSiteDTO value) {
        this.site = value;
    }

    /**
     * Gets the value of the store property.
     * 
     * @return
     *     possible object is
     *     {@link BaseStoreDTO }
     *     
     */
    public BaseStoreDTO getStore() {
        return store;
    }

    /**
     * Sets the value of the store property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseStoreDTO }
     *     
     */
    public void setStore(BaseStoreDTO value) {
        this.store = value;
    }

}