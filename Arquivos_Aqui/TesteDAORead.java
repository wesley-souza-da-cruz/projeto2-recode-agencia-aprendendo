package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TesteDAORead {
	
	// READ
		Promocoes1 clientes = new Promocoes1();
		
		static PromocoesDAO dao = new PromocoesDAO();

	public static void main(String[] args) {
		try {
			ResultSet resultado= dao.getPromocoes1();
			while (resultado.next()) {
		    	
				System.out.println("ID: "+resultado.getString(1)+" "+"\nValor: "+resultado.getString(2)+" "+ resultado.getString(3)+" "+"\nEndereco: "+ resultado.getString(4)+" "+"\nNomcliente: "+ resultado.getString(5)+" "+"\nFone: "+ resultado.getString(6)+" "+"\nEmail: "+ resultado.getString(7)+" "+"\nCpf: "+ resultado.getString(8)+"\n ");
		    }
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
