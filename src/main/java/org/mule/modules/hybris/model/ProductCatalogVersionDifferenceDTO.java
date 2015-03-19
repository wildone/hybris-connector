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
 * <p>Java class for productCatalogVersionDifferenceDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="productCatalogVersionDifferenceDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}catalogVersionDifferenceDTO">
 *       &lt;sequence>
 *         &lt;element name="mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceProduct" type="{}productDTO" minOccurs="0"/>
 *         &lt;element name="sourceProductApprovalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="targetProduct" type="{}productDTO" minOccurs="0"/>
 *         &lt;element name="targetProductApprovalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productCatalogVersionDifferenceDTO", propOrder = {
    "mode",
    "sourceProduct",
    "sourceProductApprovalStatus",
    "targetProduct",
    "targetProductApprovalStatus"
})
public class ProductCatalogVersionDifferenceDTO
    extends CatalogVersionDifferenceDTO
{

    protected String mode;
    protected ProductDTO sourceProduct;
    protected String sourceProductApprovalStatus;
    protected ProductDTO targetProduct;
    protected String targetProductApprovalStatus;

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
    }

    /**
     * Gets the value of the sourceProduct property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDTO }
     *     
     */
    public ProductDTO getSourceProduct() {
        return sourceProduct;
    }

    /**
     * Sets the value of the sourceProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDTO }
     *     
     */
    public void setSourceProduct(ProductDTO value) {
        this.sourceProduct = value;
    }

    /**
     * Gets the value of the sourceProductApprovalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceProductApprovalStatus() {
        return sourceProductApprovalStatus;
    }

    /**
     * Sets the value of the sourceProductApprovalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceProductApprovalStatus(String value) {
        this.sourceProductApprovalStatus = value;
    }

    /**
     * Gets the value of the targetProduct property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDTO }
     *     
     */
    public ProductDTO getTargetProduct() {
        return targetProduct;
    }

    /**
     * Sets the value of the targetProduct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDTO }
     *     
     */
    public void setTargetProduct(ProductDTO value) {
        this.targetProduct = value;
    }

    /**
     * Gets the value of the targetProductApprovalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetProductApprovalStatus() {
        return targetProductApprovalStatus;
    }

    /**
     * Sets the value of the targetProductApprovalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetProductApprovalStatus(String value) {
        this.targetProductApprovalStatus = value;
    }

}