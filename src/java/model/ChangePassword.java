/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import database.db;
import dto.DTO;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dhawal
 */
public class ChangePassword 
{
    public boolean changePassword(DTO dt)
    {
        String newpassword = dt.getNewpassword();
        String repassword = dt.getRepassword();
        String password = dt.getPassword();
        System.out.println(newpassword);
        System.out.println(repassword);
        System.out.println(password);
        
        if(repassword.equals(newpassword))
        {
            int i = 0;
            Statement st = db.getstatement();
            
            try {
                 i = st.executeUpdate("update student set password = '"+newpassword+"' where password = '"+password+"'");
                 System.out.println(i);
            } 
            catch (SQLException ex) 
            {
                System.out.println(ex);
            }
            
            if(i>0)
            {
                return true;
            }
        }
//        System.out.println(i);
        return false;
    }
}
