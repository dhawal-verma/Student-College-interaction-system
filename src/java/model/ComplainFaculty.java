/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import database.db;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Dhawal
 */
public class ComplainFaculty 
{
    public boolean sendComplain(String username , String text)
    {
        Statement st = db.getstatement(); 
        int i = 0;
        try
        {
           i = st.executeUpdate("insert into complainfaculty values('"+username+"','"+text+"')");
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        if(i>0)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
}
