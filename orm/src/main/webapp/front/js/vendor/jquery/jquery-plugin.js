
/* 1.多选控件为空，不提交，即提交 null
 * 2.多选控件为多个(超过1个)，以数组形式提交
 * 3.多选控件为单个，不以数组形式提交 (问题存在 : 无法识别该控件是否为多选)
 * 
 * 场景3解决方案 : 
 * 给多选控件一个特殊的命名前缀，使其始终以数组形式提交数据
 * 
 *  */
(function($) {
        $.fn.serializeJson=function() {
            var serializeObj = {};  
            var array = this.serializeArray();  
            $(array).each(function() {
            	// 以 Array 为后缀，注意 正则 \w 而不是 \\w (复制会产生)
            	var regex =/\w+(Array)/g;
            	if (this.name.match(regex)) {
            		if (null == serializeObj[this.name]) {
            			// 创建一个空数组
            			serializeObj[this.name] = [];
            		}
            		serializeObj[this.name].push(this.value);
            	} else {
            		 serializeObj[this.name] = this.value;   
            	}
            });
            	/*
                if(serializeObj[this.name]) {
                	// 该字段已经有值，需要封装成数组形式
                    if($.isArray(serializeObj[this.name])) {
                    	// 数组对象
                    	serializeObj[this.name].push(this.value);
                    } else {
                    	// 使其成为数组 [之前的值, 新值] 构成一个数组
                    	serializeObj[this.name] = [serializeObj[this.name], this.value];  
                    }  
                } else {
                	// 该字段还没有值
                    serializeObj[this.name] = this.value;   
                }  
            });*/
            
            // 还需调用 JSON.stringify 方法将 js 对象转成 json格式的数据
            return JSON.stringify(serializeObj);  
        };  
    })(jQuery); 


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
