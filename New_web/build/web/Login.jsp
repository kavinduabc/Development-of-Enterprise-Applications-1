<%-- 
    Document   : Login
    Created on : Jan 25, 2024, 8:00:14 PM
    Author     : Kavindu Piyumal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
         <form action="LoginServlet" method="POST">
            <table border="1">
               
                <tbody>
                    <tr>
                        <td><label>User name:</label></td>
                        <td><input type="text" name="u_name" value="" /></td>
                    </tr>
                    <tr>
                        <td><label>Pass word:</label></td>
                        <td><input type="password" name="pword" value="" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Login" /></td>
                        <td><input type="reset" value="cancel" /></td>
                    </tr>
                </tbody>
            </table>

        </form>
    </body>
</html>
