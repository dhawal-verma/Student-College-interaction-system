/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import database.db;
import database.prepareddb;
import dto.DTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dhawal
 */
public class AssignmentDAO 
{
    public List<DTO> getAssignment()
    {
        List <DTO> listofassignment = new ArrayList<DTO>();
        
        try
        {
            Statement st = db.getstatement();
            ResultSet rs = st.executeQuery("select * from assignmentstudent");
            
            while(rs.next())
            {
                DTO dt = new DTO();
                dt.setEnrollment(rs.getString(1));
                dt.setAssignment(rs.getString(2));
                listofassignment.add(dt);
            }
        } 
        catch (SQLException ex) 
        {
            System.out.println(ex);
        }
        return listofassignment;
    }
}
