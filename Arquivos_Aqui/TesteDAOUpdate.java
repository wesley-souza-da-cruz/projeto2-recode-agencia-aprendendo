package dao;

public class TesteDAOUpdate {
	
	public static void main(String[] args) {
		// Testando a execução do Contato DAO Update
		Promocoes1 promocoes1 = new Promocoes1();
				
		PromocoesDAO dao = new PromocoesDAO();
				
		promocoes1.setId(1);
		promocoes1.setValor("3344");
		promocoes1.setEndereco("Rua Janira Almeida");
		promocoes1.setNomcliente("Gabriel Antunes");
		promocoes1.setFone("44-85255-5647");
		promocoes1.setEmail("MariaRecode@gmail.com");
		promocoes1.setCpf("222.444.451-54");
		
		
		dao.update(promocoes1);
		System.out.println("Contato alterado com sucesso!");

		}

}


