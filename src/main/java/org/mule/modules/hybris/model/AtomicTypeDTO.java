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
 * <p>Java class for atomicTypeDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="atomicTypeDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}typeDTO">
 *       &lt;sequence>
 *         &lt;element name="javaClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subtypes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="atomicType" type="{}atomicTypeDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="superType" type="{}atomicTypeDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "atomicTypeDTO", propOrder = {
    "javaClass",
    "subtypes",
    "superType"
})
public class AtomicTypeDTO
    extends TypeDTO
{

    protected String javaClass;
    protected AtomicTypeDTO.Subtypes subtypes;
    protected AtomicTypeDTO superType;

    /**
     * Gets the value of the javaClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJavaClass() {
        return javaClass;
    }

    /**
     * Sets the value of the javaClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJavaClass(String value) {
        this.javaClass = value;
    }

    /**
     * Gets the value of the subtypes property.
     * 
     * @return
     *     possible object is
     *     {@link AtomicTypeDTO.Subtypes }
     *     
     */
    public AtomicTypeDTO.Subtypes getSubtypes() {
        return subtypes;
    }

    /**
     * Sets the value of the subtypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AtomicTypeDTO.Subtypes }
     *     
     */
    public void setSubtypes(AtomicTypeDTO.Subtypes value) {
        this.subtypes = value;
    }

    /**
     * Gets the value of the superType property.
     * 
     * @return
     *     possible object is
     *     {@link AtomicTypeDTO }
     *     
     */
    public AtomicTypeDTO getSuperType() {
        return superType;
    }

    /**
     * Sets the value of the superType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AtomicTypeDTO }
     *     
     */
    public void setSuperType(AtomicTypeDTO value) {
        this.superType = value;
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
     *         &lt;element name="atomicType" type="{}atomicTypeDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "atomicType"
    })
    public static class Subtypes {

        protected List<AtomicTypeDTO> atomicType;

        /**
         * Gets the value of the atomicType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the atomicType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAtomicType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AtomicTypeDTO }
         * 
         * 
         */
        public List<AtomicTypeDTO> getAtomicType() {
            if (atomicType == null) {
                atomicType = new ArrayList<AtomicTypeDTO>();
            }
            return this.atomicType;
        }

    }

}
