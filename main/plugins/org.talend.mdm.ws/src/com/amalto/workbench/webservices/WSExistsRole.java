
package com.amalto.workbench.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSExistsRole complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSExistsRole">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wsRolePK" type="{http://www.talend.com/mdm}WSRolePK" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSExistsRole", propOrder = {
    "wsRolePK"
})
public class WSExistsRole {

    protected WSRolePK wsRolePK;

    /**
     * Default no-arg constructor
     * 
     */
    public WSExistsRole() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public WSExistsRole(final WSRolePK wsRolePK) {
        this.wsRolePK = wsRolePK;
    }

    /**
     * Gets the value of the wsRolePK property.
     * 
     * @return
     *     possible object is
     *     {@link WSRolePK }
     *     
     */
    public WSRolePK getWsRolePK() {
        return wsRolePK;
    }

    /**
     * Sets the value of the wsRolePK property.
     * 
     * @param value
     *     allowed object is
     *     {@link WSRolePK }
     *     
     */
    public void setWsRolePK(WSRolePK value) {
        this.wsRolePK = value;
    }

}
