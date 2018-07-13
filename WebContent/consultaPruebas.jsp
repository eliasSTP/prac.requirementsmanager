<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Pruebas</title>
</head>
<body>

<h1>Listado de pruebas</h1>

	<s:iterator value="pruebas">

		<ul>
			<li>ID : <a href="consultaAnexosPrueba.action?id_prueba=<s:property value="id_prueba"/>"><s:property value="id_prueba"/></a></li>
			<li>Descripción : <s:property value="descripcion_prueba"/></li>
			<li>Incidencia : <s:property value="incidencia"/></li>
			<li>Pasos Previos : <s:property value="pasos_previos"/></li>
			<li>Precondición : <s:property value="precondicion"/></li>
			<li>Postcondición : <s:property value="postcondicion"/></li>
			<li>Resultado esperado : <s:property value="resultado_esperado"/></li>
			<li>Resultado real : <s:property value="resultado_real"/></li>
			<li>Tipo : <s:property value="tipo"/></li>
		</ul>
		
	</s:iterator>

</body>
</html>