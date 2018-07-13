<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Usuarios</title>
</head>
<body>

	<h1>Listado de usuarios</h1>
	
	<s:iterator value="usuarios">	
		<s:property value="id_usuario"/>:			
		<s:property value="nombre"/> :
		<s:property value="apellidos"/> :
		<s:property value="nom_usuario"/> :
		<s:property value="id_mail"/><br/>
	</s:iterator>

</body>
</html>