package Driver;

import java.sql.*;

public class DRIVERR {
	
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/clienteentrega";
	private static final String USERNAME = "root";
	private static final String PASSWORD= "xxx";

	public static void main(String[] args) {
		// Testando acesso ao BD
		try {
			Connection con = DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);
			
			if (con != null) {
				System.out.println("Esta conectado");
			} else {
					System.out.println("Nao conectou");
			}
			
			
			
			con.close();
			
		}
		catch (Exception exc) {
        	exc.printStackTrace();
        }
	}

}