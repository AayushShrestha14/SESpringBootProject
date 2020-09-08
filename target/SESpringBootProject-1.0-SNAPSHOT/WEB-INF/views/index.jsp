<%-- 
    Document   : index
    Created on : Jul 9, 2018, 2:31:15 PM
    Author     : dell
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="${pageContext.request.contextPath}/styles.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h1>Skills(${total})</h1>
        <div>
            <h2>Add Skill</h2>
            <form method="post" action="save">
                <div>
                    <label>Skill Name</label>
                    <input type="text" name="name"/>
                </div>
                <button type="submit">Save</button>
            </form>
        </div>
        <ul>
            <c:forEach var="skill" items="${skills}">
                <li>${skill.name}</li>
            </c:forEach>
        </ul>
    </body>
</html>
