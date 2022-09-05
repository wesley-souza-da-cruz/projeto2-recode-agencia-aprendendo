package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DestinoDAO {
private Connection connection;
	
	public DestinoDAO() {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	public void save (Destino1 destino1) {
		String sql = "INSERT INTO Promocoes1 VALUES (?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, destino1.getId());
			stmt.setString(2, destino1.getNomlocal());
			stmt.setInt(3, destino1.getLugar());
			
			stmt.execute();
			stmt.close();	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	//Read 
		public ResultSet getDestino1() throws SQLException {
			String sql = "SELECT * FROM Destino1";
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
		public void update(Destino1 destino1) {
			String sql = "UPDATE destino1 SET  nomlocal = ?, lugar = ?,  WHERE id = ?";
			
			try {
				PreparedStatement stmt = connection.prepareStatement(sql);
				stmt.setString(1, destino1.getNomlocal());
				stmt.setInt(2, destino1.getLugar());
				stmt.setInt(3, destino1.getId());
				
				
				stmt.execute();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
		}
	    
		//Delete
		public void removeById(int id) {
			String sql = "DELETE FROM destino1 WHERE id= ?";
			try {
				PreparedStatement stmt = connection.prepareStatement(sql);
				stmt.setInt(1, id);
				stmt.execute();
				stmt.close();
			} catch (SQLException e) {
		
				e.printStackTrace();
			}
			
		}

		//Read 
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



