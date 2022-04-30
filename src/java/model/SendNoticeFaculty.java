package model;

import database.db;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Dhawal
 */
public class SendNoticeFaculty 
{
    public boolean sendNotice(String text , String username)
    {
        Statement st = db.getstatement();
        int i = 0;
        
        try
        {
          i = st.executeUpdate("insert into noticefaculty values('"+username+"','"+text+"')");
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
