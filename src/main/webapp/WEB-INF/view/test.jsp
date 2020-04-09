<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="vo.UserVO"%>
<%@page import="java.util.List"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" charset="utf-8" content="user-scalable=no, initial-scale=1, maximum-scale=1">
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<title>Test Page</title>
<script>


</script>
<style>


</style>
</head>
<body>

<c:forEach items="${userVO}" var="test">
   AcctCode : ${test.acctCode }
   <br>
   AcctName : ${test.acctName }
   <br>
   <br>
</c:forEach>  

</body>
</html>