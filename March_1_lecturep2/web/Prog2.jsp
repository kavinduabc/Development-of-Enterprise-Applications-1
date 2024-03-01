<%-- 
    Document   : Prog2
    Created on : Mar 1, 2024, 10:03:43 AM
    Author     : Kavindu Piyumal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%! String name="Kavindu"; %>
        <%
            for(int i=1;i<=6;i++)
            {
                
             out.println("<h"+i+">"+name+"</h"+i+">");%>
                 <br><%
                     
                
            }
            
        %>
       
    </body>
</html>
