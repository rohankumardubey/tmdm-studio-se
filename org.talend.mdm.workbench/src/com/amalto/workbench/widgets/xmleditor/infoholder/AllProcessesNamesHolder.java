package com.amalto.workbench.widgets.xmleditor.infoholder;

import java.util.ArrayList;
import java.util.List;

import com.amalto.workbench.webservices.WSGetTransformerV2PKs;
import com.amalto.workbench.webservices.WSTransformerV2PK;
import com.amalto.workbench.webservices.XtentisPort;

class AllProcessesNamesHolder extends ExternalInfoHolder<String[]> {

    private XtentisPort port;

    public AllProcessesNamesHolder(XtentisPort port) {
        this.port = port;
    }

    @Override
    public String[] getExternalInfo() {

        if (port == null)
            return new String[0];

        WSTransformerV2PK[] transformerPKs = null;
        try {
            transformerPKs = port.getTransformerV2PKs(new WSGetTransformerV2PKs("")).getWsTransformerV2PK();
        } catch (Exception e) {
            return new String[0];
        }
        List<String> processes = new ArrayList<String>();
        if (transformerPKs != null)
            for (WSTransformerV2PK pk : transformerPKs) {
                if (pk.getPk() != null && pk.getPk().length() > 0)
                    processes.add(pk.getPk());
            }

        return processes.toArray(new String[0]);
    }

    @Override
    public String getId() {
        return INFOID_ALLPROCESSNAMES;
    }

}
