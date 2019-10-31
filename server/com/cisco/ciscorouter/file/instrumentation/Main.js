// -----------------
// Load a JSON File
// -----------------

var tableEntryOid = "1.3.6.1.2.1.2.2.1.";

function loadJSONFile(file) {
	var src = readFile(file);
	var tmp = {};
	eval("tmp=" + src + ";");
	return tmp;
}

//Extra JS loading section
manager.load("trapUtil.js");
var Utils = loadJSONFile("commonUtils.js")();


// Agent Entry point. Register attribute, configuration, Performance
// and alarm functions here.

//----------------------------------
// ALarm
//required function do not remove
//OK to modify
//----------------------------------
function Alarm() {
	
	var ifAlarm = {};
	
	var result = snmpWalk({
		"IfIndex" : "1.3.6.1.2.1.2.2.1.1",
		"IfAdminStatus" : "1.3.6.1.2.1.2.2.1.7",
		"IfOperStatus" : "1.3.6.1.2.1.2.2.1.8"
	});
		for ( var index in result) {
			
			ifAlarm.IfAdminStatus =  result[index].IfAdminStatus;
			ifAlarm.IfOperStatus = result[index].IfOperStatus;
			ifAlarm.IfIndex = result[index].IfIndex;
			
			if (ifAlarm.IfAdminStatus == 1 && ifAlarm.IfOperStatus == 2) {
				functionSendAlarm(ifAlarm);
			}
		}
	// TODO Add code to poll and get outstanding alarms
	return "Success";
}
// ----------------------------------
// Attribute
// required function do not remove
// OK to modify
// ----------------------------------
function Attributes() {
	// TODO Add code to poll and update properties
	var result = snmpWalk ({
		'Index' : tableEntryOid + 1,
		'Description' : tableEntryOid + 2,
		'Type' : tableEntryOid + 3,
		'Mtu' : tableEntryOid + 4,
		'Speed' : tableEntryOid + 5,
		'PhysicalAddress' : tableEntryOid + 6,
		'AdminStatus' : tableEntryOid + 7,
		'OperStatus' : tableEntryOid + 8,
		'LastChange' : tableEntryOid + 9,
		'InOctets' : tableEntryOid + 10,
		'InUcastPkts' : tableEntryOid + 11,
		'InDiscards' : tableEntryOid + 13,
		'InError' : tableEntryOid +14,
		'InUnknownProtos' : tableEntryOid + 15,
		'OutOctets' : tableEntryOid + 16,
		'OutUcastPkts' : tableEntryOid + 17,
		'OutDiscards' : tableEntryOid + 19,
		'OutErrors' : tableEntryOid + 20
	});
		
	for (var index in result){
	
	if(!shouldRun()) {
		return undefined;
	}
	
	var managedObject = "UIM_CiscoInterface." + result[index].Index;
	
	if (result[index].Description != undefined){
		updateElement(managedObject,{
			'Description' : result[index].Description});
	}
	if (result[index].Type != undefined){
		updateElement(managedObject,{
			'Type' : result[index].Type});
	}
	if (result[index].Mtu != undefined){
		updateElement(managedObject,{
			'Mtu' : result[index].Mtu});
	}
	if (result[index].Speed != undefined){
		updateElement(managedObject,{
			'Speed' : result[index].Speed});
	}
	if (result[index].PhysicalAddress != undefined){
		updateElement(managedObject,{
			'PhysicalAddress' : result[index].PhysicalAddress});
	}
	if (result[index].AdminStatus != undefined){
		updateElement(managedObject,{
			'AdminStatus' : result[index].AdminStatus});
	}
	if (result[index].OperStatus != undefined){
		updateElement(managedObject,{
			'OperStatus' : result[index].OperStatus});
	}
	if (result[index].LastChange != undefined){
		updateElement(managedObject,{
			'LastChange' : result[index].LastChange});
	}
	if (result[index].InOctets != undefined){
		updateElement(managedObject,{
			'InOctets' : result[index].InOctets});
	}
	if (result[index].InUcastPkts != undefined){
		updateElement(managedObject,{
			'InUcastPkts' : result[index].InUcastPkts});
	}
	if (result[index].InDiscards != undefined){
		updateElement(managedObject,{
			'InDiscards' : result[index].InDiscards});
	}
	if (result[index].InError != undefined){
		updateElement(managedObject,{
			'InError' : result[index].InError});
	}
	if (result[index].InUnknownProtos != undefined){
		updateElement(managedObject,{
			'InUnknownProtos' : result[index].InUnknownProtos});
	}
	if (result[index].OutOctets != undefined){
		updateElement(managedObject,{
			'OutOctets' : result[index].OutOctets});
	}
	if (result[index].OutUcastPkts != undefined){
		updateElement(managedObject,{
			'OutUcastPkts' : result[index].OutUcastPkts});
	}
	if (result[index].OutDiscards != undefined){
		updateElement(managedObject,{
			'OutDiscards' : result[index].OutDiscards});
	}
	if (result[index].OutErrors != undefined){
		updateElement(managedObject,{
			'OutErrors' : result[index].OutErrors});
	}
	}
	return "Success";
}

