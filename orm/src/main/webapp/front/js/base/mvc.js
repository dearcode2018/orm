/* 
* Loading JavaScript Direct Output
* loadScript.write(["a.js", "b.js"]); 
*/
var loadScript = (function () {
    var write = function (urls) {
    	var _frontUrl = APP_ROOT || window.location.origin;
        urls.splice(0, 0, "/front/js/vendor/jquery.event/eventCollect.js"); //插入第一个加载（Ev-index.js );
        urls.splice(1, 0, "/front/mvc/base/BaseModel.js");                            //插入第一个加载（BaseModel.js );
        urls.splice(2, 0, "/front/mvc/base/BaseView.js");                              //插入第一个加载（BaseView.js );
        for (var i = 0, pi; pi = urls[i++];) {
            document.write('<script type="text/javascript" src="' + _frontUrl + pi + '"></script>');
        }
    };
    return {
        write: write
    };
})();
var loadScriptAsyn = (function () {
    var loadOne = function (url) {
        var dtd = $.Deferred();
        var node = document.createElement('script');
        node.type = "text/javascript";
        var onload = function () {
            dtd.resolve();
        };
        $(node).load(onload).bind('readystatechange', function () {
            if (node.readyState == 'loaded') {
                onload();
            }
        });
        document.getElementsByTagName('head')[0].appendChild(node);
        node.src = url;
        return dtd.promise();
    };

    var load = function (urls) {
        if (!$.isArray(urls)) {
            return load([urls]);
        }
        var ret = [];
        for (var i = 0; i < urls.length; i++) {
            ret[i] = loadOne(urls[i]);
        };
        return $.when.apply($, ret);
    }

    return {
        load: load
    };
})();

/**
 * 获取URL中参数的值
 * 
 * 例子：http://abc.com?action=update&id=987654321789
 * var action = getUrlParam("action"); //返回action的值为"update"
 * 
 * Author: 许继俊
 * 
 * Param: name: 要获取的参数名字
 * return：返回参数的值
 */
function getUrlParam(name,_location){
	//console.log(window.location);
	var _location_url =_location || window.location.search;
	var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象
	var r = _location_url.substr(1).match(reg); //匹配目标参数
	if (r != null)
		return unescape(r[2]);
	return null; //返回参数值
}
