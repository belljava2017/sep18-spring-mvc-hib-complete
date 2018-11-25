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

    <table class="table table-hover table-bordered table-responsive">
        <thead>
        <tr>
            <th>id</th>
            <th>Name</th>
            <th>Rank</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="team" items="${list}">
            <tr>
                <td>${team.id}</td>
                <td>${team.name}</td>
                <td>${team.ranking}</td>
               <td>
                    <a href ="/team/edit/${team.id}">Edit</a><br/>
                    <a href="/team/delete/${team.id}">Delete</a><br/>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>


    <div>
        <%-- <a href="${pageContext.request.contextPath}/team/list.html">Team List</a>--%>
        <a href="/team/add.html">Add Team</a>
    </div>
</body>
</html>
