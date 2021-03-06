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
 * <p>Java class for bannerComponentDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bannerComponentDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}abstractBannerComponentDTO">
 *       &lt;sequence>
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="headline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="page" type="{}contentPageDTO" minOccurs="0"/>
 *         &lt;element name="pageLabelOrId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rotatingComponent" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="rotatingImagesComponent" type="{}rotatingImagesComponentDTO" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "bannerComponentDTO", propOrder = {
    "content",
    "headline",
    "page",
    "pageLabelOrId",
    "rotatingComponent"
})
public class BannerComponentDTO
    extends AbstractBannerComponentDTO
{

    protected String content;
    protected String headline;
    protected ContentPageDTO page;
    protected String pageLabelOrId;
    protected BannerComponentDTO.RotatingComponent rotatingComponent;

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the headline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadline() {
        return headline;
    }

    /**
     * Sets the value of the headline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadline(String value) {
        this.headline = value;
    }

    /**
     * Gets the value of the page property.
     * 
     * @return
     *     possible object is
     *     {@link ContentPageDTO }
     *     
     */
    public ContentPageDTO getPage() {
        return page;
    }

    /**
     * Sets the value of the page property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentPageDTO }
     *     
     */
    public void setPage(ContentPageDTO value) {
        this.page = value;
    }

    /**
     * Gets the value of the pageLabelOrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageLabelOrId() {
        return pageLabelOrId;
    }

    /**
     * Sets the value of the pageLabelOrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageLabelOrId(String value) {
        this.pageLabelOrId = value;
    }

    /**
     * Gets the value of the rotatingComponent property.
     * 
     * @return
     *     possible object is
     *     {@link BannerComponentDTO.RotatingComponent }
     *     
     */
    public BannerComponentDTO.RotatingComponent getRotatingComponent() {
        return rotatingComponent;
    }

    /**
     * Sets the value of the rotatingComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BannerComponentDTO.RotatingComponent }
     *     
     */
    public void setRotatingComponent(BannerComponentDTO.RotatingComponent value) {
        this.rotatingComponent = value;
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
     *         &lt;element name="rotatingImagesComponent" type="{}rotatingImagesComponentDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "rotatingImagesComponent"
    })
    public static class RotatingComponent {

        protected List<RotatingImagesComponentDTO> rotatingImagesComponent;

        /**
         * Gets the value of the rotatingImagesComponent property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rotatingImagesComponent property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRotatingImagesComponent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RotatingImagesComponentDTO }
         * 
         * 
         */
        public List<RotatingImagesComponentDTO> getRotatingImagesComponent() {
            if (rotatingImagesComponent == null) {
                rotatingImagesComponent = new ArrayList<RotatingImagesComponentDTO>();
            }
            return this.rotatingImagesComponent;
        }

    }

}
