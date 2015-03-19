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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for attributeDescriptorDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="attributeDescriptorDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}descriptorDTO">
 *       &lt;sequence>
 *         &lt;element name="attributeHandler" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="constraints" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="attributeConstraint" type="{}attributeConstraintDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="databaseColumn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="declaringEnclosingType" type="{}composedTypeDTO" minOccurs="0"/>
 *         &lt;element name="defaultValue" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dontCopy" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enclosingType" type="{}composedTypeDTO" minOccurs="0"/>
 *         &lt;element name="encrypted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="forceLuceneIndexable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="hmcIndexField" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="initial" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="localized" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="modifiers" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="optional" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="partOf" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="persistenceClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primitive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="private" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="property" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="proposedDatabaseColumn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="readable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="removable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="search" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="selectionOf" type="{}attributeDescriptorDTO" minOccurs="0"/>
 *         &lt;element name="unique" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="writable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "attributeDescriptorDTO", propOrder = {
    "attributeHandler",
    "constraints",
    "databaseColumn",
    "declaringEnclosingType",
    "defaultValue",
    "description",
    "dontCopy",
    "enclosingType",
    "encrypted",
    "forceLuceneIndexable",
    "hmcIndexField",
    "initial",
    "localized",
    "modifiers",
    "optional",
    "partOf",
    "persistenceClass",
    "primitive",
    "_private",
    "property",
    "proposedDatabaseColumn",
    "readable",
    "removable",
    "search",
    "selectionOf",
    "unique",
    "writable"
})
@XmlSeeAlso({
    ExpressionAttributeDescriptorDTO.class,
    ConfigAttributeDescriptorDTO.class,
    VariantAttributeDescriptorDTO.class,
    RelationDescriptorDTO.class,
    ViewAttributeDescriptorDTO.class
})
public class AttributeDescriptorDTO
    extends DescriptorDTO
{

    protected String attributeHandler;
    protected AttributeDescriptorDTO.Constraints constraints;
    protected String databaseColumn;
    protected ComposedTypeDTO declaringEnclosingType;
    protected Object defaultValue;
    protected String description;
    protected Boolean dontCopy;
    protected ComposedTypeDTO enclosingType;
    protected Boolean encrypted;
    protected Boolean forceLuceneIndexable;
    protected String hmcIndexField;
    protected Boolean initial;
    protected Boolean localized;
    protected Integer modifiers;
    protected Boolean optional;
    protected Boolean partOf;
    protected String persistenceClass;
    protected Boolean primitive;
    @XmlElement(name = "private")
    protected Boolean _private;
    protected Boolean property;
    protected String proposedDatabaseColumn;
    protected Boolean readable;
    protected Boolean removable;
    protected Boolean search;
    protected AttributeDescriptorDTO selectionOf;
    protected Boolean unique;
    protected Boolean writable;

    /**
     * Gets the value of the attributeHandler property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeHandler() {
        return attributeHandler;
    }

    /**
     * Sets the value of the attributeHandler property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeHandler(String value) {
        this.attributeHandler = value;
    }

    /**
     * Gets the value of the constraints property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeDescriptorDTO.Constraints }
     *     
     */
    public AttributeDescriptorDTO.Constraints getConstraints() {
        return constraints;
    }

    /**
     * Sets the value of the constraints property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeDescriptorDTO.Constraints }
     *     
     */
    public void setConstraints(AttributeDescriptorDTO.Constraints value) {
        this.constraints = value;
    }

    /**
     * Gets the value of the databaseColumn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatabaseColumn() {
        return databaseColumn;
    }

    /**
     * Sets the value of the databaseColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatabaseColumn(String value) {
        this.databaseColumn = value;
    }

    /**
     * Gets the value of the declaringEnclosingType property.
     * 
     * @return
     *     possible object is
     *     {@link ComposedTypeDTO }
     *     
     */
    public ComposedTypeDTO getDeclaringEnclosingType() {
        return declaringEnclosingType;
    }

    /**
     * Sets the value of the declaringEnclosingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComposedTypeDTO }
     *     
     */
    public void setDeclaringEnclosingType(ComposedTypeDTO value) {
        this.declaringEnclosingType = value;
    }

    /**
     * Gets the value of the defaultValue property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDefaultValue() {
        return defaultValue;
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDefaultValue(Object value) {
        this.defaultValue = value;
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
     * Gets the value of the dontCopy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDontCopy() {
        return dontCopy;
    }

    /**
     * Sets the value of the dontCopy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDontCopy(Boolean value) {
        this.dontCopy = value;
    }

    /**
     * Gets the value of the enclosingType property.
     * 
     * @return
     *     possible object is
     *     {@link ComposedTypeDTO }
     *     
     */
    public ComposedTypeDTO getEnclosingType() {
        return enclosingType;
    }

    /**
     * Sets the value of the enclosingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComposedTypeDTO }
     *     
     */
    public void setEnclosingType(ComposedTypeDTO value) {
        this.enclosingType = value;
    }

    /**
     * Gets the value of the encrypted property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEncrypted() {
        return encrypted;
    }

    /**
     * Sets the value of the encrypted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEncrypted(Boolean value) {
        this.encrypted = value;
    }

    /**
     * Gets the value of the forceLuceneIndexable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForceLuceneIndexable() {
        return forceLuceneIndexable;
    }

    /**
     * Sets the value of the forceLuceneIndexable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForceLuceneIndexable(Boolean value) {
        this.forceLuceneIndexable = value;
    }

    /**
     * Gets the value of the hmcIndexField property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHmcIndexField() {
        return hmcIndexField;
    }

    /**
     * Sets the value of the hmcIndexField property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHmcIndexField(String value) {
        this.hmcIndexField = value;
    }

    /**
     * Gets the value of the initial property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInitial() {
        return initial;
    }

    /**
     * Sets the value of the initial property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInitial(Boolean value) {
        this.initial = value;
    }

    /**
     * Gets the value of the localized property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalized() {
        return localized;
    }

    /**
     * Sets the value of the localized property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalized(Boolean value) {
        this.localized = value;
    }

    /**
     * Gets the value of the modifiers property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getModifiers() {
        return modifiers;
    }

    /**
     * Sets the value of the modifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setModifiers(Integer value) {
        this.modifiers = value;
    }

    /**
     * Gets the value of the optional property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptional() {
        return optional;
    }

    /**
     * Sets the value of the optional property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptional(Boolean value) {
        this.optional = value;
    }

    /**
     * Gets the value of the partOf property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartOf() {
        return partOf;
    }

    /**
     * Sets the value of the partOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartOf(Boolean value) {
        this.partOf = value;
    }

    /**
     * Gets the value of the persistenceClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersistenceClass() {
        return persistenceClass;
    }

    /**
     * Sets the value of the persistenceClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersistenceClass(String value) {
        this.persistenceClass = value;
    }

    /**
     * Gets the value of the primitive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimitive() {
        return primitive;
    }

    /**
     * Sets the value of the primitive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimitive(Boolean value) {
        this.primitive = value;
    }

    /**
     * Gets the value of the private property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrivate() {
        return _private;
    }

    /**
     * Sets the value of the private property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrivate(Boolean value) {
        this._private = value;
    }

    /**
     * Gets the value of the property property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProperty() {
        return property;
    }

    /**
     * Sets the value of the property property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProperty(Boolean value) {
        this.property = value;
    }

    /**
     * Gets the value of the proposedDatabaseColumn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProposedDatabaseColumn() {
        return proposedDatabaseColumn;
    }

    /**
     * Sets the value of the proposedDatabaseColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProposedDatabaseColumn(String value) {
        this.proposedDatabaseColumn = value;
    }

    /**
     * Gets the value of the readable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReadable() {
        return readable;
    }

    /**
     * Sets the value of the readable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReadable(Boolean value) {
        this.readable = value;
    }

    /**
     * Gets the value of the removable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemovable() {
        return removable;
    }

    /**
     * Sets the value of the removable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemovable(Boolean value) {
        this.removable = value;
    }

    /**
     * Gets the value of the search property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSearch() {
        return search;
    }

    /**
     * Sets the value of the search property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSearch(Boolean value) {
        this.search = value;
    }

    /**
     * Gets the value of the selectionOf property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeDescriptorDTO }
     *     
     */
    public AttributeDescriptorDTO getSelectionOf() {
        return selectionOf;
    }

    /**
     * Sets the value of the selectionOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeDescriptorDTO }
     *     
     */
    public void setSelectionOf(AttributeDescriptorDTO value) {
        this.selectionOf = value;
    }

    /**
     * Gets the value of the unique property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnique() {
        return unique;
    }

    /**
     * Sets the value of the unique property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnique(Boolean value) {
        this.unique = value;
    }

    /**
     * Gets the value of the writable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWritable() {
        return writable;
    }

    /**
     * Sets the value of the writable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWritable(Boolean value) {
        this.writable = value;
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
     *         &lt;element name="attributeConstraint" type="{}attributeConstraintDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "attributeConstraint"
    })
    public static class Constraints {

        protected List<AttributeConstraintDTO> attributeConstraint;

        /**
         * Gets the value of the attributeConstraint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attributeConstraint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttributeConstraint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AttributeConstraintDTO }
         * 
         * 
         */
        public List<AttributeConstraintDTO> getAttributeConstraint() {
            if (attributeConstraint == null) {
                attributeConstraint = new ArrayList<AttributeConstraintDTO>();
            }
            return this.attributeConstraint;
        }

    }

}