/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reg;

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
@WebServlet(name = "Reg_Servlet", urlPatterns = {"/Reg_Servlet"})
public class Reg_Servlet extends HttpServlet 
{
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
    //getting the parameter 
    String firstname=request.getParameter("fname");
    String secondname=request.getParameter("sname");
    String password=request.getParameter("pword");
    String Email=request.getParameter("email");
    String Telephon_no=request.getParameter("tno");
    String Address=request.getParameter("ads");
   
    PrintWriter c=response.getWriter();
    c.println("name is"+firstname+""+secondname);
    c.println("pass word is "+password);
    c.println("Email is "+Email);
    c.println("Telephon number "+"Telephon_no");
    c.println("Address is "+Address);
    
    

    }
}
