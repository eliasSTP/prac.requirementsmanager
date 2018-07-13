<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Alta Usuarios</h1>

<s:form  action="altaUsuario">				
	<s:textfield label="Introduzca su nombre" name="usuario.nombre"/>
	<s:textfield label="Introduzca sus apellidos" name="usuario.apellidos"/>
	<s:textfield label="Introduzca el nombre de usuario" name="usuario.nom_usuario"/>
	<s:textfield label="Introduzca el password" name="usuario.password"/>
	<s:textfield label="Introduzca el mail" name="usuario.id_mail"/>
	<!--TODO: Fer un desplegable per mostrar i seleccionar el perfil -->
	<s:hidden name="proyecto.id_proyecto"/>
	<s:submit/>
</s:form>

</body>
</html>