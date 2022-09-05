package dao;

public class TesteDestinoDAODelete {
	
	public static void main(String[] args) {
		// DAO Delete
				DestinoDAO dao = new DestinoDAO();
										
				dao.removeById(1);
		        System.out.println("Removido com Sucesso!");

			

	}

}
