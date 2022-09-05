package dao;

public class TesteDestinoDAOCreate {

	public static void main(String[] args) {
    Destino1 destino1 = new Destino1();
    

		
        destino1.setId(1);
        destino1.setNomlocal("Campo de Goytacazes");
        destino1.setLugar(22);

		
		
        TesteDestinoDAOCreate dao = new TesteDestinoDAOCreate();
		
	    dao.save(destino1);
	    System.out.println("Modificado com sucesso!");

	}

	private void save(Destino1 destino1) {
		// So consegui resolver criando esse metodo private
		
	}

	

}
