/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examination;

import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author User
 */
public class DbConnection{
        Connection con;
        Statement stm;
        
        public DbConnection() throws ClassNotFoundException, SQLException
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-4RN4UMK;database=Examination;integratedSecurity=true;");
            stm = con.createStatement();
        }
        
    	public void manipulate(String query) throws ClassNotFoundException, SQLException
	{
		stm.executeUpdate(query);
	}

}
