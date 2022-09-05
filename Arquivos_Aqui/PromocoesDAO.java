package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PromocoesDAO {
	private Connection connection;
	
	public PromocoesDAO() {
		this.connection = new ConnectionFactory().getConnection();

	}


public void save (Promocoes1 promocoes1) {
	String sql = "INSERT INTO Promocoes1 VALUES (?,?,?,?,?,?,?)";
	try {
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setInt(1, promocoes1.getId());
		stmt.setString(2, promocoes1.getValor());
		stmt.setString(3, promocoes1.getCpf());
		stmt.setString(4, promocoes1.getEndereco());
		stmt.setString(5, promocoes1.getNomcliente());
		stmt.setString(6, promocoes1.getFone());
		stmt.setString(7, promocoes1.getEmail());
		stmt.execute();
		stmt.close();	
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
}

//Read 
	public ResultSet getPromocoes1() throws SQLException {
		String sql = "SELECT * FROM Promocoes1";
		Statement stmt = null;
		ResultSet resultado = null;
		try {
			stmt = connection.createStatement();
			resultado =  stmt.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
		
	}
    
	//Update
	public void update(Promocoes1 promocoes1) {
		String sql = "UPDATE promocoes1 SET  valor = ?, cpf = ?, endereco = ?, nomcliente = ?, fone = ?, email = ? WHERE id = ?";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, promocoes1.getValor());
			stmt.setString(2, promocoes1.getCpf());
			stmt.setString(3, promocoes1.getEndereco());
			stmt.setString(4, promocoes1.getNomcliente());
			stmt.setString(5, promocoes1.getFone());
			stmt.setString(6, promocoes1.getEmail());
			stmt.setInt(7, promocoes1.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
    
	//Delete
	public void removeById(int id) {
		String sql = "DELETE FROM promocoes1 WHERE id= ?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, id);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
	
			e.printStackTrace();
		}
		
	}

	//Read ID
	public ResultSet getContatoById(int id) throws SQLException {
		String sql = "SELECT * FROM promocoes1 where id = ?";
		PreparedStatement stmt = null;
		ResultSet resultado = null;
		try {
			stmt = connection.prepareStatement(sql);
			stmt.setInt(1, id);
			resultado =  stmt.executeQuery();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return resultado;
		
	}

}
