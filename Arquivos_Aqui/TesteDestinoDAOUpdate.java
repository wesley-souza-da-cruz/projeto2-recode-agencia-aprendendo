package dao;

public class TesteDestinoDAOUpdate {

	public static void main(String[] args) {
		Destino1 destino1 = new Destino1();
		
		DestinoDAO dao = new DestinoDAO();
				
		destino1.setId(1);
		destino1.setNomlocal("Brasilia");
		destino1.setLugar(33);
		
		
		
		dao.update(destino1);
		System.out.println("Alterado com Sucesso!");

	}

}
