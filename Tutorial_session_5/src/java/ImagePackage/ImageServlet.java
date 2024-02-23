
package ImagePackage;

import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import static java.io.FileDescriptor.out;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Kavindu Piyumal
 */
@WebServlet(name = "ImageServlet", urlPatterns = {"/ImageServlet"})
public class ImageServlet extends HttpServlet 
{
     @Override
     protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
     {
         String Im_path=request.getParameter("image");
         response.setContentType("image/jpeg");
         ServletOutputStream out;
         out=response.getOutputStream();
        FileInputStream fin=new FileInputStream(Im_path);
        BufferedInputStream bin=new BufferedInputStream(fin);
        BufferedOutputStream bout=new BufferedOutputStream(out);
        int cc=0;
        while((cc=bin.read())!=-1)
        {
            bout.write(cc);
        }
        bin.close();
        fin.close();
        bout.close();
        out.close();
         
         
     }

   
    

}
