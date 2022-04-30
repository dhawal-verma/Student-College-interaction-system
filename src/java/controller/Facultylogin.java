package controller;

import dto.DTO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.FacultyAuthenticator;

/**
 *
 * @author Dhawal
 */
public class Facultylogin extends HttpServlet 
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.sendRedirect("facultylogin.html");
    }
     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        DTO dt = new DTO();
        dt.setUsername(username);
        dt.setPassword(password);
        
        FacultyAuthenticator lg = new FacultyAuthenticator();
        
        boolean in = lg.isLogin(dt);
        
        if(in)
        {
            response.sendRedirect("facultypanel.jsp");
        }
        else
        {
            response.sendRedirect("facultylogin.html");
        }
    }
}