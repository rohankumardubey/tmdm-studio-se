
package com.amalto.workbench.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wsAutoIncrement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wsAutoIncrement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="autoincrement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsAutoIncrement", propOrder = {
    "autoincrement"
})
public class WsAutoIncrement {

    protected String autoincrement;

    /**
     * Default no-arg constructor
     * 
     */
    public WsAutoIncrement() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WsAutoIncrement(final String autoincrement) {
        this.autoincrement = autoincrement;
    }

    /**
     * Gets the value of the autoincrement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoincrement() {
        return autoincrement;
    }

    /**
     * Sets the value of the autoincrement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoincrement(String value) {
        this.autoincrement = value;
    }

}