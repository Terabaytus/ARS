package ru.gspvol;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Server_1 {
	
	
	@SuppressWarnings("unused")
	public Server_1 (String server_sql_1, String numberport_1, String server_sql_2, String numberport_2, String user_dbsql, String password_dbsql, String wayTostartMIS_1, String wayTostartMIS_2) throws IOException {
	
		try {
       
		Connection connection = DriverManager.getConnection("jdbc:mysql://"+server_sql_1+":"+numberport_1+"?user="+user_dbsql+"&password="+password_dbsql+"");
        System.out.println("Есть контакт Server_1 !!!");
      
        ProcessBuilder pb = new ProcessBuilder("cmd", "/c", wayTostartMIS_1);
        Process process = pb.start();
		}
      catch (SQLException se) {
           System.out.println("Ошибка соеденения с БД Server_1");
           Server_2 server_2 = new Server_2(server_sql_2, numberport_2, user_dbsql, password_dbsql, wayTostartMIS_2);
       }
		
	}
	
 }

