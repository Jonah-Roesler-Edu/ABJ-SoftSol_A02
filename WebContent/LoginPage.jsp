<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
	</head>
	<body>
		<h2>Login</h2>
		
		<form action="/action_page.php" target="_self" method="post"> <!-- action is where the data goes too -->
			<fieldset>
				<legend>Login:</legend>
  				Email:<br>
  				<input type="text" name="email" value="">
  				<br>
  				Password:<br>
  				<input type="text" name="password" value="">
  				<br><br>
  				<input type="submit" value="Login(dont click button it goes nowhere)">
  			</fieldset>
		</form> 
		
		<br><br>
		<a href="RegisterPage.jsp"><button type="button">Register</button> </a>
		<br><br>
		<a href="ProfilePage.jsp"><button type="button">To Profile Page</button> </a>
	</body>
</html>
