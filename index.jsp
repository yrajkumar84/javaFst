<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="asset">
		<fieldset><legend>Project Details</legend>
			<table>
				<tr>
					<td>Employee name:</td>
					<td><input type="text" name="ename" value='<%=request.getAttribute("empname")%>' placeholder="emp name"></td>
				</tr>
				<tr>
					<td>Employee Sal:</td>
					<td><input type="text" name="sal" value='<%=request.getAttribute("salary")%>'></td>
				</tr>
				<tr>
					<td>Job:</td>
					<td><input type="text" name="job" value='<%=request.getAttribute("job1")%>'></td>
				</tr>
			</table>
		</fieldset>
		<fieldset>
		<table>
			<tr>
				<td><input type="reset" name="clear"></td>
				<td><input type="submit" value="Submit form"></td>
			</tr>	
		</table>
	</fieldset>
	
</form>

</body>
</html>