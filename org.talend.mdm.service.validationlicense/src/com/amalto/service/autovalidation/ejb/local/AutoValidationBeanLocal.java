/*
 * Generated by XDoclet - Do not edit!
 */
package com.amalto.service.autovalidation.ejb.local;

/**
 * Local interface for AutoValidationBean.
 * @xdoclet-generated at 29-04-10
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version ${version}
 */
public interface AutoValidationBeanLocal
   extends javax.ejb.EJBLocalObject
{

   public java.lang.String getJNDIName(  ) throws com.amalto.core.util.XtentisException;

   public java.lang.String getConfiguration( java.lang.String optionalParameters ) throws com.amalto.core.util.XtentisException;

   public java.lang.String getDescription( java.lang.String twoLetterLanguageCode ) throws com.amalto.core.util.XtentisException;

   public java.lang.String getDocumentation( java.lang.String twoLettersLanguageCode ) throws com.amalto.core.util.XtentisException;

   public java.lang.String getStatus(  ) throws com.amalto.core.util.XtentisException;

   public void start(  ) throws com.amalto.core.util.XtentisException;

   public void stop(  ) throws com.amalto.core.util.XtentisException;

   public java.io.Serializable receiveFromOutbound( java.util.HashMap map ) throws com.amalto.core.util.XtentisException;

   public java.lang.String receiveFromInbound( com.amalto.core.ejb.ItemPOJOPK itemPK,java.lang.String routingOrderID,java.lang.String parameters ) throws com.amalto.core.util.XtentisException;

   public java.io.Serializable fetchFromOutbound( java.lang.String command,java.lang.String parameters,java.lang.String schedulePlanID ) throws com.amalto.core.util.XtentisException;

}