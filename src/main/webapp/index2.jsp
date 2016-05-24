<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html ng-app="myapp">
<head>

    <title>My JSP 'index.jsp' starting page</title>
    <script type="text/javascript" src="test/js/jquery-2.2.2.min.js"></script>
    <!-- <script src="test/js/angular.min.js"></script> -->
</head>

<body ng-controller="myc">

<button onclick="test()">asdasdas</button>
<button onclick="test2()">check</button>
</body>

<script type="text/javascript">
	var temp;
function test(){
	 temp=window.open("http://www.w3school.com.cn","_blank","toolbar=yes, location=yes, directories=no, status=no, menubar=yes, scrollbars=yes, resizable=no, copyhistory=yes, width=400, height=400")
	//myWindow.document.write("This is 'myWindow'")
}
function test2(){
	alert(temp.innerwidth)
	//myWindow.document.write("This is 'myWindow'")
}

</script>
</html>
