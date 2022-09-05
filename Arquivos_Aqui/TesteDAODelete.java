package dao;

public class TesteDAODelete {

	public static void main(String[] args) {
		// DAO Delete
				PromocoesDAO dao = new PromocoesDAO();
										
				dao.removeById(1);
		        System.out.println("Contato Removido com Sucesso!");

			

	}

}
