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
import model.DeleteAdmin;
import model.DeleteHod;

/**
 *
 * @author Dhawal
 */
public class Deletehod extends HttpServlet 
{
     @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.sendRedirect("adminpanel.jsp");
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        
        
        String enrollment = request.getParameter("enrollment");
        
        DeleteHod dt = new DeleteHod();
        boolean delete = dt.isDelete(enrollment);
        System.out.println(delete);
        
        if(delete)
        {
            response.sendRedirect("index.jsp");
        }
        else
        {
            response.sendRedirect("adminpanel.jsp");
        }
    }
}
