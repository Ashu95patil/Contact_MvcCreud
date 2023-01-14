<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>www.ContactInfo.com</title>
</head>
<body style="background-color:khaki;">
<h1 align="center"style="color:red;">....!!!.. ContactInfo form ..!!!....</h1>
<h2 align="center" style="color:blue;"> !!..... Welcome to ContactInfo .....!! 

</h2>



<h2> Save Contact Here</h2>

<font color='green'> ${success} </font>
<font color='red'>  ${fail}</font>


<form:form action="saveContact? contactid=${contact.contactid}"  modelAttribute="contact" method="POST">


<table>
<tr>
<td>Contact Name</td>
<td><form:input path="contactname"/></td>
</tr>

<tr>
<td>Contact Email</td>
<td><form:input path="contactemail"/></td>
</tr>

<tr>
<td>Contact Number</td>
<td><form:input path="contactnumber"/></td>
</tr>

<tr>
<td><input type="submit"  value="Save"/></td>
</tr>



</table>

<a  href = "ViewContact">View All Contacts</a>
</form:form>
</body>
</html>