/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import database.db;
import dto.DTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Dhawal
 */
public class CheckPassword 
{
    public boolean isCheck(DTO dt)
    {
        String username = dt.getUsername();
        String password = dt.getPassword();
        
        Statement st = db.getstatement();
        String tablepassword = "";
        try
        {
            ResultSet rs =  st.executeQuery("select password from student where name = '"+username+"'");
            if(rs.next())
            {
                tablepassword = rs.getString(1);
            }
            else
            {
                return false;
            }
        } catch (SQLException ex) 
        {
            System.out.println(ex);
        }
        return username != null && password != null && !username.trim().equals("") && password.equals(tablepassword);
    }
}
