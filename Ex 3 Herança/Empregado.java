package ExercicioHeranca;
//3Considere, como subclasse da classe Pessoa, a classe Empregado. Considere que cada
//inst�ncia da classe Empregado tem, para al�m dos atributos que caracterizam a classe Pessoa,
//os atributos codigoSetor (inteiro), salarioBase (vencimento base) e imposto (porcentagem
//retida dos impostos). Implemente a classe Empregado com m�todos seletores e modificadores
//e um m�todo calcularSalario. Escreva um programa de teste adequado para a classe
//Empregado.

public class Empregado extends Pessoas{
	
	private int codigoSetor;
	private float salarioBase;//vencimento base
	private float imposto;//porcentagem retirada dos impostos

	public Empregado (String nome,String endereco, int telefone, int codigoSetor, float salarioBase, float imposto) {
		super (nome, endereco, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}
	public void status () {
		System.out.println("***Informa��o do Fucion�rio***\n");
		System.out.println("\nNome: " + this.getNome());
		System.out.println("\nEndere�o:" + this.getEndereco());
		System.out.println("\nTelefone:" + this.telefone);
	}
	public void calcularSalario() {
		double salarioTotal = salarioBase - (salarioBase*(imposto/100));
		System.out.println("Empregado(a): " +getNome()+"\nSal�rio Total com descontos: "+salarioTotal);
	}
	public int getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public float getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	public float getImposto() {
		return imposto;
	}
	public void setImposto(float imposto) {
		this.imposto = imposto;
	}
	
}

