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
 * <p>Java class for phoneNumberListDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="phoneNumberListDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}itemDTO">
 *       &lt;sequence>
 *         &lt;element name="blockedAssignments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mobileActionAssignment" type="{}mobileActionAssignmentDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="blockedShortcodes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mobileShortcode" type="{}mobileShortcodeDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="memberSize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numbers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="phoneNumber" type="{}phoneNumberDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="sendingActions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="abstractMobileSendAction" type="{}abstractMobileSendActionDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="testingAssignments" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mobileActionAssignment" type="{}mobileActionAssignmentDTO" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="testingShortcodes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mobileShortcode" type="{}mobileShortcodeDTO" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "phoneNumberListDTO", propOrder = {
    "blockedAssignments",
    "blockedShortcodes",
    "code",
    "memberSize",
    "name",
    "numbers",
    "sendingActions",
    "testingAssignments",
    "testingShortcodes"
})
public class PhoneNumberListDTO
    extends ItemDTO
{

    protected PhoneNumberListDTO.BlockedAssignments blockedAssignments;
    protected PhoneNumberListDTO.BlockedShortcodes blockedShortcodes;
    protected String code;
    protected Integer memberSize;
    protected String name;
    protected PhoneNumberListDTO.Numbers numbers;
    protected PhoneNumberListDTO.SendingActions sendingActions;
    protected PhoneNumberListDTO.TestingAssignments testingAssignments;
    protected PhoneNumberListDTO.TestingShortcodes testingShortcodes;

    /**
     * Gets the value of the blockedAssignments property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneNumberListDTO.BlockedAssignments }
     *     
     */
    public PhoneNumberListDTO.BlockedAssignments getBlockedAssignments() {
        return blockedAssignments;
    }

    /**
     * Sets the value of the blockedAssignments property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneNumberListDTO.BlockedAssignments }
     *     
     */
    public void setBlockedAssignments(PhoneNumberListDTO.BlockedAssignments value) {
        this.blockedAssignments = value;
    }

    /**
     * Gets the value of the blockedShortcodes property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneNumberListDTO.BlockedShortcodes }
     *     
     */
    public PhoneNumberListDTO.BlockedShortcodes getBlockedShortcodes() {
        return blockedShortcodes;
    }

    /**
     * Sets the value of the blockedShortcodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneNumberListDTO.BlockedShortcodes }
     *     
     */
    public void setBlockedShortcodes(PhoneNumberListDTO.BlockedShortcodes value) {
        this.blockedShortcodes = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the memberSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMemberSize() {
        return memberSize;
    }

    /**
     * Sets the value of the memberSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMemberSize(Integer value) {
        this.memberSize = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the numbers property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneNumberListDTO.Numbers }
     *     
     */
    public PhoneNumberListDTO.Numbers getNumbers() {
        return numbers;
    }

    /**
     * Sets the value of the numbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneNumberListDTO.Numbers }
     *     
     */
    public void setNumbers(PhoneNumberListDTO.Numbers value) {
        this.numbers = value;
    }

    /**
     * Gets the value of the sendingActions property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneNumberListDTO.SendingActions }
     *     
     */
    public PhoneNumberListDTO.SendingActions getSendingActions() {
        return sendingActions;
    }

    /**
     * Sets the value of the sendingActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneNumberListDTO.SendingActions }
     *     
     */
    public void setSendingActions(PhoneNumberListDTO.SendingActions value) {
        this.sendingActions = value;
    }

    /**
     * Gets the value of the testingAssignments property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneNumberListDTO.TestingAssignments }
     *     
     */
    public PhoneNumberListDTO.TestingAssignments getTestingAssignments() {
        return testingAssignments;
    }

    /**
     * Sets the value of the testingAssignments property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneNumberListDTO.TestingAssignments }
     *     
     */
    public void setTestingAssignments(PhoneNumberListDTO.TestingAssignments value) {
        this.testingAssignments = value;
    }

    /**
     * Gets the value of the testingShortcodes property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneNumberListDTO.TestingShortcodes }
     *     
     */
    public PhoneNumberListDTO.TestingShortcodes getTestingShortcodes() {
        return testingShortcodes;
    }

    /**
     * Sets the value of the testingShortcodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneNumberListDTO.TestingShortcodes }
     *     
     */
    public void setTestingShortcodes(PhoneNumberListDTO.TestingShortcodes value) {
        this.testingShortcodes = value;
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
     *         &lt;element name="mobileActionAssignment" type="{}mobileActionAssignmentDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "mobileActionAssignment"
    })
    public static class BlockedAssignments {

        protected List<MobileActionAssignmentDTO> mobileActionAssignment;

        /**
         * Gets the value of the mobileActionAssignment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mobileActionAssignment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMobileActionAssignment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MobileActionAssignmentDTO }
         * 
         * 
         */
        public List<MobileActionAssignmentDTO> getMobileActionAssignment() {
            if (mobileActionAssignment == null) {
                mobileActionAssignment = new ArrayList<MobileActionAssignmentDTO>();
            }
            return this.mobileActionAssignment;
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
     *         &lt;element name="mobileShortcode" type="{}mobileShortcodeDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "mobileShortcode"
    })
    public static class BlockedShortcodes {

        protected List<MobileShortcodeDTO> mobileShortcode;

        /**
         * Gets the value of the mobileShortcode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mobileShortcode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMobileShortcode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MobileShortcodeDTO }
         * 
         * 
         */
        public List<MobileShortcodeDTO> getMobileShortcode() {
            if (mobileShortcode == null) {
                mobileShortcode = new ArrayList<MobileShortcodeDTO>();
            }
            return this.mobileShortcode;
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
     *         &lt;element name="phoneNumber" type="{}phoneNumberDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "phoneNumber"
    })
    public static class Numbers {

        protected List<PhoneNumberDTO> phoneNumber;

        /**
         * Gets the value of the phoneNumber property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the phoneNumber property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPhoneNumber().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PhoneNumberDTO }
         * 
         * 
         */
        public List<PhoneNumberDTO> getPhoneNumber() {
            if (phoneNumber == null) {
                phoneNumber = new ArrayList<PhoneNumberDTO>();
            }
            return this.phoneNumber;
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
     *         &lt;element name="abstractMobileSendAction" type="{}abstractMobileSendActionDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "abstractMobileSendAction"
    })
    public static class SendingActions {

        protected List<AbstractMobileSendActionDTO> abstractMobileSendAction;

        /**
         * Gets the value of the abstractMobileSendAction property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the abstractMobileSendAction property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAbstractMobileSendAction().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AbstractMobileSendActionDTO }
         * 
         * 
         */
        public List<AbstractMobileSendActionDTO> getAbstractMobileSendAction() {
            if (abstractMobileSendAction == null) {
                abstractMobileSendAction = new ArrayList<AbstractMobileSendActionDTO>();
            }
            return this.abstractMobileSendAction;
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
     *         &lt;element name="mobileActionAssignment" type="{}mobileActionAssignmentDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "mobileActionAssignment"
    })
    public static class TestingAssignments {

        protected List<MobileActionAssignmentDTO> mobileActionAssignment;

        /**
         * Gets the value of the mobileActionAssignment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mobileActionAssignment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMobileActionAssignment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MobileActionAssignmentDTO }
         * 
         * 
         */
        public List<MobileActionAssignmentDTO> getMobileActionAssignment() {
            if (mobileActionAssignment == null) {
                mobileActionAssignment = new ArrayList<MobileActionAssignmentDTO>();
            }
            return this.mobileActionAssignment;
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
     *         &lt;element name="mobileShortcode" type="{}mobileShortcodeDTO" maxOccurs="unbounded" minOccurs="0"/>
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
        "mobileShortcode"
    })
    public static class TestingShortcodes {

        protected List<MobileShortcodeDTO> mobileShortcode;

        /**
         * Gets the value of the mobileShortcode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mobileShortcode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMobileShortcode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MobileShortcodeDTO }
         * 
         * 
         */
        public List<MobileShortcodeDTO> getMobileShortcode() {
            if (mobileShortcode == null) {
                mobileShortcode = new ArrayList<MobileShortcodeDTO>();
            }
            return this.mobileShortcode;
        }

    }

}
