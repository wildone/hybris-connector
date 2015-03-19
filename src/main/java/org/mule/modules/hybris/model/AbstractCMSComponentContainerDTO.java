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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for abstractCMSComponentContainerDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="abstractCMSComponentContainerDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}abstractCMSComponentDTO">
 *       &lt;sequence>
 *         &lt;element name="currentCMSComponents" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="simpleCMSComponent" type="{}simpleCMSComponentDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="simpleCMSComponents" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="simpleCMSComponent" type="{}simpleCMSComponentDTO" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "abstractCMSComponentContainerDTO", propOrder = {
    "currentCMSComponents",
    "simpleCMSComponents"
})
@XmlSeeAlso({
    AbTestCMSComponentContainerDTO.class,
    CmsTabParagraphContainerDTO.class
})
public class AbstractCMSComponentContainerDTO
    extends AbstractCMSComponentDTO
{

    protected AbstractCMSComponentContainerDTO.CurrentCMSComponents currentCMSComponents;
    protected AbstractCMSComponentContainerDTO.SimpleCMSComponents simpleCMSComponents;

    /**
     * Gets the value of the currentCMSComponents property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractCMSComponentContainerDTO.CurrentCMSComponents }
     *     
     */
    public AbstractCMSComponentContainerDTO.CurrentCMSComponents getCurrentCMSComponents() {
        return currentCMSComponents;
    }

    /**
     * Sets the value of the currentCMSComponents property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractCMSComponentContainerDTO.CurrentCMSComponents }
     *     
     */
    public void setCurrentCMSComponents(AbstractCMSComponentContainerDTO.CurrentCMSComponents value) {
        this.currentCMSComponents = value;
    }

    /**
     * Gets the value of the simpleCMSComponents property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractCMSComponentContainerDTO.SimpleCMSComponents }
     *     
     */
    public AbstractCMSComponentContainerDTO.SimpleCMSComponents getSimpleCMSComponents() {
        return simpleCMSComponents;
    }

    /**
     * Sets the value of the simpleCMSComponents property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractCMSComponentContainerDTO.SimpleCMSComponents }
     *     
     */
    public void setSimpleCMSComponents(AbstractCMSComponentContainerDTO.SimpleCMSComponents value) {
        this.simpleCMSComponents = value;
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
     *         &lt;element name="simpleCMSComponent" type="{}simpleCMSComponentDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "simpleCMSComponent"
    })
    public static class CurrentCMSComponents {

        protected List<SimpleCMSComponentDTO> simpleCMSComponent;

        /**
         * Gets the value of the simpleCMSComponent property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the simpleCMSComponent property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSimpleCMSComponent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SimpleCMSComponentDTO }
         * 
         * 
         */
        public List<SimpleCMSComponentDTO> getSimpleCMSComponent() {
            if (simpleCMSComponent == null) {
                simpleCMSComponent = new ArrayList<SimpleCMSComponentDTO>();
            }
            return this.simpleCMSComponent;
        }

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
     *         &lt;element name="simpleCMSComponent" type="{}simpleCMSComponentDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "simpleCMSComponent"
    })
    public static class SimpleCMSComponents {

        protected List<SimpleCMSComponentDTO> simpleCMSComponent;

        /**
         * Gets the value of the simpleCMSComponent property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the simpleCMSComponent property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSimpleCMSComponent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SimpleCMSComponentDTO }
         * 
         * 
         */
        public List<SimpleCMSComponentDTO> getSimpleCMSComponent() {
            if (simpleCMSComponent == null) {
                simpleCMSComponent = new ArrayList<SimpleCMSComponentDTO>();
            }
            return this.simpleCMSComponent;
        }

    }

}