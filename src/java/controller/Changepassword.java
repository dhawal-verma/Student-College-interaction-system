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
import model.ChangePassword;
import model.CheckPassword;

/**
 *
 * @author Dhawal
 */
public class Changepassword extends HttpServlet 
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
       response.sendRedirect("changepassword.jsp");
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String newpassword = request.getParameter("newpassword");
        String repassword = request.getParameter("repassword");
        String password = request.getParameter("password");
        String username = request.getParameter("username");
        
        DTO dt = new DTO();
        dt.setPassword(password);
        dt.setNewpassword(newpassword);
        dt.setRepassword(repassword);
        dt.setUsername(username);
        
        CheckPassword cp = new CheckPassword();
        boolean check = cp.isCheck(dt);
        boolean change = false;
        System.out.println(check);
        if(check)
        {
            ChangePassword aa = new ChangePassword();
            change = aa.changePassword(dt);
        }
        System.out.println(change);
        if(change)
        {
            response.sendRedirect("index.jsp");
        }
        else
        {
            response.sendRedirect("adminlogin.html");
        }
        
        
     }

}
