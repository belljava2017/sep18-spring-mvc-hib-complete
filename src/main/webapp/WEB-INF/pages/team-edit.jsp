<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!DOCTYPE html>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<head>
    <title>Login Page</title>
</head>
<body>

<div class="container">
    <h2>Simple Spring MVC flow</h2>
    <f:form class="form-inline" action="/team/edit/${team.id}.html" method="post" modelAttribute="team">
        <div class="form-group">
            <label for="name">Name:</label>
            <f:input path="name" id="name"/><br>
        </div>
        <div class="form-group">
            <label for="ranking">Ranking:</label>
            <f:input path="ranking" id="ranking"/><br>
        </div>
        <button type="submit" class="btn btn-default">Submit</button>
    </f:form>
</div>
<div>
   <%-- <a href="${pageContext.request.contextPath}/team/list.html">Team List</a>--%>
    <a href="/team/list.html">Team List</a>
</div>

</body>
</html>
