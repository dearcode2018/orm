	var imgamount = $("#tupian ul li").length;
	
	$("#tupian ul li:first").clone().appendTo($("#tupian ul"));
	$("#tupian ul li").eq(imgamount-1).clone().prependTo($("#tupian ul"));

	var imagewidth = $("#tupian ul li:eq(2) img").width();

	 $("#tupian ul").css("left",-imagewidth);

	var jiangeshijian = 4000; 

	var nowshowpic = 0; 

	for(var i = 0 ; i < imgamount ; i++){
		$("#xiaoyuandian ul").append("<li>"+"</li>");
	}
	shezhixiaoyuandian(0);

	var mytimer = null;
	zidong();
	function zidong(){
		window.clearInterval(mytimer);
		mytimer = window.setInterval(
			function(){
				$("#anniu .you").trigger("click");
			}
		,jiangeshijian);
	}

	$("#lunbo,#anniu").mouseenter(
		function(){
			window.clearInterval(mytimer);
		}
	);

	$("#lunbo,#anniu").mouseleave(
		function(){
			zidong();
		}
	);

	$("#anniu .you").click(
		function(){
			if(!$("#tupian ul").is(":animated")){
				if(nowshowpic < imgamount - 1){
					nowshowpic ++;
					huantu(nowshowpic);
				}else{
					nowshowpic = 0;
					huantu2(imgamount);
				}
				shezhixiaoyuandian(nowshowpic);
			}
		}
	);

	$("#anniu .zuo").click(
		function(){
			if(!$("#tupian ul").is(":animated")){
				if(nowshowpic > 0){
					nowshowpic --
					huantu(nowshowpic);
				}else{
					nowshowpic = imgamount - 1;
					huantu3(nowshowpic);
				}
				shezhixiaoyuandian(nowshowpic);
			}
		}
	);

	$("#xiaoyuandian ul li").click(
		function(){
			nowshowpic = $(this).index();
			huantu(nowshowpic);
			shezhixiaoyuandian(nowshowpic);
		}
	);

	function shezhixiaoyuandian(num){
		$("#xiaoyuandian ul li").eq(num).addClass("cur").siblings().removeClass("cur");
	}

	function huantu(num){
		$("#tupian ul").animate(
			{
				"left": -1 * $("#tupian ul li img").width() * (num + 1)
			}
			,300
		);
	}
	function huantu2(num){
		$("#tupian ul").animate(
			{
				"left": -1 * $("#tupian ul li img").width() * (num + 1)
			}
			,300,function(){
				$("#tupian ul").css("left",-imagewidth);
			}
		);
	}
	function huantu3(num){
		$("#tupian ul").animate(
			{
				"left": 0
			}
			,300,function(){
				$("#tupian ul").css("left",-imagewidth * imgamount);
			}
		);
	}
