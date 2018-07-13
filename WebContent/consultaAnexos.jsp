<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Anexos de la Prueba ${Prueba.descripcion_prueba}</title>

</head>
<body>

	<h1>Listado de anexos</h1>
	
	<s:iterator value="anexos">	
		<s:property value="id_anexo"/>:			
		<s:property value="captura_pantalla1"/> 
		<s:property value="captura_pantalla2"/> :
		<s:property value="captura_pantalla3"/> :
		<s:property value="descripcion_anexo"/> :
		<s:property value="documentacion_adicional"/> :
		<s:property value="id_mail"/><br/>
	</s:iterator>

</body>
</html>