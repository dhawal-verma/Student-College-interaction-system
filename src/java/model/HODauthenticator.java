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
public class HODauthenticator 
{
    public boolean isLogin(DTO dt)
    {
        String username = dt.getUsername();
        String password = dt.getPassword();
        String tablepassword = "";
        try
        {
            Statement st = db.getstatement();
            
            String query = "select password from hod where Name = '"+username+"'";
            ResultSet rs = st.executeQuery(query);
            
            if(rs.next())
            {
                tablepassword = rs.getString(1);
                
            }
            else
            {   
                return false;
            }
        }
        catch (SQLException e)
        {
            System.out.println(e);
        }
           return password != null && username != null && !username.trim().equals("") && password.equals(tablepassword);
    }
}