// ----------------------------------
// Configuration
// required function do not remove
// OK to modify
// ----------------------------------
function Configuration() {
	
	var result = snmpWalk ({
		'Index' : tableEntryOid + 1
	});
	
	for(var index in result){
		
		if(!shouldRun()){
			return undefined;
		}
		createElement({"Name" : "CiscoInterface." + result[index].Index,
			           "DisplayName" : "CiscoInterface." + result[index].Index,
		           	   "ElementType" : "Grouping",
			           "CustomClassName" : "UIM_CiscoInterface"
				     });
	}
	// TODO Add code to poll configuration data
	// doNotDeleteList contains the managed object name that should not be
	// deleted no matter if the poll failed this could be static or dynamic.
	// Also it could be a HashMap {} as well where it would use the KEY to build
	// list
	var doNotDeleteList = [];
	// if agent is not to do reconcile you can return a var that is set to
	// false, or don't return anything
	// var doReconcile = false;
	return doNotDeleteList;
}

// ----------------------------------
// Performance
// required function do not remove
// OK to modify
// ----------------------------------
function Performance() {
	// TODO Add code to poll and update properties
	return "Success";
}

// ---------------
// TrapParser
// required function do not remove
// OK to modify
// ---------------
function TrapParser(trapId, varbinds, alarmId) {
	// TODO Add Code to parse trap
	
	if ( trapId == "1.3.6.1.6.3.1.1.5.3.0.0" || trapId == "1.3.6.1.6.3.1.1.5.4.0.0") {
		
		var ifIndex = "" ;
		var ifOperStatus = "" ;
		var ifAdminStatus = "";
		
		for ( var index in varbinds) {

			if (!shouldRun()) {
				return undefined;
			}
			if (varbinds[index].oid == "1.3.6.1.2.1.2.2.1.1") { ifIndex = varbinds[index].value }
			if (varbinds[index].oid == "1.3.6.1.2.1.2.2.1.7") { ifAdminStatus = varbinds[index].value }
			if (varbinds[index].oid == "1.3.6.1.2.1.2.2.1.8") { ifOperStatus = varbinds[index].value }
		}
		
		var ifTrap = {};
		
		ifTrap.IfIndex = ifIndex;
		ifTrap.IfAdminStatus = ifAdminStatus ;
		ifTrap.IfOperStatus = ifOperStatus;
		
		if (ifTrap.IfAdminStatus == 1 && ifTrap.IfOperStatus == 2) {
			functionSendAlarm(ifTrap,state);
		}
	} else {
		unknownTrapAlarm(trapId,varbinds);
	}

	return "success";
}


function functionSendAlarm(alarmObject) {
	
	var adminMsg = ["", "Up", "Down", "Testing"];
	var stateVar= [1, 3, 1, 1, 1, 1, 1, 1];
	var perceivedSeverity= [1, 2, 5, 3, 3, 3, 3, 3];

		sendAlarm({
			"Clearable": true,
			"SpecificCause": "Interface_" + alarmObject['IfIndex'] + " " + adminMsg[alarmObject['IfAdminStatus']],
			"ProbableCause": 1,
			"AlertType": 2,
			"State" : stateVar[alarmObject['IfOperStatus']],
			"DisplayName": "Interface Alarm",
			"Description": "Interface " + adminMsg[alarmObject['IfAdminStatus']] + " alarm(AdminStatus)",
			"Caption": "Interface_" + alarmObject['IfIndex'] + " operStatus: " + alarmObject['IfOperStatus'],
			"PerceivedSeverity": perceivedSeverity[alarmObject['IfOperStatus']],
			"ManagedObject": "Interface_" + alarmObject['IfIndex'],
			"Name": "Interface_Down"
		});
}
		
function unknownTrapAlarm(trapId,varbinds) {
	
	var description = "";

	for ( var index in varbinds) {

		if (!shouldRun()) {
			return undefined;
		}
		var key = varbinds[index].oid;
		var value = varbinds[index].value;

		description += key + " : " + value + " ";
	}
			
		sendAlarm({
			"Name" : "Unknown trap",
			"ProbableCause" : 1,
			"DisplayName" : "Unknown trap",
			"AlertType" : 1,
			"PerceivedSeverity" : 1,
			"SpecificCause" : trapId,
			"Description" : "Unknown trap received : " + trapId + " varbinds ["
			+ description + "]",
			"State" : 1,
			"Caption" : "Unknown Trap",
			"UserResponsible" : "Device",
			"Clearable" : false
		});
}

