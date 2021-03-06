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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hyend2CategoryDimensionDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hyend2CategoryDimensionDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}hyend2DimensionDTO">
 *       &lt;sequence>
 *         &lt;element name="indexElementsForCategoriesDims" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="hyend2IndexElement" type="{}hyend2IndexElementDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="rootCategory" type="{}categoryDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hyend2CategoryDimensionDTO", propOrder = {
    "indexElementsForCategoriesDims",
    "rootCategory"
})
public class Hyend2CategoryDimensionDTO
    extends Hyend2DimensionDTO
{

    protected Hyend2CategoryDimensionDTO.IndexElementsForCategoriesDims indexElementsForCategoriesDims;
    protected CategoryDTO rootCategory;

    /**
     * Gets the value of the indexElementsForCategoriesDims property.
     * 
     * @return
     *     possible object is
     *     {@link Hyend2CategoryDimensionDTO.IndexElementsForCategoriesDims }
     *     
     */
    public Hyend2CategoryDimensionDTO.IndexElementsForCategoriesDims getIndexElementsForCategoriesDims() {
        return indexElementsForCategoriesDims;
    }

    /**
     * Sets the value of the indexElementsForCategoriesDims property.
     * 
     * @param value
     *     allowed object is
     *     {@link Hyend2CategoryDimensionDTO.IndexElementsForCategoriesDims }
     *     
     */
    public void setIndexElementsForCategoriesDims(Hyend2CategoryDimensionDTO.IndexElementsForCategoriesDims value) {
        this.indexElementsForCategoriesDims = value;
    }

    /**
     * Gets the value of the rootCategory property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryDTO }
     *     
     */
    public CategoryDTO getRootCategory() {
        return rootCategory;
    }

    /**
     * Sets the value of the rootCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryDTO }
     *     
     */
    public void setRootCategory(CategoryDTO value) {
        this.rootCategory = value;
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
     *         &lt;element name="hyend2IndexElement" type="{}hyend2IndexElementDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "hyend2IndexElement"
    })
    public static class IndexElementsForCategoriesDims {

        protected List<Hyend2IndexElementDTO> hyend2IndexElement;

        /**
         * Gets the value of the hyend2IndexElement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hyend2IndexElement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHyend2IndexElement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Hyend2IndexElementDTO }
         * 
         * 
         */
        public List<Hyend2IndexElementDTO> getHyend2IndexElement() {
            if (hyend2IndexElement == null) {
                hyend2IndexElement = new ArrayList<Hyend2IndexElementDTO>();
            }
            return this.hyend2IndexElement;
        }

    }

}
