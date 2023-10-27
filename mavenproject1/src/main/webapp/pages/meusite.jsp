<%-- 
    Document   : meusite
    Created on : 26 de out de 2023, 17:12:34
    Author     : michel.costa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/estilo.css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String nome = "Michel";
            String cpf = "988.099.341-93";
            int numero=0;
            for(int i=0; i<100; i++){
                numero =i;
                Tread.sleep(200);
            }
            
        %>
        <h1><%=numero%></h1>
        <h1><%=cpf%></h1>
        <h1><%=nome%></h1>
        <h1><%=cpf%></h1>
        <h1><%=nome%></h1>
        <h1><%=cpf%></h1>
        <h1><%=nome%></h1>
        <h1><%=cpf%></h1>
    </body>
</html>
