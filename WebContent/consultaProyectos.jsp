<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Proyectos</title>
</head>
<body>

<h1>Listado de proyectos</h1>
<table border="1px" style="width:100%">

	<tr>
		<th style="width:10%">ID</th>
		<th style="width:50%">Descripción</th>
		<th style="width:20%">Fecha inicio</th>
		<th style="width:20%">Status</th>
	</tr>
	
	<s:iterator value="proyectos">

	<tr>
		<td style="text-align: center;"><a href="consultaPrAc.action?id_proyecto=<s:property value="id_proyecto"/>"><s:property value="id_proyecto"/></a></td>
		<td style="text-align: center;"><s:property value="descripcion"/></td>
		<td style="text-align: center;"><s:property value="fecha"/></td>
		<td style="text-align: center;"><s:property value="status"/></td>
	</tr>
	
	</s:iterator>

</table>


</body>
</html>