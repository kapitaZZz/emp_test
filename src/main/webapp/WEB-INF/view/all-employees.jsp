<%--
  Created by IntelliJ IDEA.
  User: KapitaZzz
  Date: 31.10.2021
  Time: 0:26
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>All Employees</h2>

<table>
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Department</th>
        <th>Salary</th>
    </tr>
        <c:forEach var="emp" items="${allEmployee}">
    <tr>
        <td>${emp.name}</td>
        <td>${emp.surname}</td>
        <td>${emp.department}</td>
        <td>${emp.salary}</td>
    </tr>
    </c:forEach>

</table>

</body>
</html>