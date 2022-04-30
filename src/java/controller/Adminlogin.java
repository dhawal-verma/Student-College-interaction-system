/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import dto.DTO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Adminauthenticator;

/**
 *
 * @author Dhawal
 */
public class Adminlogin extends HttpServlet 
{

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.sendRedirect("adminlogin.html");
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        DTO dt = new DTO();
        
        dt.setUsername(username);
        dt.setPassword(password);
        
        System.out.println(username);
        
        Adminauthenticator lg = new Adminauthenticator();
        
        boolean login = lg.isLogin(dt);
        
        if(login)
        {
            response.sendRedirect("adminpanel.jsp");
        }
        else
        {
            response.sendRedirect("adminlogin.html");
        }
    }
    
}
