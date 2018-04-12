







/* 创建 xml http request */
function createXhr() {
	// xml http request
	var xhr = null;
	//最复杂的一步
	if (window.XMLHttpRequest)
	{
		// code for IE7+, Firefox, Chrome, Opera, Safari
		xhr=new XMLHttpRequest();
		//针对某些特定版本的mozillar浏览器的bug进行修正。
		if (xhr.overrideMimeType) {
		xhr.overrideMimeType('text/xml');
		}
	} else
	{
		// code for IE6, IE5
		xhr=new ActiveXObject("Microsoft.XMLHTTP");
	}
	
	return xhr;
}

/* StringBuilder */
function StringBuilder() { 
    var sb = new Array(); 
    if (arguments[0] != undefined && arguments[0] != null) { 
        sb[0] = arguments[0]; 
    } 
    this.append = function(str) { 
        sb[sb.length] = str; 
    }; 
    this.appendFormat = function() { 
        var s = arguments[0]; 
        for (var i = 0; i < arguments.length - 1; i++) { 
            var reg = new RegExp("//{" + i + "//}", "gm"); 
            s = s.replace(reg, arguments[i + 1]); 
        } 
        sb[sb.length] = s; 
    }; 
    this.toString = function() { 
        /*        var s = ""; 
        for (var i = 0; i < sb.length; i++) { 
        s += sb[i]; 
        } 
        return s;*/ 
        if (arguments[0] != undefined && arguments[0] != null) { 
            return sb.join(arguments[0]); 
        } 
        return sb.join(""); 
    }; 
    this.replace = function(index, str) { 
        sb[index] = str; 
    }; 
    this.replaceFormat = function() { 
        var s = arguments[1]; 
        for (var i = 0; i < arguments.length - 2; i++) { 
            var reg = new RegExp("//{" + i + "//}", "gm"); 
            s = s.replace(reg, arguments[i + 2]); 
        } 
        this.replace(arguments[0], s); 
    }; 
    this.remove = function(index) { 
        for (var i = index + 1; i < sb.length; i++) { 
            sb[i - 1] = sb[i]; 
        } 
        sb.length = sb.length - 1;
    }; 
    this.insert = function(index, str) { 
        var len = sb.length + 1; 
        for (var i = index; i < len; i++) { 
            sb[i + 1] = sb[i]; 
        } 
        sb[index] = str; 
    }; 
    this.insertFormat = function() { 
        var s = arguments[1]; 
        for (var i = 0; i < arguments.length - 2; i++) { 
            var reg = new RegExp("//{" + i + "//}", "gm"); 
            s = s.replace(reg, arguments[i + 2]); 
        } 
        this.insert(arguments[0], s); 
    }; 
    this.length = function() { 
        return sb.length; 
    }; 
    this.appendLine = function() { 
        if (arguments[0] != undefined && arguments[0] != null) { 
            this.append(arguments[0]); 
        } 
        else { 
            this.append("/r/n"); 
        } 
    } 
}; 



