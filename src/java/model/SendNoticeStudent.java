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
public class SendNoticeStudent 
{
     public boolean sendNoticeStudent(String text , String username)
    {
        Statement st = db.getstatement();
        int i = 0;
        
        try
        {
          i = st.executeUpdate("insert into noticestudent values('"+username+"','"+text+"')");
        } 
        catch (SQLException ex) 
        {
            System.out.println(ex);
        }
        if(i>0)
        {
            return true;
        }
        return false;
    }
}
