<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html ng-app="myapp">
<head>

    <title>My JSP 'index.jsp' starting page</title>
    <script type="text/javascript" src="test/js/jquery-2.2.2.min.js"></script>
    <script src="test/js/angular.min.js"></script>
</head>
index.jsp----${str }

<body ng-controller="myc">
<!-- <iframe id="myf" src="test/test.html"></iframe> -->
<input type="text" ng-model="url.age">
<br><iframe id="myf" scrolling="auto" src="http://www.qietu.com" style="opacity: 1; width: 330px; height: 568px; transform: scale(0.960526); transform-origin: 50% 0% 0px; pointer-events: none;"></iframe>
<br>
<button onclick="test()">修改</button>
<button onclick="test2()">查看</button>
<button ng-click="ngtest()">ng</button>{{url}}
<!-- <script type="text/javascript" src="http://www.wenjuan.com/iframe/56de4defa320fc3068cde59e/"></script>
<iframe id="goldendata_form_GDvHGG" src="https://jinshuju.net/f/GDvHGG?background=white&banner=show&embedded=true" width="100%" frameborder=0 allowTransparency="true" height="679"></iframe>
<script src="https://jinshuju.net/f/GDvHGG/embedded.js?banner=show&background=white&height=673"></script> -->



<script type="text/javascript">
function getMousePos(event) {
    var e = event || window.event;
    var scrollX = document.documentElement.scrollLeft || document.body.scrollLeft;
    var scrollY = document.documentElement.scrollTop || document.body.scrollTop;
    var x = e.pageX || e.clientX + scrollX;
    var y = e.pageY || e.clientY + scrollY;
    alert('x: ' + x + '\ny: ' + y);
    return { 'x': x, 'y': y };
}


	function test2(){
		alert($('#myf').attr("src"))
	}
	function test(){
		//$('#myf').attr('src',"http://www.baidu.com")
		window.open ('http://www.qietu.com/', 'newwindow', 'height=568, width=330, top=0, left=0, toolbar=0, menubar=0, scrollbars=0, resizable=0,location=0, status=0')
		//alert($('#myf').attr('src'))
	}
$(function(){
		
})


 angular.module('myapp', [])
 .controller("myc",function($scope){
	 var ha={level:1};
	 $scope.url={name:ha,age:17}
	 
	 $scope.ngtest=function(){
		 ha.level++
	 }
	 
 })
//$('#myf').find('body').click(getMousePos);
//$('body').click(getMousePos);
</script>
</body>
</html>
