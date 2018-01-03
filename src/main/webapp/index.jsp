<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"	isELIgnored="false"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<html>
<body>
<h2>Hello World!    chens</h2>
<h4>model作用域:${name }</h4>
<h5>request作用域:${requestScope.name },${requestScope.age }</h5>
<h5>session作用域:${sessionScope.name },${sessionScope.age }</h5>
</body>
</html>
