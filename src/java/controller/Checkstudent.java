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
import javax.servlet.http.HttpSession;
import model.DeleteAdmin;

/**
 *
 * @author Dhawal
 */
public class Checkstudent extends HttpServlet 
{
     @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.sendRedirect("checkstudent.jsp");
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        
        
        String enrollment = request.getParameter("enrollment");
        
        DTO dt =new DTO();
        dt.setEnrollment(enrollment);
        
        HttpSession session = request.getSession(true);
        session.setAttribute("enrollment", enrollment);
        response.sendRedirect("studentrecord.jsp");
        
    }
}
