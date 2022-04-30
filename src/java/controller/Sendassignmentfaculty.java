package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.SendAssignmentFaculty;

/**
 *
 * @author Dhawal
 */
public class Sendassignmentfaculty extends HttpServlet 
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.sendRedirect("sendassignmentfaculty.jsp");
    }
     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String username = request.getParameter("username");
        String text = request.getParameter("text");
        
        SendAssignmentFaculty lt = new SendAssignmentFaculty();
        boolean insert = lt.sendAssignmentFaculty(username, text);
        
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
