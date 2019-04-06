//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.15 at 09:03:12 PM EEST 
//


package org.opencover;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="numSequencePoints" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="visitedSequencePoints" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="numBranchPoints" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="visitedBranchPoints" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="sequenceCoverage" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="branchCoverage" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="maxCyclomaticComplexity" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="minCyclomaticComplexity" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "value"
})
@XmlRootElement(name = "Summary")
public class Summary {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "numSequencePoints")
    protected Integer numSequencePoints;
    @XmlAttribute(name = "visitedSequencePoints")
    protected Integer visitedSequencePoints;
    @XmlAttribute(name = "numBranchPoints")
    protected Integer numBranchPoints;
    @XmlAttribute(name = "visitedBranchPoints")
    protected Integer visitedBranchPoints;
    @XmlAttribute(name = "sequenceCoverage")
    protected Float sequenceCoverage;
    @XmlAttribute(name = "branchCoverage")
    protected Float branchCoverage;
    @XmlAttribute(name = "maxCyclomaticComplexity")
    protected Integer maxCyclomaticComplexity;
    @XmlAttribute(name = "minCyclomaticComplexity")
    protected Integer minCyclomaticComplexity;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the numSequencePoints property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumSequencePoints() {
        return numSequencePoints;
    }

    /**
     * Sets the value of the numSequencePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumSequencePoints(Integer value) {
        this.numSequencePoints = value;
    }

    /**
     * Gets the value of the visitedSequencePoints property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVisitedSequencePoints() {
        return visitedSequencePoints;
    }

    /**
     * Sets the value of the visitedSequencePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVisitedSequencePoints(Integer value) {
        this.visitedSequencePoints = value;
    }

    /**
     * Gets the value of the numBranchPoints property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumBranchPoints() {
        return numBranchPoints;
    }

    /**
     * Sets the value of the numBranchPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumBranchPoints(Integer value) {
        this.numBranchPoints = value;
    }

    /**
     * Gets the value of the visitedBranchPoints property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVisitedBranchPoints() {
        return visitedBranchPoints;
    }

    /**
     * Sets the value of the visitedBranchPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVisitedBranchPoints(Integer value) {
        this.visitedBranchPoints = value;
    }

    /**
     * Gets the value of the sequenceCoverage property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSequenceCoverage() {
        return sequenceCoverage;
    }

    /**
     * Sets the value of the sequenceCoverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSequenceCoverage(Float value) {
        this.sequenceCoverage = value;
    }

    /**
     * Gets the value of the branchCoverage property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBranchCoverage() {
        return branchCoverage;
    }

    /**
     * Sets the value of the branchCoverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBranchCoverage(Float value) {
        this.branchCoverage = value;
    }

    /**
     * Gets the value of the maxCyclomaticComplexity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxCyclomaticComplexity() {
        return maxCyclomaticComplexity;
    }

    /**
     * Sets the value of the maxCyclomaticComplexity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxCyclomaticComplexity(Integer value) {
        this.maxCyclomaticComplexity = value;
    }

    /**
     * Gets the value of the minCyclomaticComplexity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinCyclomaticComplexity() {
        return minCyclomaticComplexity;
    }

    /**
     * Sets the value of the minCyclomaticComplexity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinCyclomaticComplexity(Integer value) {
        this.minCyclomaticComplexity = value;
    }

}