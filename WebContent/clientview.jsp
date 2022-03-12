<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="Metier.Client" %>
<%@page import="java.util.List" %>
<%@page import="Web.ClientModele" %>
<%
ClientModele mod;
if(request.getAttribute("modele")!=null){
	mod=(ClientModele)request.getAttribute("modele");
}
else{
	mod=new ClientModele();
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>rechercher par mot clé</title>
</head>
<body>
<form action="ControleurServlet" method="post">
Mot clé: <input type="text" name="MotCle" value="<%= mod.getMotCle() %>"/><br><br>
<input type="submit" value="chercher"/>
</form><br><br>
<table border="1" width="80%">
<tr>
<th>ID</th><th>NOM</th><th>Email</th><th>VILLE</th>
</tr>
<%
List<Client> clts=mod.getClients();
for(Client c:clts){
%>
<tr> 
<td><%= c.getId_cli() %></td>
<td><%= c.getNom() %></td>
<td><%= c.getEmail() %></td>
<td><%= c.getVille() %></td>
</tr>
<%} %>
</table>
</body>
</html>