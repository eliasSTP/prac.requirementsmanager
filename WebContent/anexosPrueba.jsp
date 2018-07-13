<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Anexos</title>
</head>
<body>
<h1>Proyecto: ${proyecto.id_proyecto} - ${proyecto.descripcion}</h1>
<h1>Anexos de la prueba</h1>
<h2>${prueba.descripcion_prueba}</h2>
	<table border="1px" style="width:100%" >
	
		<tr>
			<th style="width:5%">ID</th>
			<th style="width:15%">Imagen1</th>
			<th style="width:15%">Imagen2</th>
			<th style="width:15%">Imagen3</th>
			<th style="width:25%">Descripción</th>
			<th style="width:25%">Documentación adicional</th>
		</tr>
		
		<s:iterator value="anexos">
		<tr>
			<td style="text-align: center;"><s:property value="anexo.id_anexo"/></td>
			<td style="text-align: center;"><s:property value="anexo.captura_pantalla1"/></td>
			<td style="text-align: center;"><s:property value="anexo.captura_pantalla2"/></td>
			<td style="text-align: center;"><s:property value="anexo.captura_pantalla3"/></td>
			<td style="text-align: center;"><s:property value="anexo.descripcion_anexo"/></td>
			<td style="text-align: center;"><s:property value="anexo.documentacion_adicional"/></td>
		</tr>
		
		</s:iterator>
	
	</table>

</body>
</html>