package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TesteDestinoDAORead {
	// READ
			Destino1 clientes = new Destino1();
			
			static DestinoDAO dao = new DestinoDAO();

		public static void main(String[] args) {
			try {
				ResultSet resultado= dao.getDestino1();
				while (resultado.next()) {
			    	
					System.out.println("ID: "+resultado.getString(1)+" "+"\nNomlocal: "+resultado.getString(2)+" "+ resultado.getString(3)+" "+"\nlugar: "+"\n ");
			    }
			} catch (SQLException e) {
				
				e.printStackTrace();
			}

		}

}


	

