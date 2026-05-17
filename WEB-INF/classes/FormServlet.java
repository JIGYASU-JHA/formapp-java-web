import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class FormServlet extends HttpServlet {

protected void doPost(HttpServletRequest request,
HttpServletResponse response)
throws ServletException, IOException
{

response.setContentType("text/html");
PrintWriter out = response.getWriter();

String name = request.getParameter("name");
String age = request.getParameter("age");
String address = request.getParameter("address");
String gender = request.getParameter("gender");
String date = request.getParameter("date");
String source = request.getParameter("source");
String info = request.getParameter("info");

String married = request.getParameter("married");
String unmarried = request.getParameter("unmarried");

out.println("<html><body>");
out.println("<h2>Form Submitted Successfully</h2>");

out.println("Name: " + name + "<br>");
out.println("Age: " + age + "<br>");
out.println("Address: " + address + "<br>");
out.println("Gender: " + gender + "<br>");
out.println("Date: " + date + "<br>");
out.println("Source: " + source + "<br>");
out.println("Info: " + info + "<br>");

if(married != null)
out.println("Status: Married<br>");

if(unmarried != null)
out.println("Status: Unmarried<br>");

out.println("</body></html>");

}
}