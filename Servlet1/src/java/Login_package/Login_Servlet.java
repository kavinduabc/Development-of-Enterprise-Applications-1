
package Login_package;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kavindu Piyumal
 */
@WebServlet(name = "Login_Servlet", urlPatterns = {"/Login_Servlet"})
public class Login_Servlet extends HttpServlet 
{
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        String Username=request.getParameter("uname");
        String password=request.getParameter("pword");
        
        if(Username.equals("Kavindu@123")&&password.equals("@1234"))
        {
           response.sendRedirect("LoginWrite.jsp");
        }
        else
        {
            response.sendRedirect("LoginFail.jsp");
        }
    }

   
}
