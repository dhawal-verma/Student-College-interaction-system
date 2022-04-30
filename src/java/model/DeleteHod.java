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
public class DeleteHod 
{
     public boolean isDelete(String enrollment) 
    {
            Statement st = db.getstatement();
            
            int i = 0;
        try 
        {
            i = st.executeUpdate("delete from hod where faculty_id = '"+enrollment+"'");
        } catch (SQLException ex) 
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
