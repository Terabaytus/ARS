package ru.gspvol;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Server_2 {
	
	
	@SuppressWarnings("unused")
	public Server_2 (String server_sql_2, String numberport_2, String user_dbsql, String password_dbsql, String wayTostartMIS_2) throws IOException {
	
		
		try {
       
		Connection connection = DriverManager.getConnection("jdbc:mysql://"+server_sql_2+":"+numberport_2+"?user="+user_dbsql+"&password="+password_dbsql+"");
        System.out.println("Есть контакт Server_2 !!!");
        
        ProcessBuilder pb = new ProcessBuilder("cmd", "/c", wayTostartMIS_2);
        Process process = pb.start();
		
		}
      catch (SQLException se) {
           System.out.println("Ошибка соеденения с БД Server_2");
           JOptionPane.showMessageDialog(null, "Нет соеденения с программой повторите попытку позже.");
       }
		
	}

}
