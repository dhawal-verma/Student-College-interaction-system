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
import model.UpdateStudent;

/**
 *
 * @author Dhawal
 */
public class Updatestudentrecord extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.sendRedirect("addstudent.html");
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String username = request.getParameter("username");
        String enrollment = request.getParameter("enrollment");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
        String year = request.getParameter("year");
        String adhar = request.getParameter("adhar");
        String blood = request.getParameter("blood");
        String branch = request.getParameter("branch");
        String gender = request.getParameter("gender");
        String mobile = request.getParameter("mobile");
        String dob = request.getParameter("dob");
        String email = request.getParameter("email");
        
        DTO dt = new DTO();
        
        dt.setUsername(username);
        dt.setPassword(password);
        dt.setYear(year);
        dt.setAddress(address);
        dt.setAdhar(adhar);
        dt.setBlood(blood);
        dt.setBranch(branch);
        dt.setDob(dob);
        dt.setGender(gender);
        dt.setEmail(email);
        dt.setMobile(mobile);
        dt.setEnrollment(enrollment);
        
        
        UpdateStudent lg = new UpdateStudent();
        
        boolean insert = lg.isUpdate(dt);
        System.out.println(insert);
        if(insert)
        {
            response.sendRedirect("index.jsp");
        }
        
        
    }    
}
