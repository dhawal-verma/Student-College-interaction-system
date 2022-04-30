

package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.SendAssignmentFaculty;
import model.SendAssignmentStudent;

/**
 *
 * @author Dhawal
 */
public class Sendassignmentstudent extends HttpServlet 
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.sendRedirect("sendassignmentstudent.jsp");
    }
     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String username = request.getParameter("username");
        String text = request.getParameter("text");
        
        SendAssignmentStudent lt = new SendAssignmentStudent();
        boolean insert = lt.sendAssignmentStudent(username, text);
        
        if(insert)
        {
            response.sendRedirect("index.jsp");
        }
        else
        {
            response.sendRedirect("adminlogin.html");
        }
    }   
}
