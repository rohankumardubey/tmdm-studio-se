// ============================================================================
//
// Copyright (C) 2006-2012 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.mdm.workbench.serverexplorer.core;

import java.util.Collection;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.talend.commons.exception.PersistenceException;
import org.talend.commons.ui.runtime.image.IImage;
import org.talend.core.model.properties.Item;
import org.talend.core.model.repository.ERepositoryObjectType;
import org.talend.core.model.repository.IRepositoryContentHandler;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.core.repository.utils.XmiResourceManager;
import org.talend.mdm.repository.model.mdmproperties.MDMServerDefItem;
import org.talend.mdm.repository.model.mdmproperties.MdmpropertiesFactory;
import org.talend.repository.model.RepositoryNode;

public class ServerDefRepositoryContentHandler implements IRepositoryContentHandler {

    private XmiResourceManager xmiResourceManager = new XmiResourceManager();

    public ServerDefRepositoryContentHandler() {
    }

    public ERepositoryObjectType getRepositoryObjectType(Item item) {
        if (item instanceof MDMServerDefItem) {
            return ServerDefService.REPOSITORY_TYPE_SERVER_DEF;
        }
        return null;
    }

    public Resource create(IProject project, Item item, int classifierID, IPath path) throws PersistenceException {

        if (item instanceof MDMServerDefItem) {
            Resource itemResource = xmiResourceManager.createItemResource(project, item, path,
                    ServerDefService.REPOSITORY_TYPE_SERVER_DEF, false);
            itemResource.getContents().add(((MDMServerDefItem) item).getServerDef());
            return itemResource;
        }
        return null;
    }

    public Resource save(Item item) throws PersistenceException {
        if (item instanceof MDMServerDefItem) {
            Resource resource = xmiResourceManager.getItemResource(item);

            resource.getContents().clear();
            resource.getContents().add(((MDMServerDefItem) item).getServerDef());
            return resource;
        }
        return null;
    }

    public IImage getIcon(ERepositoryObjectType type) {
        if (type == ServerDefService.REPOSITORY_TYPE_SERVER_DEF)
            return ServerDefImage.BEAN_ICON;
        return null;
    }

    public Item createNewItem(ERepositoryObjectType type) {
        if (type == ServerDefService.REPOSITORY_TYPE_SERVER_DEF) {
            return MdmpropertiesFactory.eINSTANCE.createMDMServerDefItem();
        }
        return null;
    }

    public boolean isProcess(Item item) {
        return false;
    }

    public boolean isRepObjType(ERepositoryObjectType type) {
        return type == ServerDefService.REPOSITORY_TYPE_SERVER_DEF;
    }

    public ERepositoryObjectType getProcessType() {
        return null;
    }

    public ERepositoryObjectType getCodeType() {
        return null;
    }

    public void addNode(ERepositoryObjectType type, RepositoryNode recBinNode, IRepositoryViewObject repositoryObject,
            RepositoryNode node) {
        // TODO Auto-generated method stub
    }

    public void addContents(Collection<EObject> collection, Resource resource) {
        // TODO Auto-generated method stub
    }

    public IImage getIcon(Item item) {
        // TODO Auto-generated method stub
        return null;
    }
}
