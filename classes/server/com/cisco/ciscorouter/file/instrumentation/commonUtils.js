function load(){
	var Utils = {
		startsWith: function(str, subStr){
			if(!str || !subStr){
				return false;
			}
				return  (str + "").substr(0, subStr.length) == subStr;
		},
		timeTicksConvert: function(ticks){
			if (isNaN(ticks)){			
				return ticks;
			}else{
				ticks = Math.round(ticks/100);
				var hours = Math.floor(ticks/3600);
				var minutes = Math.floor((ticks - hours*3600)/60);
				var seconds = ticks - hours*3600 - minutes*60;
				return hours + "h " + minutes + "m " + seconds + "s";		
			}
		},
		dateTimeConvert: function(octetStr){
			var ret = octetStr;
			if(octetStr){
				var arr = octetStr.split(':');
				if (arr.length > 6){	
					var datetime = {
						year: parseInt(arr[0] + arr[1], 16),
						month: parseInt(arr[2], 16),
						day: parseInt(arr[3], 16),
						hour: parseInt(arr[4], 16),
						minute: parseInt(arr[5], 16),
						second: parseInt(arr[6], 16)			
					};	
					ret = datetime.year + "-" + datetime.month + "-" + datetime.day + 
						", " + datetime.hour + ":" + datetime.minute + ":" + datetime.second;
				}
			}
			return ret;
		},
		getSize: function(obj){
			var size = 0;
			for(var i in obj){
				size++;
			}
			return size;
		},
		isEmpty: function(obj){
			return this.getSize(obj) == 0;
		},
		addrConvert: function(hexAddr){
			if(!hexAddr) {
				return hexAddr;
			}
			var arr = hexAddr.split(':');
			var addr = "";
			for (var i in arr){			
				addr = addr + parseInt(arr[i], 16) + '.';
			}		
			return addr.substring(0, addr.length - 1);
		},
		mergeObjects: function(obj1, obj2){
			if(obj1 && obj2){
				for(var key in obj2){
					obj1[key] = obj2[key];
				}
			}
		}
		
	};
	return Utils;
};
