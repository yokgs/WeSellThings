<%-- 
    Document   : isLoggedIn
    Created on : Dec 3, 2022, 10:38:29 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    middleware.SessionUtil.isLoggedIn(request, response);
%>
