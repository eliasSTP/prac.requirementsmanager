<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>PROYECTO</h1>
<table style="width:100%;">

	<tr>
		<th style="width:5%">ID</th>
		<th style="width:40%">Requisito</th>
		<th style="width:20%">Valorador Horas</th>
		<th style="width:15%">Valoración</th>
		<th style="width:20%">Valorar</th>
	</tr>

	<s:iterator value="requisitos">
	
		<tr>
		<td style="text-align: center;"><a href="modificacion1.action?pedido.id_requisito=<s:property value="id_requisito"/>"><s:property value="id_requisito"/></a></td>
		<td style="text-align: center;"><s:property value="descripcion_requisito"/></td>
		<td style="text-align: center;"><s:property value="valorador_horas"/></td>
		<td style="text-align: center;"><s:property value="valoracion_horas"/></td>
		</tr>
		
	</s:iterator>
</table>

</body>
</html>