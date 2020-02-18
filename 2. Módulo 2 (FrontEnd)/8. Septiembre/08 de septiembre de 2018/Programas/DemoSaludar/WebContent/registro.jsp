<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="ServletRegistro.do" method="post">
		<label>Nombre</label>
		<input type="text" name="txtNombre">
		<label>Apellido</label>
		<input type="text" name="txtApellido">
		<label>Email</label>
		<input type="text" name="txtEmail">
		<label>Direccion</label>
		<input type="text" name="txtDireccion">
		<label>Telefono</label>
		<input type="text" name="txtTelefono">
		<label>Login</label>
		<input type="text" name="txtLogin">
		<label>Password</label>
		<input type="text" name="txtPassword">
		<label>Re password</label>
		<input type="text" name="txtRepassword">
		<input type="submit" value="Registrar">
	</form>
</body>
</html>