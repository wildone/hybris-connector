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
 * <p>Java class for replenishmentProcessDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="replenishmentProcessDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}storeFrontCustomerProcessDTO">
 *       &lt;sequence>
 *         &lt;element name="cartToOrderCronJob" type="{}cartToOrderCronJobDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "replenishmentProcessDTO", propOrder = {
    "cartToOrderCronJob"
})
public class ReplenishmentProcessDTO
    extends StoreFrontCustomerProcessDTO
{

    protected CartToOrderCronJobDTO cartToOrderCronJob;

    /**
     * Gets the value of the cartToOrderCronJob property.
     * 
     * @return
     *     possible object is
     *     {@link CartToOrderCronJobDTO }
     *     
     */
    public CartToOrderCronJobDTO getCartToOrderCronJob() {
        return cartToOrderCronJob;
    }

    /**
     * Sets the value of the cartToOrderCronJob property.
     * 
     * @param value
     *     allowed object is
     *     {@link CartToOrderCronJobDTO }
     *     
     */
    public void setCartToOrderCronJob(CartToOrderCronJobDTO value) {
        this.cartToOrderCronJob = value;
    }

}
