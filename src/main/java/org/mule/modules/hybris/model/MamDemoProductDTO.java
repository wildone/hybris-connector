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
 * <p>Java class for mamDemoProductDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mamDemoProductDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}productDTO">
 *       &lt;sequence>
 *         &lt;element name="autoThumbnails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}media" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="localizedAsset" type="{}celumAssetDTO" minOccurs="0"/>
 *         &lt;element name="localizedAssetPicture" type="{}celumAssetDTO" minOccurs="0"/>
 *         &lt;element name="localizedAssetThumbnail" type="{}celumAssetDTO" minOccurs="0"/>
 *         &lt;element name="localizedMNAssets" type="{}celumAssetDTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="localizedPDFAsset" type="{}celumAssetDTO" minOccurs="0"/>
 *         &lt;element ref="{}media" minOccurs="0"/>
 *         &lt;element name="mediaContainer" type="{}mediaContainerDTO" minOccurs="0"/>
 *         &lt;element name="myThumbnail" type="{}mediaDTO" minOccurs="0"/>
 *         &lt;element name="pictureViaMedia" type="{}mediaDTO" minOccurs="0"/>
 *         &lt;element name="pictureViaMediaContainer" type="{}mediaDTO" minOccurs="0"/>
 *         &lt;element name="raw1NFromAssets" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="celumAsset" type="{}celumAssetDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="raw1NToAssets" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="celumAsset" type="{}celumAssetDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="rawAsset" type="{}celumAssetDTO" minOccurs="0"/>
 *         &lt;element name="rawMNAssets" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="celumAsset" type="{}celumAssetDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="rawMNFromAssets" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="celumAsset" type="{}celumAssetDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="simpleAsset" type="{}celumAssetDTO" minOccurs="0"/>
 *         &lt;element name="thumbnailViaMedia" type="{}mediaDTO" minOccurs="0"/>
 *         &lt;element name="thumbnailViaMediaContainer" type="{}mediaDTO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mamDemoProductDTO", propOrder = {
    "autoThumbnails",
    "localizedAsset",
    "localizedAssetPicture",
    "localizedAssetThumbnail",
    "localizedMNAssets",
    "localizedPDFAsset",
    "media",
    "mediaContainer",
    "myThumbnail",
    "pictureViaMedia",
    "pictureViaMediaContainer",
    "raw1NFromAssets",
    "raw1NToAssets",
    "rawAsset",
    "rawMNAssets",
    "rawMNFromAssets",
    "simpleAsset",
    "thumbnailViaMedia",
    "thumbnailViaMediaContainer"
})
public class MamDemoProductDTO
    extends ProductDTO
{

    protected MamDemoProductDTO.AutoThumbnails autoThumbnails;
    protected CelumAssetDTO localizedAsset;
    protected CelumAssetDTO localizedAssetPicture;
    protected CelumAssetDTO localizedAssetThumbnail;
    @XmlElement(nillable = true)
    protected List<CelumAssetDTO> localizedMNAssets;
    protected CelumAssetDTO localizedPDFAsset;
    protected MediaDTO media;
    protected MediaContainerDTO mediaContainer;
    protected MediaDTO myThumbnail;
    protected MediaDTO pictureViaMedia;
    protected MediaDTO pictureViaMediaContainer;
    protected MamDemoProductDTO.Raw1NFromAssets raw1NFromAssets;
    protected MamDemoProductDTO.Raw1NToAssets raw1NToAssets;
    protected CelumAssetDTO rawAsset;
    protected MamDemoProductDTO.RawMNAssets rawMNAssets;
    protected MamDemoProductDTO.RawMNFromAssets rawMNFromAssets;
    protected CelumAssetDTO simpleAsset;
    protected MediaDTO thumbnailViaMedia;
    protected MediaDTO thumbnailViaMediaContainer;

    /**
     * Gets the value of the autoThumbnails property.
     * 
     * @return
     *     possible object is
     *     {@link MamDemoProductDTO.AutoThumbnails }
     *     
     */
    public MamDemoProductDTO.AutoThumbnails getAutoThumbnails() {
        return autoThumbnails;
    }

    /**
     * Sets the value of the autoThumbnails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MamDemoProductDTO.AutoThumbnails }
     *     
     */
    public void setAutoThumbnails(MamDemoProductDTO.AutoThumbnails value) {
        this.autoThumbnails = value;
    }

    /**
     * Gets the value of the localizedAsset property.
     * 
     * @return
     *     possible object is
     *     {@link CelumAssetDTO }
     *     
     */
    public CelumAssetDTO getLocalizedAsset() {
        return localizedAsset;
    }

    /**
     * Sets the value of the localizedAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link CelumAssetDTO }
     *     
     */
    public void setLocalizedAsset(CelumAssetDTO value) {
        this.localizedAsset = value;
    }

    /**
     * Gets the value of the localizedAssetPicture property.
     * 
     * @return
     *     possible object is
     *     {@link CelumAssetDTO }
     *     
     */
    public CelumAssetDTO getLocalizedAssetPicture() {
        return localizedAssetPicture;
    }

    /**
     * Sets the value of the localizedAssetPicture property.
     * 
     * @param value
     *     allowed object is
     *     {@link CelumAssetDTO }
     *     
     */
    public void setLocalizedAssetPicture(CelumAssetDTO value) {
        this.localizedAssetPicture = value;
    }

    /**
     * Gets the value of the localizedAssetThumbnail property.
     * 
     * @return
     *     possible object is
     *     {@link CelumAssetDTO }
     *     
     */
    public CelumAssetDTO getLocalizedAssetThumbnail() {
        return localizedAssetThumbnail;
    }

    /**
     * Sets the value of the localizedAssetThumbnail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CelumAssetDTO }
     *     
     */
    public void setLocalizedAssetThumbnail(CelumAssetDTO value) {
        this.localizedAssetThumbnail = value;
    }

    /**
     * Gets the value of the localizedMNAssets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the localizedMNAssets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocalizedMNAssets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CelumAssetDTO }
     * 
     * 
     */
    public List<CelumAssetDTO> getLocalizedMNAssets() {
        if (localizedMNAssets == null) {
            localizedMNAssets = new ArrayList<CelumAssetDTO>();
        }
        return this.localizedMNAssets;
    }

    /**
     * Gets the value of the localizedPDFAsset property.
     * 
     * @return
     *     possible object is
     *     {@link CelumAssetDTO }
     *     
     */
    public CelumAssetDTO getLocalizedPDFAsset() {
        return localizedPDFAsset;
    }

    /**
     * Sets the value of the localizedPDFAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link CelumAssetDTO }
     *     
     */
    public void setLocalizedPDFAsset(CelumAssetDTO value) {
        this.localizedPDFAsset = value;
    }

    /**
     * Gets the value of the media property.
     * 
     * @return
     *     possible object is
     *     {@link MediaDTO }
     *     
     */
    public MediaDTO getMedia() {
        return media;
    }

    /**
     * Sets the value of the media property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaDTO }
     *     
     */
    public void setMedia(MediaDTO value) {
        this.media = value;
    }

    /**
     * Gets the value of the mediaContainer property.
     * 
     * @return
     *     possible object is
     *     {@link MediaContainerDTO }
     *     
     */
    public MediaContainerDTO getMediaContainer() {
        return mediaContainer;
    }

    /**
     * Sets the value of the mediaContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaContainerDTO }
     *     
     */
    public void setMediaContainer(MediaContainerDTO value) {
        this.mediaContainer = value;
    }

    /**
     * Gets the value of the myThumbnail property.
     * 
     * @return
     *     possible object is
     *     {@link MediaDTO }
     *     
     */
    public MediaDTO getMyThumbnail() {
        return myThumbnail;
    }

    /**
     * Sets the value of the myThumbnail property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaDTO }
     *     
     */
    public void setMyThumbnail(MediaDTO value) {
        this.myThumbnail = value;
    }

    /**
     * Gets the value of the pictureViaMedia property.
     * 
     * @return
     *     possible object is
     *     {@link MediaDTO }
     *     
     */
    public MediaDTO getPictureViaMedia() {
        return pictureViaMedia;
    }

    /**
     * Sets the value of the pictureViaMedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaDTO }
     *     
     */
    public void setPictureViaMedia(MediaDTO value) {
        this.pictureViaMedia = value;
    }

    /**
     * Gets the value of the pictureViaMediaContainer property.
     * 
     * @return
     *     possible object is
     *     {@link MediaDTO }
     *     
     */
    public MediaDTO getPictureViaMediaContainer() {
        return pictureViaMediaContainer;
    }

    /**
     * Sets the value of the pictureViaMediaContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaDTO }
     *     
     */
    public void setPictureViaMediaContainer(MediaDTO value) {
        this.pictureViaMediaContainer = value;
    }

    /**
     * Gets the value of the raw1NFromAssets property.
     * 
     * @return
     *     possible object is
     *     {@link MamDemoProductDTO.Raw1NFromAssets }
     *     
     */
    public MamDemoProductDTO.Raw1NFromAssets getRaw1NFromAssets() {
        return raw1NFromAssets;
    }

    /**
     * Sets the value of the raw1NFromAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link MamDemoProductDTO.Raw1NFromAssets }
     *     
     */
    public void setRaw1NFromAssets(MamDemoProductDTO.Raw1NFromAssets value) {
        this.raw1NFromAssets = value;
    }

    /**
     * Gets the value of the raw1NToAssets property.
     * 
     * @return
     *     possible object is
     *     {@link MamDemoProductDTO.Raw1NToAssets }
     *     
     */
    public MamDemoProductDTO.Raw1NToAssets getRaw1NToAssets() {
        return raw1NToAssets;
    }

    /**
     * Sets the value of the raw1NToAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link MamDemoProductDTO.Raw1NToAssets }
     *     
     */
    public void setRaw1NToAssets(MamDemoProductDTO.Raw1NToAssets value) {
        this.raw1NToAssets = value;
    }

    /**
     * Gets the value of the rawAsset property.
     * 
     * @return
     *     possible object is
     *     {@link CelumAssetDTO }
     *     
     */
    public CelumAssetDTO getRawAsset() {
        return rawAsset;
    }

    /**
     * Sets the value of the rawAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link CelumAssetDTO }
     *     
     */
    public void setRawAsset(CelumAssetDTO value) {
        this.rawAsset = value;
    }

    /**
     * Gets the value of the rawMNAssets property.
     * 
     * @return
     *     possible object is
     *     {@link MamDemoProductDTO.RawMNAssets }
     *     
     */
    public MamDemoProductDTO.RawMNAssets getRawMNAssets() {
        return rawMNAssets;
    }

    /**
     * Sets the value of the rawMNAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link MamDemoProductDTO.RawMNAssets }
     *     
     */
    public void setRawMNAssets(MamDemoProductDTO.RawMNAssets value) {
        this.rawMNAssets = value;
    }

    /**
     * Gets the value of the rawMNFromAssets property.
     * 
     * @return
     *     possible object is
     *     {@link MamDemoProductDTO.RawMNFromAssets }
     *     
     */
    public MamDemoProductDTO.RawMNFromAssets getRawMNFromAssets() {
        return rawMNFromAssets;
    }

    /**
     * Sets the value of the rawMNFromAssets property.
     * 
     * @param value
     *     allowed object is
     *     {@link MamDemoProductDTO.RawMNFromAssets }
     *     
     */
    public void setRawMNFromAssets(MamDemoProductDTO.RawMNFromAssets value) {
        this.rawMNFromAssets = value;
    }

    /**
     * Gets the value of the simpleAsset property.
     * 
     * @return
     *     possible object is
     *     {@link CelumAssetDTO }
     *     
     */
    public CelumAssetDTO getSimpleAsset() {
        return simpleAsset;
    }

    /**
     * Sets the value of the simpleAsset property.
     * 
     * @param value
     *     allowed object is
     *     {@link CelumAssetDTO }
     *     
     */
    public void setSimpleAsset(CelumAssetDTO value) {
        this.simpleAsset = value;
    }

    /**
     * Gets the value of the thumbnailViaMedia property.
     * 
     * @return
     *     possible object is
     *     {@link MediaDTO }
     *     
     */
    public MediaDTO getThumbnailViaMedia() {
        return thumbnailViaMedia;
    }

    /**
     * Sets the value of the thumbnailViaMedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaDTO }
     *     
     */
    public void setThumbnailViaMedia(MediaDTO value) {
        this.thumbnailViaMedia = value;
    }

    /**
     * Gets the value of the thumbnailViaMediaContainer property.
     * 
     * @return
     *     possible object is
     *     {@link MediaDTO }
     *     
     */
    public MediaDTO getThumbnailViaMediaContainer() {
        return thumbnailViaMediaContainer;
    }

    /**
     * Sets the value of the thumbnailViaMediaContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaDTO }
     *     
     */
    public void setThumbnailViaMediaContainer(MediaDTO value) {
        this.thumbnailViaMediaContainer = value;
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
     *         &lt;element ref="{}media" maxOccurs="unbounded" minOccurs="0"/>
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
        "media"
    })
    public static class AutoThumbnails {

        protected List<MediaDTO> media;

        /**
         * Gets the value of the media property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the media property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMedia().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MediaDTO }
         * 
         * 
         */
        public List<MediaDTO> getMedia() {
            if (media == null) {
                media = new ArrayList<MediaDTO>();
            }
            return this.media;
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
     *         &lt;element name="celumAsset" type="{}celumAssetDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "celumAsset"
    })
    public static class Raw1NFromAssets {

        protected List<CelumAssetDTO> celumAsset;

        /**
         * Gets the value of the celumAsset property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the celumAsset property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCelumAsset().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CelumAssetDTO }
         * 
         * 
         */
        public List<CelumAssetDTO> getCelumAsset() {
            if (celumAsset == null) {
                celumAsset = new ArrayList<CelumAssetDTO>();
            }
            return this.celumAsset;
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
     *         &lt;element name="celumAsset" type="{}celumAssetDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "celumAsset"
    })
    public static class Raw1NToAssets {

        protected List<CelumAssetDTO> celumAsset;

        /**
         * Gets the value of the celumAsset property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the celumAsset property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCelumAsset().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CelumAssetDTO }
         * 
         * 
         */
        public List<CelumAssetDTO> getCelumAsset() {
            if (celumAsset == null) {
                celumAsset = new ArrayList<CelumAssetDTO>();
            }
            return this.celumAsset;
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
     *         &lt;element name="celumAsset" type="{}celumAssetDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "celumAsset"
    })
    public static class RawMNAssets {

        protected List<CelumAssetDTO> celumAsset;

        /**
         * Gets the value of the celumAsset property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the celumAsset property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCelumAsset().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CelumAssetDTO }
         * 
         * 
         */
        public List<CelumAssetDTO> getCelumAsset() {
            if (celumAsset == null) {
                celumAsset = new ArrayList<CelumAssetDTO>();
            }
            return this.celumAsset;
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
     *         &lt;element name="celumAsset" type="{}celumAssetDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "celumAsset"
    })
    public static class RawMNFromAssets {

        protected List<CelumAssetDTO> celumAsset;

        /**
         * Gets the value of the celumAsset property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the celumAsset property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCelumAsset().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CelumAssetDTO }
         * 
         * 
         */
        public List<CelumAssetDTO> getCelumAsset() {
            if (celumAsset == null) {
                celumAsset = new ArrayList<CelumAssetDTO>();
            }
            return this.celumAsset;
        }

    }

}
