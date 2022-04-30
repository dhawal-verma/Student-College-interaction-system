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
import model.SendNoticeFaculty;
import model.SendNoticeStudent;

/**
 *
 * @author Dhawal
 */
public class Sendnoticestudent extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.sendRedirect("sendnoticestudent.jsp");
    }
     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String text = request.getParameter("text");
        String username =request.getParameter("username");
        
        SendNoticeStudent sd = new SendNoticeStudent();
        boolean i = sd.sendNoticeStudent(text, username);
        if(i)
        {
            response.sendRedirect("index.jsp");
        }
        else
        {
            response.sendRedirect("adminlogin.html");
        }
    }   
}
