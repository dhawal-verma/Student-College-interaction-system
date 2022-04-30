/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import static database.prepareddb.con;
import static database.prepareddb.pst;
import dto.DTO;
import java.sql.SQLException;

/**
 *
 * @author Dhawal
 */
public class InsertAdmin 
{
     public boolean isInsert(DTO dt) throws SQLException
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
            
//            PreparedStatement pst = prepareddb.getPreparedStatement();
            pst = con.prepareStatement("insert into admin values(?,?,?,?,?,?,?,?,?,?,?,?)");
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
            System.out.println("Recorded Inserted");
            return true;
        }
        return false;
    }
}
