/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import dto.DTO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.StudentAuthenticator;

/**
 *
 * @author Dhawal
 */
public class Studentlogin extends HttpServlet 
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.sendRedirect("studentlogin.jsp");
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        DTO dt = new DTO();
        
        dt.setUsername(username);
        dt.setPassword(password);
        
        StudentAuthenticator st = new StudentAuthenticator();
        
        boolean check = st.isLogin(dt);
        
        if(check)
        {
            response.sendRedirect("studentpanel.jsp");
        }
        else
        {
            response.sendRedirect("studentlogin.html");
        }
        
    }   
}
