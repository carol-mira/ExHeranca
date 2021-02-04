package ExercicioHeranca;

public class TesteEmpregado {
public static void main(String[] args) {
	Empregado empr1 = new Empregado (null, null, 0, 0, 0, 0);
	
	
	 empr1.setNome("Caroline Miranda");
	 empr1.setEndereco("Endereço: Rua das Flores Cheirosas, 123");
	 empr1.setTelefone(99999999);
     empr1.setCodigoSetor(123456);
     empr1.setSalarioBase(7000);
     empr1.setImposto(14);
     
     
    
     System.out.println("*** Empresa: Felicidade, amor e paz!***");
     System.out.println(empr1.getEndereco());
     System.out.println("Telefone:"+empr1.getTelefone());
     System.out.println("\n***********************************");
     System.out.println("\nInformações Sálario do Funcionário: ");
    
    
     empr1.getCodigoSetor();
     empr1.getSalarioBase();
     empr1.getImposto();
     empr1.calcularSalario();
     System.out.println("Salario Total  do(a) Empregado(a) = "+empr1.getSalarioBase());
     System.out.println("\n***********************************");
   
	
}
}
