/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import database.db;
import dto.DTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dhawal
 */
public class HODDAO 
{
    public DTO  getUserData(String enrollment)
    {
        DTO dt = new DTO();
        Statement st = db.getstatement();
        try
        {
         ResultSet rs =    st.executeQuery("select * from hod where Faculty_id = '"+enrollment+"'");
         if(rs.next())
         {
             dt.setEnrollment(enrollment);
             dt.setUsername(rs.getString(1));
             dt.setPassword(rs.getString(3));
             dt.setAddress(rs.getString(4));
             dt.setYear(rs.getString(5));
             dt.setAdhar(rs.getString(6));
             dt.setBlood(rs.getString(7));
             dt.setBranch(rs.getString(8));
             dt.setGender(rs.getString(9));
             dt.setMobile(rs.getString(10));
             dt.setDob(rs.getString(11));
             dt.setEmail(rs.getString(12));
         }
        }
        catch (SQLException e)
        {
            System.out.println(e);
        }
        
        return dt;
    }
    public List<DTO> userAllData() 
    {
        List<DTO> listofusers = new ArrayList<DTO>();
        
        try 
        {
            Statement st = db.getstatement();
            ResultSet rs = st.executeQuery("Select * from hod");
            while(rs.next())
            {
                DTO dt = new DTO();
                dt.setEnrollment(rs.getString(2));
                dt.setUsername(rs.getString(1));
                dt.setPassword(rs.getString(3));
                dt.setAddress(rs.getString(4));
                dt.setYear(rs.getString(5));
                dt.setAdhar(rs.getString(6));
                dt.setBlood(rs.getString(7));
                dt.setBranch(rs.getString(8));
                dt.setGender(rs.getString(9));
                dt.setMobile(rs.getString(10));
                dt.setDob(rs.getString(11));
                dt.setEmail(rs.getString(12));
                listofusers.add(dt);
            }
        } 
        catch (SQLException ex) 
        {
            System.out.println(ex);
        }
        return listofusers;
    }
}
