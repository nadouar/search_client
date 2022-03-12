<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri= "http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>rechercher par mot clé</title>
</head>
<body>
<form action="ControleurServlet" action="post">
Mot clé: <input type="text" name="motCle" value="${modele.motCle}"/><br><br>
<input type="submit" value="chercher"/>
</form><br><br>
<table border="1" width="80%">
<tr>
<th>ID</th><th>NOM</th><th>Email</th><th>VILLE</th>
</tr>
<c:forEach items="${modele.clients }" var="c">
   <tr>
   <td>${c.id_cli}</td>
   <td>${c.nom}</td>
   <td>${c.email}</td>
   <td>${c.ville}</td>
   </tr>
</c:forEach>
</table>
</body>
</html>