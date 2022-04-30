package model;

import database.db;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Dhawal
 */
public class SendAssignmentFaculty 
{
    public boolean sendAssignmentFaculty(String username , String text)
    {
        Statement st = db.getstatement(); 
        int i = 0;
        try
        {
           i = st.executeUpdate("insert into assignmentfaculty values('"+username+"','"+text+"')");
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
