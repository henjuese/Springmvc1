<%@ page language="java" session="false" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form name="personformbao" action="/myspringmvc1/personForm2.htm" method="post">
		<table> 
		   <tr> 
		   <td>Name</td> 
		    <td><input type="text" name="name" id="name" /></td> 
		 </tr> 
		   <tr> 
		   <td>Age</td> 
		    <td><input type="text" name="age" id="age" /></td> 
		</tr> 
		  <tr> 
		     <td>Address</td> 
		    <td><input type="text" name="address" /></td> 
		  </tr> 
		  <tr> 
		     <td></td> 
		       <td> 
		           <input type="submit" id="save" name="_eventId_save" value="Save" /> 
		           <input type="submit" onClick="history.go(-1);" name="_eventId_cancel" value="Cancel" /> 
		        </td> 
		   </tr> 
		</table> 
	</form>
	
</body>
</html>












