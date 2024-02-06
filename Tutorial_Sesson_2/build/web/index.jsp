<%-- 
    Document   : index
    Created on : Feb 2, 2024, 3:05:04 PM
    Author     : Kavindu Piyumal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body align="center">
        <h1>Login Us!!!</h1>
        <form action="LoginServelt" method="POST">
            <table border="1" align="center">
                
                <tbody>
                    <tr>
                        <td>User Name:</td>
                        <td><input type="text" name="u_name" value="" /></td>
                    </tr>
                    <tr>
                        <td>Password:</td>
                        <td><input type="password" name="p_word" value="" /></td>
                    </tr>
                    <tr>
                        <td colspan="2"><input type="submit" value="LOGIN" /></td>
                        
                    </tr>
                </tbody>
            </table>

        </form>
    </body>
</html>
