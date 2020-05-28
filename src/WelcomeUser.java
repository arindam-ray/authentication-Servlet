import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class WelcomeUser extends HttpServlet {

   public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

      response.setContentType("text/html");
      PrintWriter pwriter = response.getWriter();

      String name = request.getParameter("uname");
      pwriter.print("<html><head><title>Authentication</title>");
      pwriter.print("<link rel='icon' href='images/logo.png'>");
      pwriter.print("<link rel='stylesheet' href='style.css'>");
      pwriter.print("<h1>Hello " + name + "!</h1>");
      pwriter.print("<h2> Welcome to Bigeeks.in</h2>");
   }

}