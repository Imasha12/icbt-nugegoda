<%-- 
    Document   : index
    Created on : Jan 27, 2021, 1:56:48 AM
    Author     : Imasha
--%>


<%@page import="jkbranch.JKBranchService"%>
<%@page import="jkbranch.JKBranchService_Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
        <% 
            JKBranchService_Service jbranchservice = new JKBranchService_Service();
            JKBranchService proxy = jbranchservice.getJKBranchServicePort();
            
            String output = proxy.hello("John");
            out.println(output);
        %>
        </h1>
    </body>
</html>
