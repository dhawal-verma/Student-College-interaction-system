/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ComplainHOD;
import model.SendAssignmentFaculty;

/**
 *
 * @author Dhawal
 */
public class Complainhod extends HttpServlet 
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.sendRedirect("complainhod.jsp");
    }
     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String username = request.getParameter("username");
        String text = request.getParameter("text");
        
        ComplainHOD lt = new ComplainHOD();
        boolean insert = lt.sendComplain(username, text);
        
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
