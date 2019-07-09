<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>AUTHENTIFICATION</title>
</head>
<body>
	<h1>AUTHENTIFICATION</h1>

	<!-- On intègre un formulaire à la page HTML -->
	<form id="test" action="Connection" method="post">
		<div class="login">
			<p for="nom">Login :</p>
			<input type="text" id="Login" name="loginuser" required>

			<p for="prenom">Password :</p>
			<input type="password" id="Password" name="mdpuser" required /> 
			<p></p>
			<input type="checkbox" class="form-check-input" id="exampleCheck1"/>
    <label class="form-check-label" for="exampleCheck1">Se souvenir de moi </label>
    <p></p>
			<input type="submit" value="Se connecter">
		</div>
	</form>
</body>
</html>
