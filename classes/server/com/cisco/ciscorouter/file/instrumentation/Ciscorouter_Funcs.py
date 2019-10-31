# NetBoss imports
from com.harris.netboss.buildit.server.shared.japi import StoreFactory
from com.cisco.ciscorouter.file.instrumentation import InstrumentationManager
instanceStore = StoreFactory.getStore(insAgentDomainName)

instrumentationManager = InstrumentationManager(\
    insAgentDomainName, propertySetter, instanceStore.get("SystemName"),\
    agentHome, agentVendor, agentName, agentVersion, customAgentHome, namespacePath)

instanceStore.put("InstrumentationManager", instrumentationManager)

instrumentationManager.initializeClasses()
instrumentationManager.performCustomInitialization()
instanceStore.put("CustomTask", instrumentationManager)
