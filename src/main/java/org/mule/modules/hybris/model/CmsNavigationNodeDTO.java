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
 * <p>Java class for cmsNavigationNodeDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cmsNavigationNodeDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}cmsItemDTO">
 *       &lt;sequence>
 *         &lt;element name="children" minOccurs="0">
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
 *         &lt;element name="entries" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cMSNavigationEntry" type="{}cmsNavigationEntryDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="links" minOccurs="0">
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
 *         &lt;element name="pages" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="contentPage" type="{}contentPageDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="parent" type="{}cmsNavigationNodeDTO" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cmsNavigationNodeDTO", propOrder = {
    "children",
    "entries",
    "links",
    "pages",
    "parent",
    "title",
    "visible"
})
public class CmsNavigationNodeDTO
    extends CmsItemDTO
{

    protected CmsNavigationNodeDTO.Children children;
    protected CmsNavigationNodeDTO.Entries entries;
    protected CmsNavigationNodeDTO.Links links;
    protected CmsNavigationNodeDTO.Pages pages;
    protected CmsNavigationNodeDTO parent;
    protected String title;
    protected boolean visible;

    /**
     * Gets the value of the children property.
     * 
     * @return
     *     possible object is
     *     {@link CmsNavigationNodeDTO.Children }
     *     
     */
    public CmsNavigationNodeDTO.Children getChildren() {
        return children;
    }

    /**
     * Sets the value of the children property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmsNavigationNodeDTO.Children }
     *     
     */
    public void setChildren(CmsNavigationNodeDTO.Children value) {
        this.children = value;
    }

    /**
     * Gets the value of the entries property.
     * 
     * @return
     *     possible object is
     *     {@link CmsNavigationNodeDTO.Entries }
     *     
     */
    public CmsNavigationNodeDTO.Entries getEntries() {
        return entries;
    }

    /**
     * Sets the value of the entries property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmsNavigationNodeDTO.Entries }
     *     
     */
    public void setEntries(CmsNavigationNodeDTO.Entries value) {
        this.entries = value;
    }

    /**
     * Gets the value of the links property.
     * 
     * @return
     *     possible object is
     *     {@link CmsNavigationNodeDTO.Links }
     *     
     */
    public CmsNavigationNodeDTO.Links getLinks() {
        return links;
    }

    /**
     * Sets the value of the links property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmsNavigationNodeDTO.Links }
     *     
     */
    public void setLinks(CmsNavigationNodeDTO.Links value) {
        this.links = value;
    }

    /**
     * Gets the value of the pages property.
     * 
     * @return
     *     possible object is
     *     {@link CmsNavigationNodeDTO.Pages }
     *     
     */
    public CmsNavigationNodeDTO.Pages getPages() {
        return pages;
    }

    /**
     * Sets the value of the pages property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmsNavigationNodeDTO.Pages }
     *     
     */
    public void setPages(CmsNavigationNodeDTO.Pages value) {
        this.pages = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link CmsNavigationNodeDTO }
     *     
     */
    public CmsNavigationNodeDTO getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmsNavigationNodeDTO }
     *     
     */
    public void setParent(CmsNavigationNodeDTO value) {
        this.parent = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the visible property.
     * 
     */
    public boolean isVisible() {
        return visible;
    }

    /**
     * Sets the value of the visible property.
     * 
     */
    public void setVisible(boolean value) {
        this.visible = value;
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
    public static class Children {

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
     *         &lt;element name="cMSNavigationEntry" type="{}cmsNavigationEntryDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "cmsNavigationEntry"
    })
    public static class Entries {

        @XmlElement(name = "cMSNavigationEntry")
        protected List<CmsNavigationEntryDTO> cmsNavigationEntry;

        /**
         * Gets the value of the cmsNavigationEntry property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cmsNavigationEntry property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCMSNavigationEntry().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CmsNavigationEntryDTO }
         * 
         * 
         */
        public List<CmsNavigationEntryDTO> getCMSNavigationEntry() {
            if (cmsNavigationEntry == null) {
                cmsNavigationEntry = new ArrayList<CmsNavigationEntryDTO>();
            }
            return this.cmsNavigationEntry;
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
    public static class Links {

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
     *         &lt;element name="contentPage" type="{}contentPageDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "contentPage"
    })
    public static class Pages {

        protected List<ContentPageDTO> contentPage;

        /**
         * Gets the value of the contentPage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contentPage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContentPage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ContentPageDTO }
         * 
         * 
         */
        public List<ContentPageDTO> getContentPage() {
            if (contentPage == null) {
                contentPage = new ArrayList<ContentPageDTO>();
            }
            return this.contentPage;
        }

    }

}
