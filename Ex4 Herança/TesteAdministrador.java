package ExercicioHeranca;

public class TesteAdministrador {
	public static void main(String[] args) {
		Administrador adm = new Administrador(null, null, 0, 0);
		adm.setNome("Caroline Miranda");
		 adm.setEndereco("Endereço: Rua das Flores Cheirosas, 123");
		 adm.setTelefone(99999999);
		 adm.setDias(10);
	     adm.setAjudaCusto(100);
	     adm.setPrecoTotalEstadias(120);
	     adm.setPrecoTotalViagem(1200);
	     
	     
	    
	     System.out.println("*** BEM VINDO AO RECANTO FELICIDADE***");
	     System.out.println(adm.getEndereco());
	     System.out.println("Telefone:"+adm.getTelefone());
	     System.out.println("\n***********************************");
	     System.out.println("\nInformações de Valores e Descontos: ");
	    
	    
	     adm.getAjudaCusto();
	     adm.getDias();
	     adm.getPrecoTotalEstadias();
	     adm.getPrecoTotalViagem();
	     adm.calcularAjudaCusto();
	     System.out.println("Preço Total  da Viagem = R$ "+adm.getPrecoTotalViagem());
	     System.out.println("\nAproveite seu descanso!!!!");
	   
		
	}

}
