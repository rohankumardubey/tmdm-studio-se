// ============================================================================
//
// Talend Community Edition
//
// Copyright (C) 2006-2012 Talend �C www.talend.com
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
// Lesser General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program; if not, write to the Free Software
// Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
//
// ============================================================================
package org.talend.mdm.repository.core.impl.recyclebin;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.ui.navigator.CommonViewer;
import org.talend.core.model.properties.FolderType;
import org.talend.core.model.repository.IRepositoryViewObject;
import org.talend.mdm.repository.core.AbstractRepositoryAction;
import org.talend.mdm.repository.core.impl.RepositoryNodeActionProviderAdapter;
import org.talend.mdm.repository.ui.actions.recyclebin.EmptyRecycleBinAction;
import org.talend.mdm.repository.ui.actions.recyclebin.RemovePhysicallyFromRepositoryAction;
import org.talend.mdm.repository.ui.actions.recyclebin.RestoreAction;
import org.talend.mdm.repository.utils.RepositoryResourceUtil;

/**
 * DOC hbhong class global comment. Detailled comment <br/>
 * 
 */
public class RecycleBinActionProvider extends RepositoryNodeActionProviderAdapter {

    AbstractRepositoryAction removeAction;

    AbstractRepositoryAction emptyRecycleBinAction;

    AbstractRepositoryAction restoreAction;

    @Override
    public void initCommonViewer(CommonViewer commonViewer) {
        removeAction = initRepositoryAction(new RemovePhysicallyFromRepositoryAction(), commonViewer);
        emptyRecycleBinAction = initRepositoryAction(new EmptyRecycleBinAction(), commonViewer);
        restoreAction = initRepositoryAction(new RestoreAction(), commonViewer);
    }

    @Override
    public List<AbstractRepositoryAction> getActions(IRepositoryViewObject viewObj) {
        List<AbstractRepositoryAction> actions = new LinkedList<AbstractRepositoryAction>();
        if (!RepositoryResourceUtil.hasContainerItem(viewObj, FolderType.SYSTEM_FOLDER_LITERAL)) {
            actions.add(removeAction);
            actions.add(restoreAction);
        } else {
            addAction(actions, emptyRecycleBinAction, viewObj);
        }
        return actions;
    }

}
