<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>STP-R.M.</title>
</head>
<body>
	<s:form method="post" action="altaCliente">
		<s:textfield label="Introduce el nombre del cliente" name="cliente.nombre_cliente"/><br/>
		<s:submit label="Alta" />
	</s:form>

</body>
</html>