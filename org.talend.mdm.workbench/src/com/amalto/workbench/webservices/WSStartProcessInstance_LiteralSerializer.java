// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation （1.1.2_01，编译版 R40）
// Generated source version: 1.1.2

package com.amalto.workbench.webservices;

import com.sun.xml.rpc.encoding.*;
import com.sun.xml.rpc.encoding.xsd.XSDConstants;
import com.sun.xml.rpc.encoding.literal.*;
import com.sun.xml.rpc.encoding.literal.DetailFragmentDeserializer;
import com.sun.xml.rpc.encoding.simpletype.*;
import com.sun.xml.rpc.encoding.soap.SOAPConstants;
import com.sun.xml.rpc.encoding.soap.SOAP12Constants;
import com.sun.xml.rpc.streaming.*;
import com.sun.xml.rpc.wsdl.document.schema.SchemaConstants;
import javax.xml.namespace.QName;
import java.util.List;
import java.util.ArrayList;

public class WSStartProcessInstance_LiteralSerializer extends LiteralObjectSerializerBase implements Initializable  {
    private static final QName ns1_processUUID_QNAME = new QName("", "processUUID");
    private static final QName ns2_WSWorkflowProcessDefinitionUUID_TYPE_QNAME = new QName("urn-com-amalto-xtentis-webservice", "WSWorkflowProcessDefinitionUUID");
    private CombinedSerializer ns2_myWSWorkflowProcessDefinitionUUID_LiteralSerializer;
    private static final QName ns1_variable_QNAME = new QName("", "variable");
    private static final QName ns2_WSHashMap_TYPE_QNAME = new QName("urn-com-amalto-xtentis-webservice", "WSHashMap");
    private CombinedSerializer ns2_myWSHashMap_LiteralSerializer;
    
    public WSStartProcessInstance_LiteralSerializer(QName type, String encodingStyle) {
        this(type, encodingStyle, false);
    }
    
    public WSStartProcessInstance_LiteralSerializer(QName type, String encodingStyle, boolean encodeType) {
        super(type, true, encodingStyle, encodeType);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws Exception {
        ns2_myWSWorkflowProcessDefinitionUUID_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.amalto.workbench.webservices.WSWorkflowProcessDefinitionUUID.class, ns2_WSWorkflowProcessDefinitionUUID_TYPE_QNAME);
        ns2_myWSHashMap_LiteralSerializer = (CombinedSerializer)registry.getSerializer("", com.amalto.workbench.webservices.WSHashMap.class, ns2_WSHashMap_TYPE_QNAME);
    }
    
    public Object doDeserialize(XMLReader reader,
        SOAPDeserializationContext context) throws Exception {
        com.amalto.workbench.webservices.WSStartProcessInstance instance = new com.amalto.workbench.webservices.WSStartProcessInstance();
        Object member=null;
        QName elementName;
        List values;
        Object value;
        
        reader.nextElementContent();
        while (reader.getState() == XMLReader.START) {
            elementName = reader.getName();
            if (elementName.equals(ns1_processUUID_QNAME)) {
                member = ns2_myWSWorkflowProcessDefinitionUUID_LiteralSerializer.deserialize(ns1_processUUID_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setProcessUUID((com.amalto.workbench.webservices.WSWorkflowProcessDefinitionUUID)member);
                reader.nextElementContent();
            }
            else if (elementName.equals(ns1_variable_QNAME)) {
                member = ns2_myWSHashMap_LiteralSerializer.deserialize(ns1_variable_QNAME, reader, context);
                if (member == null) {
                    throw new DeserializationException("literal.unexpectedNull");
                }
                instance.setVariable((com.amalto.workbench.webservices.WSHashMap)member);
                reader.nextElementContent();
            }
            else {
                throw new DeserializationException("literal.unexpectedElementName", new Object[] { elementName, reader.getName()});
            }
        }
        
        XMLReaderUtil.verifyReaderState(reader, XMLReader.END);
        return (Object)instance;
    }
    
    public void doSerializeAttributes(Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.amalto.workbench.webservices.WSStartProcessInstance instance = (com.amalto.workbench.webservices.WSStartProcessInstance)obj;
        
    }
    public void doSerialize(Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.amalto.workbench.webservices.WSStartProcessInstance instance = (com.amalto.workbench.webservices.WSStartProcessInstance)obj;
        
        if (instance.getProcessUUID() == null) {
            throw new SerializationException("literal.unexpectedNull");
        }
        ns2_myWSWorkflowProcessDefinitionUUID_LiteralSerializer.serialize(instance.getProcessUUID(), ns1_processUUID_QNAME, null, writer, context);
        if (instance.getVariable() == null) {
            throw new SerializationException("literal.unexpectedNull");
        }
        ns2_myWSHashMap_LiteralSerializer.serialize(instance.getVariable(), ns1_variable_QNAME, null, writer, context);
    }
}
