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
 * <p>Java class for cmsRestrictionActionDefinitionDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cmsRestrictionActionDefinitionDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}btgOutputActionDefinitionDTO">
 *       &lt;sequence>
 *         &lt;element name="inverted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="segmentRestrictions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="btgSegmentRestriction" type="{}btgSegmentRestrictionDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cmsRestrictionActionDefinitionDTO", propOrder = {
    "inverted",
    "segmentRestrictions"
})
public class CmsRestrictionActionDefinitionDTO
    extends BtgOutputActionDefinitionDTO
{

    protected Boolean inverted;
    protected CmsRestrictionActionDefinitionDTO.SegmentRestrictions segmentRestrictions;

    /**
     * Gets the value of the inverted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInverted() {
        return inverted;
    }

    /**
     * Sets the value of the inverted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInverted(Boolean value) {
        this.inverted = value;
    }

    /**
     * Gets the value of the segmentRestrictions property.
     * 
     * @return
     *     possible object is
     *     {@link CmsRestrictionActionDefinitionDTO.SegmentRestrictions }
     *     
     */
    public CmsRestrictionActionDefinitionDTO.SegmentRestrictions getSegmentRestrictions() {
        return segmentRestrictions;
    }

    /**
     * Sets the value of the segmentRestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmsRestrictionActionDefinitionDTO.SegmentRestrictions }
     *     
     */
    public void setSegmentRestrictions(CmsRestrictionActionDefinitionDTO.SegmentRestrictions value) {
        this.segmentRestrictions = value;
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
     *         &lt;element name="btgSegmentRestriction" type="{}btgSegmentRestrictionDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "btgSegmentRestriction"
    })
    public static class SegmentRestrictions {

        protected List<BtgSegmentRestrictionDTO> btgSegmentRestriction;

        /**
         * Gets the value of the btgSegmentRestriction property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the btgSegmentRestriction property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBtgSegmentRestriction().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BtgSegmentRestrictionDTO }
         * 
         * 
         */
        public List<BtgSegmentRestrictionDTO> getBtgSegmentRestriction() {
            if (btgSegmentRestriction == null) {
                btgSegmentRestriction = new ArrayList<BtgSegmentRestrictionDTO>();
            }
            return this.btgSegmentRestriction;
        }

    }

}
