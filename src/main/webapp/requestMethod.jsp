<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"	isELIgnored="false"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<html>
<body>
	<h2>
		<form	action="${pageContext.request.contextPath }/chens/login.do"	method="get">
			<input	type="submit"	value="get访问"/>
		</form>
		-------------------------------------------
		<form	action="${pageContext.request.contextPath }/chens/regist.do"	method="post">
			<input	type="submit"	value="post访问"/>
		</form>
		
		-------------------------------------------
		<form	action="${pageContext.request.contextPath }/param/param1.do"	method="post">
			<input	name="userName"	type="text"	placeholder="请输入参数..."/>
			<input	type="submit"	value="post访问"/>
		</form>
		
		-------------------------------------------
		<form	action="${pageContext.request.contextPath }/paramadv/param3.do"	method="post">
			<font	color="yellow">对象传参</font><br>
			userName:<input	name="userName"	type="text"	placeholder="请输入参数..."/><br>
			passWord:<input	name="passWord"	type="text"	placeholder="请输入参数..."/><br>
			addr.street:<input	name="addr.street"	type="text"	placeholder="请输入参数..."/><br>
			addr.city:<input	name="addr.city"	type="text"	placeholder="请输入参数..."/><br>
			<input	type="submit"	value="post访问"/>
		</form>
		
		-------------------------------------------
		<form	action="${pageContext.request.contextPath }/paramadv/param4.do"	method="post">
			<font	color="yellow">数组传参</font><br>
			你喜欢的语言:
			java<input	name="ids"	type="checkbox"	value="1"/><br>
			c++<input	name="ids"	type="checkbox"	value="2"/><br>
			php<input	name="ids"	type="checkbox"	value="3"/><br>
			noSql<input	name="ids"	type="checkbox"	value="4"/><br>
			<input	type="submit"	value="post访问"/>
		</form>
		
		-------------------------------------------
		<form	action="${pageContext.request.contextPath }/paramadv/param5.do"	method="post">
			<font	color="yellow">集合传参</font><br>
			userName:<input	name="userList[0].userName"	type="text"	placeholder="请输入参数..."/><br>
			passWord:<input	name="userList[0].passWord"	type="text"	placeholder="请输入参数..."/><br>
			addr.street:<input	name="userList[0].addr.street"	type="text"	placeholder="请输入参数..."/><br>
			addr.city:<input	name="userList[0].addr.city"	type="text"	placeholder="请输入参数..."/><br><br>
			
			userName:<input	name="userList[1].userName"	type="text"	placeholder="请输入参数..."/><br>
			passWord:<input	name="userList[1].passWord"	type="text"	placeholder="请输入参数..."/><br>
			addr.street:<input	name="userList[1].addr.street"	type="text"	placeholder="请输入参数..."/><br>
			addr.city:<input	name="userList[1].addr.city"	type="text"	placeholder="请输入参数..."/><br><br>
			
			userName:<input	name="userList[2].userName"	type="text"	placeholder="请输入参数..."/><br>
			passWord:<input	name="userList[2].passWord"	type="text"	placeholder="请输入参数..."/><br>
			addr.street:<input	name="userList[2].addr.street"	type="text"	placeholder="请输入参数..."/><br>
			addr.city:<input	name="userList[2].addr.city"	type="text"	placeholder="请输入参数..."/><br><br>
			
			<input	type="submit"	value="post访问"/>
		</form>
		
		-------------------------------------------
		<form	action="${pageContext.request.contextPath }/paramadv/param6.do"	method="post">
			<font	color="yellow">对象传参</font><br>
			userName:<input	name="userName"	type="text"	placeholder="请输入参数..."/><br>
			passWord:<input	name="passWord"	type="text"	placeholder="请输入参数..."/><br>
			birthday:<input	name="birthday"	type="text"	placeholder="请输入参数..."/><br>
			addr.street:<input	name="addr.street"	type="text"	placeholder="请输入参数..."/><br>
			addr.city:<input	name="addr.city"	type="text"	placeholder="请输入参数..."/><br>
			<input	type="submit"	value="post访问"/>
		</form>
		
	</h2>
</body>
</html>
