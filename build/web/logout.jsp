<%-- 
    Document   : logout.jsp
    Created on : Jul 5, 2014, 4:17:34 AM
    Author     : kg/let_me_start/jaswantsinghyadav007@gmail.com
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
        session = request.getSession();
        session.invalidate();
        response.sendRedirect("index.jsp");
%>
