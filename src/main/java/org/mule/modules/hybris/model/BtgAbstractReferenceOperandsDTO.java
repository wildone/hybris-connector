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
 * <p>Java class for btgAbstractReferenceOperandsDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="btgAbstractReferenceOperandsDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}abstractCollectionDTO">
 *       &lt;sequence>
 *         &lt;element ref="{}btgabstractreferenceoperand" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "btgAbstractReferenceOperandsDTO", propOrder = {
    "btgabstractreferenceoperand"
})
public class BtgAbstractReferenceOperandsDTO
    extends AbstractCollectionDTO
{

    protected List<BtgAbstractReferenceOperandDTO> btgabstractreferenceoperand;

    /**
     * Gets the value of the btgabstractreferenceoperand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the btgabstractreferenceoperand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBtgabstractreferenceoperand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BtgAbstractReferenceOperandDTO }
     * 
     * 
     */
    public List<BtgAbstractReferenceOperandDTO> getBtgabstractreferenceoperand() {
        if (btgabstractreferenceoperand == null) {
            btgabstractreferenceoperand = new ArrayList<BtgAbstractReferenceOperandDTO>();
        }
        return this.btgabstractreferenceoperand;
    }

}
