<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: KapitaZzz
  Date: 31.10.2021
  Time: 2:11
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<html>
<head>
    <title>Employee info</title>
</head>
<body>

<h2>Employee information</h2>

<form:form action="saveEmployee" modelAttribute="employee">
    Name <form:input path="name"/>
    <br>
    Surname <form:input path="surname"/>
    <br>
    Department <form:input path="department"/>
    <br>
    Salary <form:input path="salary"/>
    <br>
    <input type="submit" value="ACCEPT">

</form:form>

</body>
</html>