// -------------
// Error Handling function called when an exception or now return on a method
// FunctionName = Name of the offending function
// params = array of parameters that were passed to the function
// exception = string of the stack trace if any that caused the problem
// -------------
function ErrorHandler(functionName, params, exception) {
	logDebug("Handling Error on " + functionName);
	// TODO Update how you handle a failure in the different Poll Cycles
	if (functionName == "Configuration") {
		// TODO Update Configuration Error rHandling

	} else if (functionName == "Attributes") {
		// TODO Update Attributes Error Handling

	} else if (functionName == "Alarm") {
		// TODO Update Alarm Error Handling

	} else if (functionName == "Performance") {
		// TODO Update Performance Error Handling

	} else if (functionName == "trapParser") {
		// TODO Update TrapParsing Error Handling
		// var varbindArray = trapArray(params[0]);
		// var trapId = params[0].get("trapId");
		// var alarmId = params[0].get("alarmId");
	}
	return "success";
}

//----------------------------------
//addResyncClass	
//limit the number of classes that will be reconciled
//----------------------------------
function addResyncClass(className){
	manager.addResyncClass(className);
}

// --------------
// Get Instrument Directory path
// --------------
function getInstrumentDir() {
	return manager.getInstrumentDir();

}
// --------------
// Check to see if agent should be running
// --------------
function shouldRun() {
	return manager.shouldRun("");

}

// ---------------
// Trap Paser don't touch
// ---------------
function trapParser(params) {
	var varbindArray = trapArray(params);
	var trapId = params.get("trapId") + "";
	var alarmId = params.get("alarmId") + "";
	return TrapParser(trapId, varbindArray, alarmId);
}
function trapArray(params) {
	var trapBinding = new Array();
	var indexes = new Array();
	var trapBinds = params.get("trapBindVars");
	indexes = trapBinds.toArray();
	for ( var index in indexes) {
		if (!shouldRun()) {
			return undefined;
		}
		hashMap = trapBinds.get(index);
		var tmp = hashMap.keySet().toArray();
		trapBinding[Number(index) + 1] = {
			"value" : hashMap.get(tmp[0]),
			"oid" : tmp[0] + ""
		};
	}
	return trapBinding;

}

function trapOidArray(params) {
	var trapBinding = new Array();
	var indexes = new Array();
	var trapBinds = params.get("trapBindVars");
	indexes = trapBinds.toArray();
	for ( var index in indexes) {
		if (!shouldRun()) {
			return undefined;
		}
		hashMap = trapBinds.get(index);
		var tmp = hashMap.keySet().toArray();
		trapBinding[tmp[0]] = hashMap.get(tmp[0]);
	}
	return trapBinding;

}
// -----------------
// Load a JSON File
// Create elements from the JSON
// ------------------
function createElementsFromFile(file) {
	var result = loadJSONFile(file);
	for (index in result) {
		createElement(result[index]);
	}
}

// -----------
// Read a file into a string
// -----------
function readFile(file) {
	return manager.readFile(file) + "";
}
// -----------------
// Converts a file to an array
// -----------------
function arrayNewLineFile(file) {
	var src = readFile(file);
	return src.split("\n");
}

// -----------------
// Description:Updates attributes of an elements
// converts it to java hashmap and calls
// manager updateElements
// -----------------
function updateElement(name, json) {
	var hashmap = new java.util.HashMap();
	for (key in json) {
		hashmap.put(key, json[key]);
		manager.logInfo(key + " :" + json[key]);
	}
	manager.updateElement(name, hashmap);

}
// -----------------
// Description: Creates an Element from json object
// converts it to java hashmap and calls
// manager createElements
// returns: instanceID
// -----------------
function createElement(json) {
	var hashmap = new java.util.HashMap();
	for (key in json) {

		hashmap.put(key, json[key]);
		manager.logInfo(key + " :" + json[key]);
	}
	return manager.createElement(hashmap);

}

