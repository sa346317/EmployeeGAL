<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style>
form {
    border: 3px solid #f1f1f1;
}

input[type=text], input[type=password] {
    width: 50%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
}

button {
    background-color:blue ;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 20%;
}

button:hover {
    opacity: 0.8;
}

.container {
    padding: 16px;
}

span.psw {
    float: right;
    padding-top: 16px;
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
    span.psw {
       display: block;
       float: none;
    }
}
</style>
</head>
<body>
	<h1>Employee GAL</h1>
	<form action="Login" method="post">
	  <div class="container" >
	  <tr>	    
	   <td><label><b>Username:</b></label></td> 
	   <td><input type="text" placeholder="Enter userId" name="userid" required></td>
	  </tr>
	  <br/>
	  <tr>	   
	    <td><label><b>Password:</b></label></td>
	    <td><input type="password" placeholder="Enter Password" name="password" required></td>
	  </tr>
	  <br/> 
	    <button type="submit">Login</button>
	  </div>
	
	  <div class="container" style="background-color:#f1f1f1">
	    <span class="psw"><input type="reset" value="Reset"></input></span>
	  </div>
</form>
</body>
</html>