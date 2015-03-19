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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for workflowActionDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workflowActionDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}abstractWorkflowActionDTO">
 *       &lt;sequence>
 *         &lt;element name="activated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="attachmentItems" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}item" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="attachments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="workflowItemAttachment" type="{}workflowItemAttachmentDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="decisions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="workflowDecision" type="{}workflowDecisionDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="firstActivated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="incomingDecisions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="workflowDecision" type="{}workflowDecisionDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="incomingLinks" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}link" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="incomingLinksStr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="selectedDecision" type="{}workflowDecisionDTO" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="template" type="{}workflowActionTemplateDTO" minOccurs="0"/>
 *         &lt;element ref="{}workflow" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workflowActionDTO", propOrder = {
    "activated",
    "attachmentItems",
    "attachments",
    "comment",
    "decisions",
    "firstActivated",
    "incomingDecisions",
    "incomingLinks",
    "incomingLinksStr",
    "selectedDecision",
    "status",
    "template",
    "workflow"
})
public class WorkflowActionDTO
    extends AbstractWorkflowActionDTO
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar activated;
    protected WorkflowActionDTO.AttachmentItems attachmentItems;
    protected WorkflowActionDTO.Attachments attachments;
    protected String comment;
    protected WorkflowActionDTO.Decisions decisions;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar firstActivated;
    protected WorkflowActionDTO.IncomingDecisions incomingDecisions;
    protected WorkflowActionDTO.IncomingLinks incomingLinks;
    protected String incomingLinksStr;
    protected WorkflowDecisionDTO selectedDecision;
    protected String status;
    protected WorkflowActionTemplateDTO template;
    protected WorkflowDTO workflow;

    /**
     * Gets the value of the activated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivated() {
        return activated;
    }

    /**
     * Sets the value of the activated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivated(XMLGregorianCalendar value) {
        this.activated = value;
    }

    /**
     * Gets the value of the attachmentItems property.
     * 
     * @return
     *     possible object is
     *     {@link WorkflowActionDTO.AttachmentItems }
     *     
     */
    public WorkflowActionDTO.AttachmentItems getAttachmentItems() {
        return attachmentItems;
    }

    /**
     * Sets the value of the attachmentItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowActionDTO.AttachmentItems }
     *     
     */
    public void setAttachmentItems(WorkflowActionDTO.AttachmentItems value) {
        this.attachmentItems = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link WorkflowActionDTO.Attachments }
     *     
     */
    public WorkflowActionDTO.Attachments getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowActionDTO.Attachments }
     *     
     */
    public void setAttachments(WorkflowActionDTO.Attachments value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the decisions property.
     * 
     * @return
     *     possible object is
     *     {@link WorkflowActionDTO.Decisions }
     *     
     */
    public WorkflowActionDTO.Decisions getDecisions() {
        return decisions;
    }

    /**
     * Sets the value of the decisions property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowActionDTO.Decisions }
     *     
     */
    public void setDecisions(WorkflowActionDTO.Decisions value) {
        this.decisions = value;
    }

    /**
     * Gets the value of the firstActivated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstActivated() {
        return firstActivated;
    }

    /**
     * Sets the value of the firstActivated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstActivated(XMLGregorianCalendar value) {
        this.firstActivated = value;
    }

    /**
     * Gets the value of the incomingDecisions property.
     * 
     * @return
     *     possible object is
     *     {@link WorkflowActionDTO.IncomingDecisions }
     *     
     */
    public WorkflowActionDTO.IncomingDecisions getIncomingDecisions() {
        return incomingDecisions;
    }

    /**
     * Sets the value of the incomingDecisions property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowActionDTO.IncomingDecisions }
     *     
     */
    public void setIncomingDecisions(WorkflowActionDTO.IncomingDecisions value) {
        this.incomingDecisions = value;
    }

    /**
     * Gets the value of the incomingLinks property.
     * 
     * @return
     *     possible object is
     *     {@link WorkflowActionDTO.IncomingLinks }
     *     
     */
    public WorkflowActionDTO.IncomingLinks getIncomingLinks() {
        return incomingLinks;
    }

    /**
     * Sets the value of the incomingLinks property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowActionDTO.IncomingLinks }
     *     
     */
    public void setIncomingLinks(WorkflowActionDTO.IncomingLinks value) {
        this.incomingLinks = value;
    }

    /**
     * Gets the value of the incomingLinksStr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomingLinksStr() {
        return incomingLinksStr;
    }

    /**
     * Sets the value of the incomingLinksStr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomingLinksStr(String value) {
        this.incomingLinksStr = value;
    }

    /**
     * Gets the value of the selectedDecision property.
     * 
     * @return
     *     possible object is
     *     {@link WorkflowDecisionDTO }
     *     
     */
    public WorkflowDecisionDTO getSelectedDecision() {
        return selectedDecision;
    }

    /**
     * Sets the value of the selectedDecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowDecisionDTO }
     *     
     */
    public void setSelectedDecision(WorkflowDecisionDTO value) {
        this.selectedDecision = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the template property.
     * 
     * @return
     *     possible object is
     *     {@link WorkflowActionTemplateDTO }
     *     
     */
    public WorkflowActionTemplateDTO getTemplate() {
        return template;
    }

    /**
     * Sets the value of the template property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowActionTemplateDTO }
     *     
     */
    public void setTemplate(WorkflowActionTemplateDTO value) {
        this.template = value;
    }

    /**
     * Gets the value of the workflow property.
     * 
     * @return
     *     possible object is
     *     {@link WorkflowDTO }
     *     
     */
    public WorkflowDTO getWorkflow() {
        return workflow;
    }

    /**
     * Sets the value of the workflow property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkflowDTO }
     *     
     */
    public void setWorkflow(WorkflowDTO value) {
        this.workflow = value;
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
     *         &lt;element ref="{}item" maxOccurs="unbounded" minOccurs="0"/>
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
        "item"
    })
    public static class AttachmentItems {

        protected List<ItemDTO> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ItemDTO }
         * 
         * 
         */
        public List<ItemDTO> getItem() {
            if (item == null) {
                item = new ArrayList<ItemDTO>();
            }
            return this.item;
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
     *         &lt;element name="workflowItemAttachment" type="{}workflowItemAttachmentDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "workflowItemAttachment"
    })
    public static class Attachments {

        protected List<WorkflowItemAttachmentDTO> workflowItemAttachment;

        /**
         * Gets the value of the workflowItemAttachment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the workflowItemAttachment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWorkflowItemAttachment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link WorkflowItemAttachmentDTO }
         * 
         * 
         */
        public List<WorkflowItemAttachmentDTO> getWorkflowItemAttachment() {
            if (workflowItemAttachment == null) {
                workflowItemAttachment = new ArrayList<WorkflowItemAttachmentDTO>();
            }
            return this.workflowItemAttachment;
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
     *         &lt;element name="workflowDecision" type="{}workflowDecisionDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "workflowDecision"
    })
    public static class Decisions {

        protected List<WorkflowDecisionDTO> workflowDecision;

        /**
         * Gets the value of the workflowDecision property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the workflowDecision property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWorkflowDecision().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link WorkflowDecisionDTO }
         * 
         * 
         */
        public List<WorkflowDecisionDTO> getWorkflowDecision() {
            if (workflowDecision == null) {
                workflowDecision = new ArrayList<WorkflowDecisionDTO>();
            }
            return this.workflowDecision;
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
     *         &lt;element name="workflowDecision" type="{}workflowDecisionDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "workflowDecision"
    })
    public static class IncomingDecisions {

        protected List<WorkflowDecisionDTO> workflowDecision;

        /**
         * Gets the value of the workflowDecision property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the workflowDecision property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWorkflowDecision().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link WorkflowDecisionDTO }
         * 
         * 
         */
        public List<WorkflowDecisionDTO> getWorkflowDecision() {
            if (workflowDecision == null) {
                workflowDecision = new ArrayList<WorkflowDecisionDTO>();
            }
            return this.workflowDecision;
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
     *         &lt;element ref="{}link" maxOccurs="unbounded" minOccurs="0"/>
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
        "link"
    })
    public static class IncomingLinks {

        protected List<LinkDTO> link;

        /**
         * Gets the value of the link property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the link property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLink().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LinkDTO }
         * 
         * 
         */
        public List<LinkDTO> getLink() {
            if (link == null) {
                link = new ArrayList<LinkDTO>();
            }
            return this.link;
        }

    }

}