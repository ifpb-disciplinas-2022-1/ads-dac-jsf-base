<%-- 
    Document   : listar
    Created on : 25/04/2022, 19:41:21
    Author     : Ricardo Job
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Listagem de Editoras </title>
</head>
<body>
    <div align="center">
        <form method="POST" action="editoras.criar.do">
            <label>Local de Origem: 
                <input type="text" id="localDeOrigem" name="localDeOrigem"/> 
            </label>
            <label>Nome Fantasia:
                <input type="text" id="nomeFantasia" name="nomeFantasia"/>
            </label>
            <input type="submit" value="+" />
        </form>
        
        <br/>
        <a href="editoras.do">listagem de editoras</a>
    </div>
</body>
</html>