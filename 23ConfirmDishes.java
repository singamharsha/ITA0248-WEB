import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// Servlet mapping for handling the form submission
@WebServlet("/ConfirmDishes")
public class ConfirmDishes extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        // Retrieve selected dishes from the form
        String[] selectedDishes = request.getParameterValues("dish");
        
        out.println("<html><body>");
        out.println("<h2>Confirmed Dishes:</h2>");
        
        if (selectedDishes != null) {
            out.println("<ul>");
            for (String dish : selectedDishes) {
                out.println("<li>" + dish + "</li>");
            }
            out.println("</ul>");
        } else {
            out.println("<p>No dishes selected.</p>");
        }
        
        out.println("</body></html>");
    }
}
