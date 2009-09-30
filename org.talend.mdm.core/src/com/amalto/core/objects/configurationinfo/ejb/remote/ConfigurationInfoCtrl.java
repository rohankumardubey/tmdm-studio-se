/*
 * Generated by XDoclet - Do not edit!
 */
package com.amalto.core.objects.configurationinfo.ejb.remote;

/**
 * Remote interface for ConfigurationInfoCtrl.
 * @xdoclet-generated at 30-09-09
 * @copyright The XDoclet Team
 * @author XDoclet
 * @version ${version}
 */
public interface ConfigurationInfoCtrl
   extends javax.ejb.EJBObject
{
   /**
    * Creates or updates a configurationinfo
    * @throws XtentisException
    */
   public com.amalto.core.objects.configurationinfo.ejb.ConfigurationInfoPOJOPK putConfigurationInfo( com.amalto.core.objects.configurationinfo.ejb.ConfigurationInfoPOJO configurationInfo )
      throws com.amalto.core.util.XtentisException, java.rmi.RemoteException;

   /**
    * Get configurationinfo
    * @throws XtentisException
    */
   public com.amalto.core.objects.configurationinfo.ejb.ConfigurationInfoPOJO getConfigurationInfo( com.amalto.core.objects.configurationinfo.ejb.ConfigurationInfoPOJOPK pk )
      throws com.amalto.core.util.XtentisException, java.rmi.RemoteException;

   /**
    * Get a ConfigurationInfo - no exception is thrown: returns null if not found
    * @throws XtentisException
    */
   public com.amalto.core.objects.configurationinfo.ejb.ConfigurationInfoPOJO existsConfigurationInfo( com.amalto.core.objects.configurationinfo.ejb.ConfigurationInfoPOJOPK pk )
      throws com.amalto.core.util.XtentisException, java.rmi.RemoteException;

   /**
    * Remove a Configuration Info
    * @throws XtentisException
    */
   public com.amalto.core.objects.configurationinfo.ejb.ConfigurationInfoPOJOPK removeConfigurationInfo( com.amalto.core.objects.configurationinfo.ejb.ConfigurationInfoPOJOPK pk )
      throws com.amalto.core.util.XtentisException, java.rmi.RemoteException;

   /**
    * Retrieve all ConfigurationInfo PKs
    * @throws XtentisException
    */
   public java.util.Collection getConfigurationInfoPKs( java.lang.String regex )
      throws com.amalto.core.util.XtentisException, java.rmi.RemoteException;

   /**
    * Auto Upgrades the core
    * @throws XtentisException
    */
   public void autoUpgrade(  )
      throws com.amalto.core.util.XtentisException, java.rmi.RemoteException;

   /**
    * Auto Upgrades the core in the background- called on startup
    * @throws XtentisException
    */
   public void autoUpgradeInBackground(  )
      throws com.amalto.core.util.XtentisException, java.rmi.RemoteException;

}
