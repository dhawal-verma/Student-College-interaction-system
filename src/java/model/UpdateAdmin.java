/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import database.prepareddb;
import static database.prepareddb.con;
import dto.DTO;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Dhawal
 */
public class UpdateAdmin 
{
    public boolean isUpdate(DTO dt) 
    {
        String username = dt.getUsername();
        String password = dt.getPassword();
        String enrollment = dt.getEnrollment();
        String address = dt.getAddress();
        String adhar = dt.getAdhar();
        String year = dt.getYear();
        String branch = dt.getBranch();
        String blood = dt.getBlood();
        String email = dt.getEmail();
        String gender = dt.getGender();
        String dob = dt.getDob();
        String mobile = dt.getMobile();
        
        int i = 0;
        try
        {
            PreparedStatement pst = prepareddb.getPreparedStatement();
            pst = con.prepareStatement("update admin set Name=?,Faculty_id=?,Address=?,Joining_Year=?,Adhar_Number=?,Blood_Group=?,Branch=?,Gender=?,Mobile_Number=?,Date_of_Birth=?,email=? where Faculty_id = '"+enrollment+"'");
            pst.setString(1, username);
            pst.setString(2,enrollment);
            pst.setString(3,password);
            pst.setString(4,address);
            pst.setString(5,year);
            pst.setString(6,adhar);
            pst.setString(7,blood);
            pst.setString(8,branch);
            pst.setString(9,gender);
            pst.setString(10,mobile);
            pst.setString(11,dob);
            pst.setString(12,email);
        
            i = pst.executeUpdate();
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
            
        if(i>0)
        {
            System.out.println("Recorded Updated");
            return true;
        }
        return false;
    }
}
