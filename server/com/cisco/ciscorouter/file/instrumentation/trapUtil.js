function trapGetVarbindValue(varbindName, varbindJSON) {

	for ( var index in varbindJSON) {

		if (!shouldRun()) {
			return undefined;
		}
		var key = varbindJSON[index].oid;
		var value = varbindJSON[index].value;

		// There can be an index at the and of the key.
		
		var i = key.indexOf(varbindName);
        if(i === 0 && (key.length == varbindName.length 
    	    			|| varbindName.charAt(varbindName.length - 1) == '.' 
    	    			|| key.charAt(varbindName.length) == '.')){ 
    	    return value;		    
    	}	
	}

	logError(varbindName + " was not found in the in the varbinds for the trap");
}