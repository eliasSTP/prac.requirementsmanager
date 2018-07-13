<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Modifica Prueba</title>
</head>
<body>
<h1>Modificació prueba</h1>
<%-- <h1>Proyecto: ${proyecto.id_proyecto} - ${proyecto.descripcion_proyecto}</h1>
<h2>Reqisito: ${requisito.id_requisito} - ${requisito.descrpcion_requisito}</h2> --%>
<h1>Modificació prueba</h1>
<h2>${prueba.descripcion_prueba}</h2>

	<s:form>				
		<s:textfield label="Descripción Prueba" name="prueba.descripcion_prueba" value="%{prueba.descripcion_prueba}"/>
		<s:hidden name="prueba.id_prueba" value="%{prueba.id_prueba}"/>
		<s:submit action="modificarPrueba" value="modificar"/>
		<s:submit action="borrarPrueba" value="borrar"/>
	</s:form>


</body>
</html>