// ---------------
// Description: Send Alarms using a json object
// converts it to java Hashmap and call manager
// to update
//
// ---------------
function sendAlarm(json) {
	var hashmap = new java.util.HashMap();
	if (json.DisplayName == undefined && json.Name != undefined) {
		json.DisplayName = json.Name;
	}
	for (key in json) {
		switch(key) {
		case "ProbableCause":
		case "AlertType":
		case "PerceivedSeverity":
		case "State":
			hashmap.put(key, manager.getInt(json[key] + ""));
			break;
		default: 
			hashmap.put(key, json[key]);	
		}
		manager.logDebug(key + " :" + json[key]);
	}
	loadDefaults(hashmap);
	manager.sendAlarm(hashmap);
}

function loadDefaults(hashmap) {
	if(!hashmap.containsKey("UserResponsible")) {
		hashmap.put("UserResponsible", "Device");
	}
	if(!hashmap.containsKey("Clearable")) {
		hashmap.put("Clearable", java.lang.Boolean("false"));
	}
	
}

function snmpGet(oid) {

	return manager.snmpGet(oid);
}

/**
 * Execute snmp get next operation
 * 
 * @param oid
 * @returns
 */
function snmpGetNext(oid) {
	return manager.snmpGetNext(oid);
}

/**
 * Execute snmp set operation
 * 
 * @param oid
 * @param value
 * @returns
 */
function snmpSet(oid, value) {
	return manager.snmpSet(oid, value);
}

// ---------------
// Walks oids
// returns a 2d array where the second part of
// 2d array is json accessable
// ---------------
function snmpWalk(fields) {
	var oids = {};
	var size = 0;
	for (field in fields) {
		size++;
	}
	for (field in fields) {
		if (!shouldRun()) {
			return undefined;
		}
		var walkOid = fields[field];
		var map = manager.snmpWalk(walkOid);
		var myArray = map.keySet().toArray();
		for ( var index in myArray) {
			if (!shouldRun()) {
				return undefined;
			}

			var oid = myArray[index] + "";

			var index = oid.substring(walkOid.length);
			index = index.replace(/^\./, "");
			if (size == 1) {
				if (fields[field].prototype == "String") {
					var reg = /^(\d+)\.(.*)/;
					var test = index.match(reg);
					if (test) {
						field = test[1];
						index = test[2];
					}
				}
			}
			if (oids[index] === undefined) {
				oids[index] = {};
			}
			if (index == "") {
				oids[field] = map.get(oid);
			} else {
				oids[index][field] = map.get(oid);
			}

		}

	}
	return oids;
}

/**
 * Execute snmp get by IP operation
 * 
 * @param oid
 * @returns
 */
function snmpGetByIP(oid, ipAddress) {
	return manager.snmpGetByIP(oid, ipAddress);
}


/**
 * Execute snmp get by IP and different read community operation
 * 
 * @param oid
 * @returns
 */
function snmpGetByIPAndCommunity(oid, ipAddress, communityString) {
	return manager.snmpGetByIPAndCommunity(oid, ipAddress, communityString);
}

/**
 * Execute snmp walk by IP operation
 * 
 * @param oid
 * @returns
 */
function snmpWalkByIP(oid, ipAddress) {
	return manager.snmpWalkByIP(oid, ipAddress);
}


/**
 * Execute snmp walk by IP and different read community operation
 * 
 * @param oid
 * @returns
 */
function snmpWalkByIPAndCommunity(oid, ipAddress, communityString) {
	return manager.snmpWalkByIPAndCommunity(oid, ipAddress, communityString);
}

/**
 * Execute snmp get by context name and security name operation
 * 
 * @param oid
 * @returns
 */
function snmpGetByV3ContextNameAndSecurityName(oid, contextName, securityName) {
	return manager.snmpGetByV3ContextNameAndSecurityName(oid, contextName, securityName);
}

/**
 * Execute snmp walk by IP and different read community operation
 * 
 * @param oid
 * @returns
 */
function snmpWalkByV3ContextNameAndSecurityName(oid, contextName, securityName) {
	return manager.snmpWalkByV3ContextNameAndSecurityName(oid, contextName, securityName);
}

// ------------------
// Get the specified property
// -----------------
function getProperty(name, property) {
	return manager.getProperty(name, property);
}
// ------------------
// Delete an element by name
//
// ------------------
function deleteElement(element) {
	manager.deleteElement(element);
}

// --------------
// Logging functions
// ---------------
function logInfo(message) {
	manager.logInfo(message);
}

function logDebug(message) {
	manager.logDebug(message);
}
function logWarn(message) {
	manager.logWarn(message);
}
function logError(message) {
	manager.logError(message);
}
function logFatal(message) {
	manager.logFatal(message);
}
// --------------
// Passed a result of a walk and converts it to JSON
// and puts it in the log
// --------------
function logWalk(result) {
	logWarn(manager.getJSON(result));
}

function logJSON(json) {
	logWarn(manager.getJSON(json));
}
