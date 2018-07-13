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

<s:form  action="altaAnexos">
	<s:textfield label="Introduzca el primer documento" name="anexo.captura_pantalla1"/>
	<s:textfield label="Introduzca el segundo documento" name="anexo.captura_pantalla2"/>
	<s:textfield label="Introduzca el tercer documento" name="anexo.captura_pantalla3"/>
	<s:textfield label="Introduzca la descripción del anexo" name="anexo.descripcion_anexo"/>
	<s:textfield label="Introduzca la documentación adicional" name="anexo.documentacion_adicional"/>
	<s:select label="Tipo: " list="#{'UAT':'UAT', 'SIT':'SIT'}" name="anexo.tipo"/>
	<s:hidden name="proyecto.id_proyecto"/>
	<s:submit/>
</s:form>

</body>
</html>