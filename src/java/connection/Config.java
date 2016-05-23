

package connection;

/**
 *
 * @author kg/let_me_start/jaswantsinghyadav007@gmail.com
 */

import java.sql.*;
public class Config
{
    Connection con=null;
    String url = "jdbc:mysql://localhost:3306/code_online_judge";
    String user = "root";
    String pass = "root";
    //String pass = "panjasabd";
    public Connection getcon()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,user,pass);

        }
        catch(Exception e)
        {
          e.printStackTrace();
        }

        return con;
    }

}
