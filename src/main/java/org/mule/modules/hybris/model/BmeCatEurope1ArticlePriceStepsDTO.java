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
 * <p>Java class for bmeCatEurope1ArticlePriceStepsDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bmeCatEurope1ArticlePriceStepsDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{}abstractCollectionDTO">
 *       &lt;sequence>
 *         &lt;element ref="{}bmecateurope1articlepricestep" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bmeCatEurope1ArticlePriceStepsDTO", propOrder = {
    "bmecateurope1Articlepricestep"
})
public class BmeCatEurope1ArticlePriceStepsDTO
    extends AbstractCollectionDTO
{

    @XmlElement(name = "bmecateurope1articlepricestep")
    protected List<BmeCatEurope1ArticlePriceStepDTO> bmecateurope1Articlepricestep;

    /**
     * Gets the value of the bmecateurope1Articlepricestep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bmecateurope1Articlepricestep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBmecateurope1Articlepricestep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BmeCatEurope1ArticlePriceStepDTO }
     * 
     * 
     */
    public List<BmeCatEurope1ArticlePriceStepDTO> getBmecateurope1Articlepricestep() {
        if (bmecateurope1Articlepricestep == null) {
            bmecateurope1Articlepricestep = new ArrayList<BmeCatEurope1ArticlePriceStepDTO>();
        }
        return this.bmecateurope1Articlepricestep;
    }

}