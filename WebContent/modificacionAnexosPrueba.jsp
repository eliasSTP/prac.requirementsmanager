<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Anexos Prueba</title>
</head>
<body>
<h1>Requisito: ${requisito.id_requisito} - ${requisito.descripcion_requisito}</h1>
<h1>ANEXOS PRUEBA</h1>


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

<br/>
<s:form  action="altaAnexo">				
	<s:textfield label="Descripción Anexo" name="anexo.descripcion_anexo"/>
	<s:textfield label="Captura Pantalla 1" name="anexo.captura_pantalla1"/>
	<s:textfield label="Captura Pantalla 2" name="anexo.captura_pantalla2"/>
	<s:textfield label="Captura Pantalla 3" name="anexo.captura_pantalla3"/>
	<s:textfield label="Documentación adicional" name="anexo.documentacion_adicional"/>
	<s:hidden name="prueba.id_prueba"/>
	<s:submit/>
</s:form>

<h2>Modificación Anexo</h2>
<s:form>				
	<s:textfield abel="Descripción Anexo" name="anexo.descripcion_anexo" value= "%{anexo.descripcion_anexo}"/>
	<s:textfield label="Captura Pantalla 1" name="anexo.captura_pantalla1" value= "%{anexo.captura_pantalla1}"/>
	<s:textfield label="Captura Pantalla 2" name="anexo.captura_pantalla2" value= "%{anexo.captura_pantalla2}"/>	
	<s:textfield label="Captura Pantalla 3" name="anexo.captura_pantalla3" value= "%{anexo.captura_pantalla3}"/>
	<s:textfield label="Status del Requisito" name="requisito.estado_requisito" value= "%{requisito.estado_requisito}" />
	<s:textfield label="Valoración de las horas" name="requisito.valoracion_horas" value= "%{requisito.valoracion_horas}"/>
	<s:textfield label="Valorador de las horas" name="requisito.valorador_horas" value= "%{requisito.valorador_horas}"/>
	<s:textfield label="Comentarios" name="requisito.comentarios" value= "%{requisito.comentarios}"/>
	<s:hidden name="prueba.id_requisito" value= "%{requisito.id_requisito}"/>
	<s:hidden name="prueba.requisito_id_requisito" value= "%{prueba.requisito_id_requisito}"/>
	<s:submit action= "modificarPrueba" value= "modificar"/>
	<s:submit action= "borrarAnexo" value= "borrar"/>
</s:form>


</body>
</html>