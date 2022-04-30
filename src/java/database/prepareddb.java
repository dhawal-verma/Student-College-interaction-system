/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dhawal
 */
public class prepareddb 
{
    public static Connection con =null;
    public static PreparedStatement pst = null;
    
    static 
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connected");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/managment","root","root");
            
            pst = con.prepareStatement("insert into student values(?,?,?,?,?,?,?,?,?,?,?,?)");
        } catch (ClassNotFoundException ex) 
        {
            System.out.println(ex);
        } 
        catch (SQLException ex) 
        {
            System.out.println(ex);
        }
    }
    public static Connection getConnection()
    {
        return con;
    }
    public static PreparedStatement getPreparedStatement()
    {
        return pst;
    }
    
}
