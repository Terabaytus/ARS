package ru.gspvol;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Main {
	 
	public static final String PATH_TO_PROPERTIES = "ARS.properties";
		
	@SuppressWarnings("unused")
	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		InputStream fileInputStream;
        
        Properties prop = new Properties();
 
        try {
            
            fileInputStream = ClassLoader.getSystemResourceAsStream(PATH_TO_PROPERTIES);
            prop.load(fileInputStream);
 
            String server_sql_1 			= prop.getProperty("SERVER_SQL_1");
            String numberport_1 			= prop.getProperty("NUMBERPORT_1");
            
            String server_sql_2 			= prop.getProperty("SERVER_SQL_2");
            String numberport_2 			= prop.getProperty("NUMBERPORT_2");
            
            String user_dbsql			    = prop.getProperty("USERNAME");
            String password_dbsql 		    = prop.getProperty("PASSWORD");
 
            String wayTostartMIS_1 		    = prop.getProperty("WAYTOSTARTMIS_1");
            String wayTostartMIS_2          = prop.getProperty("WAYTOSTARTMIS_2");
            
            String servernews               = prop.getProperty("SERVERNEWS");
            
            Server_1 server_1 = new Server_1 (server_sql_1, numberport_1, server_sql_2, numberport_2, user_dbsql, password_dbsql, wayTostartMIS_1, wayTostartMIS_2);
        
        } catch (IOException e) {
            System.out.println("Ошибка в программе: файл ARS.properties " + PATH_TO_PROPERTIES + " по указаному пути не обнаружен." );
            e.printStackTrace();
        }
		
       
  }
	
}
