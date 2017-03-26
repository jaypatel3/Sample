<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<script>
function myFunction1() {
    
}
</script>
<body>




<form method="post" action="/MvcExample/addemailaddress">

	<table  cellpadding="0" cellspacing="0" width="50%"">
		
		<tr>
			<td bgcolor="#FAFAF9" style="padding-left: 10px;">First name</td>
			<td><input type="text" name="uname" maxlength="30" value="" /></td>
		</tr>
		
		<tr>
			<td bgcolor="#FAFAF9" style="padding-left: 10px;">Password</td>
			<td><input type="password" name="pwd" maxlegth="30" value="" /></td>
		</tr>
		
		<tr>
			<td bgcolor="#FAFAF9" style="padding-left: 10px;">Email ID</td>
			<td><input type="text" name="email" maxlegth="30" value="" /></td>
		</tr>
		
				<tr>
			<td bgcolor="#FAFAF9" style="padding-left: 10px;">Contact No</td>
			<td><input type="text" name="coNo" maxlegth="30" value="" /></td>
		</tr>
		
		
		

		<tr>
			<td colspan="2" align="center">
			<br>
			<table  width="50%">
				<tr>
					<td><input type="submit" name="save" value="Register"/></td>
					
				</tr>
			</table>
			</td>
		</tr>
	</table>
</form>

</body>
</html>