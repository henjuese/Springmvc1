<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	 <table border="1">
	 	<tr>
	 		<th>id</th>
	 		<th>名字</th>
	 		<th>年纪</th>
	 		<th>地址</th>
	 	</tr>
	 	<c:forEach items="${personlist }" var="m">
	 	  <tr>
	 	    <td>
	 	       <c:url var="editUrl" value="personForm.htm"> 
		               <c:param name="personId" value="${m.id }" /> 
		       </c:url> 
      		<a href='<c:out value="${editUrl}"/>'>${m.id}</a> 
	 	    </td>
	 	    <td>${m.name }</td>
	 	    <td>${m.age }</td>
	 	    <td>${m.address}</td>
	 	  </tr>
	 	</c:forEach>
	 </table>
	
</body>
</html>












