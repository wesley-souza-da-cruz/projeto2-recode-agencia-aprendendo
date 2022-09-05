package dao;

public class TesteDAOCreate {

	public static void main(String[] args) {
	//TESTANDO A CONEX COM CREATE (Wesley)
		
    Promocoes1 promocoes1 = new Promocoes1();
		
        promocoes1.setId(1);
        promocoes1.setValor("R$999,99");
        promocoes1.setEndereco("Rua das Flores");
        promocoes1.setNomcliente("Wesley Souza");
        promocoes1.setFone("11-98754-4520");
        promocoes1.setEmail("WesleyRecodePro@gmail.com");
        promocoes1.setCpf("123-325-154-55");

		
		
		PromocoesDAO dao = new PromocoesDAO();
		
	    dao.save(promocoes1);
	    System.out.println("CONTATO SALVO COM SUCESSO!");

	}

}
