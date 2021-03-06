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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contentPageDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contentPageDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}abstractPageDTO">
 *       &lt;sequence>
 *         &lt;element name="bannerComponets" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="bannerComponent" type="{}bannerComponentDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flashComponents" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="flashComponent" type="{}flashComponentDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="homepage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="keywords" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="labelOrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="linkComponents" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cMSLinkComponent" type="{}cmsLinkComponentDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="navigationNodes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cMSNavigationNode" type="{}cmsNavigationNodeDTO" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "contentPageDTO", propOrder = {
    "bannerComponets",
    "description",
    "flashComponents",
    "homepage",
    "keywords",
    "label",
    "labelOrId",
    "linkComponents",
    "navigationNodes"
})
public class ContentPageDTO
    extends AbstractPageDTO
{

    protected ContentPageDTO.BannerComponets bannerComponets;
    protected String description;
    protected ContentPageDTO.FlashComponents flashComponents;
    protected boolean homepage;
    protected String keywords;
    protected String label;
    protected String labelOrId;
    protected ContentPageDTO.LinkComponents linkComponents;
    protected ContentPageDTO.NavigationNodes navigationNodes;

    /**
     * Gets the value of the bannerComponets property.
     * 
     * @return
     *     possible object is
     *     {@link ContentPageDTO.BannerComponets }
     *     
     */
    public ContentPageDTO.BannerComponets getBannerComponets() {
        return bannerComponets;
    }

    /**
     * Sets the value of the bannerComponets property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentPageDTO.BannerComponets }
     *     
     */
    public void setBannerComponets(ContentPageDTO.BannerComponets value) {
        this.bannerComponets = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the flashComponents property.
     * 
     * @return
     *     possible object is
     *     {@link ContentPageDTO.FlashComponents }
     *     
     */
    public ContentPageDTO.FlashComponents getFlashComponents() {
        return flashComponents;
    }

    /**
     * Sets the value of the flashComponents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentPageDTO.FlashComponents }
     *     
     */
    public void setFlashComponents(ContentPageDTO.FlashComponents value) {
        this.flashComponents = value;
    }

    /**
     * Gets the value of the homepage property.
     * 
     */
    public boolean isHomepage() {
        return homepage;
    }

    /**
     * Sets the value of the homepage property.
     * 
     */
    public void setHomepage(boolean value) {
        this.homepage = value;
    }

    /**
     * Gets the value of the keywords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeywords() {
        return keywords;
    }

    /**
     * Sets the value of the keywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeywords(String value) {
        this.keywords = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the labelOrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelOrId() {
        return labelOrId;
    }

    /**
     * Sets the value of the labelOrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelOrId(String value) {
        this.labelOrId = value;
    }

    /**
     * Gets the value of the linkComponents property.
     * 
     * @return
     *     possible object is
     *     {@link ContentPageDTO.LinkComponents }
     *     
     */
    public ContentPageDTO.LinkComponents getLinkComponents() {
        return linkComponents;
    }

    /**
     * Sets the value of the linkComponents property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentPageDTO.LinkComponents }
     *     
     */
    public void setLinkComponents(ContentPageDTO.LinkComponents value) {
        this.linkComponents = value;
    }

    /**
     * Gets the value of the navigationNodes property.
     * 
     * @return
     *     possible object is
     *     {@link ContentPageDTO.NavigationNodes }
     *     
     */
    public ContentPageDTO.NavigationNodes getNavigationNodes() {
        return navigationNodes;
    }

    /**
     * Sets the value of the navigationNodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentPageDTO.NavigationNodes }
     *     
     */
    public void setNavigationNodes(ContentPageDTO.NavigationNodes value) {
        this.navigationNodes = value;
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
     *         &lt;element name="bannerComponent" type="{}bannerComponentDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "bannerComponent"
    })
    public static class BannerComponets {

        protected List<BannerComponentDTO> bannerComponent;

        /**
         * Gets the value of the bannerComponent property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bannerComponent property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBannerComponent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BannerComponentDTO }
         * 
         * 
         */
        public List<BannerComponentDTO> getBannerComponent() {
            if (bannerComponent == null) {
                bannerComponent = new ArrayList<BannerComponentDTO>();
            }
            return this.bannerComponent;
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
     *         &lt;element name="flashComponent" type="{}flashComponentDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "flashComponent"
    })
    public static class FlashComponents {

        protected List<FlashComponentDTO> flashComponent;

        /**
         * Gets the value of the flashComponent property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flashComponent property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlashComponent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FlashComponentDTO }
         * 
         * 
         */
        public List<FlashComponentDTO> getFlashComponent() {
            if (flashComponent == null) {
                flashComponent = new ArrayList<FlashComponentDTO>();
            }
            return this.flashComponent;
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
     *         &lt;element name="cMSLinkComponent" type="{}cmsLinkComponentDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "cmsLinkComponent"
    })
    public static class LinkComponents {

        @XmlElement(name = "cMSLinkComponent")
        protected List<CmsLinkComponentDTO> cmsLinkComponent;

        /**
         * Gets the value of the cmsLinkComponent property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cmsLinkComponent property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCMSLinkComponent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CmsLinkComponentDTO }
         * 
         * 
         */
        public List<CmsLinkComponentDTO> getCMSLinkComponent() {
            if (cmsLinkComponent == null) {
                cmsLinkComponent = new ArrayList<CmsLinkComponentDTO>();
            }
            return this.cmsLinkComponent;
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
     *         &lt;element name="cMSNavigationNode" type="{}cmsNavigationNodeDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "cmsNavigationNode"
    })
    public static class NavigationNodes {

        @XmlElement(name = "cMSNavigationNode")
        protected List<CmsNavigationNodeDTO> cmsNavigationNode;

        /**
         * Gets the value of the cmsNavigationNode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cmsNavigationNode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCMSNavigationNode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CmsNavigationNodeDTO }
         * 
         * 
         */
        public List<CmsNavigationNodeDTO> getCMSNavigationNode() {
            if (cmsNavigationNode == null) {
                cmsNavigationNode = new ArrayList<CmsNavigationNodeDTO>();
            }
            return this.cmsNavigationNode;
        }

    }

}
