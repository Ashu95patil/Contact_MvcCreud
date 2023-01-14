<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>www.ContactInfo.com</title>

<script>
function confirmDelete()
{
	return confirm("Are you sure you want to delete?");
	}	

</script>
</head>
<body style="background-color:khaki;">

<h1> !!... View All Contact ...!!</h1>

<table>
<tr>
<th>Contact Name</th>




<th>Contact Email</th>




<th>Contact Number</th>
</tr>

<tbody>

<c:forEach items="${contact}"    var="cot">



<tr>
<td> ${cot.contactname}</td>
<td> ${cot.contactemail}</td>
<td> ${cot.contactnumber}</td>
<td> <a href="edit?contactid=${cot.contactid}">Edit</a>
     <a href="delete?contactid=${cot.contactid}" onclick="return confirmDelete()">Delete</a>
</td>


</tr>

</c:forEach>

</tbody>

</table>

<a  href = "Contact">Sign Up Again</a>

</body>
</html>