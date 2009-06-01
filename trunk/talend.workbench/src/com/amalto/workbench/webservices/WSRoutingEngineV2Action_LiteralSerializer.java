// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation ��1.1.2_01������� R40��
// Generated source version: 1.1.2

package com.amalto.workbench.webservices;

import java.util.List;

import javax.xml.namespace.QName;

import com.sun.xml.rpc.encoding.CombinedSerializer;
import com.sun.xml.rpc.encoding.DeserializationException;
import com.sun.xml.rpc.encoding.Initializable;
import com.sun.xml.rpc.encoding.InternalTypeMappingRegistry;
import com.sun.xml.rpc.encoding.SOAPDeserializationContext;
import com.sun.xml.rpc.encoding.SOAPSerializationContext;
import com.sun.xml.rpc.encoding.SerializationException;
import com.sun.xml.rpc.encoding.literal.LiteralObjectSerializerBase;
import com.sun.xml.rpc.streaming.XMLReader;
import com.sun.xml.rpc.streaming.XMLReaderUtil;
import com.sun.xml.rpc.streaming.XMLWriter;

public class WSRoutingEngineV2Action_LiteralSerializer extends LiteralObjectSerializerBase implements Initializable  {
    private static final QName ns1_wsAction_QNAME = new QName("", "wsAction");
    private static final QName ns2_WSRoutingEngineV2ActionCode_TYPE_QNAME = new QName("urn-com-amalto-xtentis-webservice", "WSRoutingEngineV2ActionCode");
    private CombinedSerializer ns2myns2_WSRoutingEngineV2ActionCode__WSRoutingEngineV2ActionCode_LiteralSerializer;
    
    public WSRoutingEngineV2Action_LiteralSerializer(QName type, String encodingStyle) {
        this(type, encodingStyle, false);
    }
    
    public WSRoutingEngineV2Action_LiteralSerializer(QName type, String encodingStyle, boolean encodeType) {
        super(type, true, encodingStyle, encodeType);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws Exception {
        ns2myns2_WSRoutingEngineV2ActionCode__WSRoutingEngineV2ActionCode_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.amalto.workbench.webservices.WSRoutingEngineV2ActionCode.class, ns2_WSRoutingEngineV2ActionCode_TYPE_QNAME);
    }
    
    public Object doDeserialize(XMLReader reader,
        SOAPDeserializationContext context) throws Exception {
        com.amalto.workbench.webservices.WSRoutingEngineV2Action instance = new com.amalto.workbench.webservices.WSRoutingEngineV2Action();
        Object member=null;
        QName elementName;
        List values;
        Object value;
        
        reader.nextElementContent();
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_wsAction_QNAME)) {
                member = ns2myns2_WSRoutingEngineV2ActionCode__WSRoutingEngineV2ActionCode_LiteralSerializer.deserialize(ns1_wsAction_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setWsAction((com.amalto.workbench.webservices.WSRoutingEngineV2ActionCode)member);
                reader.nextElementContent();
            } else {
                throw new DeserializationException("literal.unexpectedElementName", new Object[] { ns1_wsAction_QNAME, reader.getName() });
            }
        }
        else {
            throw new DeserializationException("literal.expectedElementName", reader.getName().toString());
        }
        
        XMLReaderUtil.verifyReaderState(reader, XMLReader.END);
        return (Object)instance;
    }
    
    public void doSerializeAttributes(Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.amalto.workbench.webservices.WSRoutingEngineV2Action instance = (com.amalto.workbench.webservices.WSRoutingEngineV2Action)obj;
        
    }
    public void doSerialize(Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.amalto.workbench.webservices.WSRoutingEngineV2Action instance = (com.amalto.workbench.webservices.WSRoutingEngineV2Action)obj;
        
        if (instance.getWsAction() == null) {
            throw new SerializationException("literal.unexpectedNull");
        }
        ns2myns2_WSRoutingEngineV2ActionCode__WSRoutingEngineV2ActionCode_LiteralSerializer.serialize(instance.getWsAction(), ns1_wsAction_QNAME, null, writer, context);
    }
}
