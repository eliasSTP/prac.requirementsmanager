<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>  			<!-- If Struts2 tags required -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <!-- If JSTL required  -->

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>STP</title>
</head>
<body>
	<div>
		<h1>GESTIÓN DE CLIENTES</h1>		
		<a href="altaClientes.jsp">Alta del cliente</a> <br/>
		<a href="altaUsuarios.jsp">Alta Usuarios</a><br/>
		<a href="altaProyecto.jsp">Alta Proyectos</a><br/>
		<!-- <a href="altaRequisitos.jsp">Alta Requisitos</a><br/> -->
		<a href="altaPruebas.jsp">Alta Pruebas</a><br/>
		<a href="altaAnexos.jsp">Alta Anexos</a><br/>
		<a href="consultaClientes.action">Listado de clientes</a> <br/>
		<a href="consultaPerfiles.action">Listado de perfiles</a> <br/>
		<a href="consultaUsuarios.action">Listado de usuarios</a> <br/>
		<a href="consultaProyectos.action">Listado de proyectos</a> <br/>
		<a href="consultaProyectosUsuario.action">Listado de proyectos del usuario</a> <br/>
		<a href="consultaPruebas.action">Listado de pruebas</a> <br/> 
		<a href="consultaAnexosPrueba.action">Listado de anexos de una prueba</a> <br/>
	</div>

</body>
</html>