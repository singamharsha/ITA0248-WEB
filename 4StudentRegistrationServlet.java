import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StudentRegistrationServlet")
public class StudentRegistrationServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // HTML Form for Student Registration
        out.println("<html><body>");
        out.println("<h2>Student Registration Form</h2>");
        out.println("<form method='post' action='StudentRegistrationServlet'>");
        out.println("Name: <input type='text' name='name' required><br><br>");
        out.println("Age: <input type='number' name='age' required><br><br>");
        out.println("Course: <input type='text' name='course' required><br><br>");
        out.println("Email: <input type='email' name='email' required><br><br>");
        out.println("<input type='submit' value='Register'>");
        out.println("</form>");
        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Retrieving Student Registration Details
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String course = request.getParameter("course");
        String email = request.getParameter("email");

        // Displaying the Registration Details
        out.println("<html><body>");
        out.println("<h2>Registration Details</h2>");
        out.println("<p><strong>Name:</strong> " + name + "</p>");
        out.println("<p><strong>Age:</strong> " + age + "</p>");
        out.println("<p><strong>Course:</strong> " + course + "</p>");
        out.println("<p><strong>Email:</strong> " + email + "</p>");
        out.println("<br><a href='StudentRegistrationServlet'>Back to Registration Form</a>");
        out.println("</body></html>");
    }
}
