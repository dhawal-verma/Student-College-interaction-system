/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Dhawal
 */
@SuppressWarnings("empty-statement")
public class db 
{
    public static Connection con = null;
    public static Statement st = null;
    static
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/managment","root","root");
            st = con.createStatement();
            
        } catch (ClassNotFoundException e) 
        {
            System.out.println(e);
        } catch (SQLException e)
        {
            System.out.println(e);;
        }
    }
    public static Connection getconnection()
    {
        return con;
    }
    public static Statement getstatement()
    {
        return st;
    }
}
