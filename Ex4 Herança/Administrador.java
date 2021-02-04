package ExercicioHeranca;

public class Administrador extends Pessoas{
	
	private float ajudaCusto;
	private int precoTotalViagem;
	private float precoTotalEstadias;
	private int dias;
	
		public Administrador (String nome, String endereco, int telefone, int dias) 
	{
		super (nome,endereco,telefone);
	}
	public Administrador (String nome, String endereco, int telefone, int dias, float ajudaCusto, float ajudaCustoViagem, float ajudaCustoEstadias, int precoTotalViagem, float precoTotalEstadias) {
		super (nome,endereco,telefone);
		this.ajudaCusto = ajudaCusto;
		this.precoTotalViagem = precoTotalViagem;
		this.precoTotalEstadias = precoTotalEstadias;
		
	}
	
	public void status () {
		System.out.println("***Informações do Cliente***\n");
		System.out.println("\nNome: " + this.getNome());
		System.out.println("\nEndereço:" + this.getEndereco());
		System.out.println("\nTelefone:" + this.telefone);
	}
	
	public void calcularAjudaCusto() {
		double precoTotal = ajudaCusto - - (ajudaCusto*(dias/100));;
		System.out.println("Olá: " +getNome()+"\nPreço da Viagem com desconto: "+precoTotal);
		
	}
	public float getAjudaCusto() {
		return ajudaCusto;
	}
	public void setAjudaCusto(float ajudaCusto) {
		this.ajudaCusto = ajudaCusto;
	}
	public int getPrecoTotalViagem() {
		return precoTotalViagem;
	}
	public void setPrecoTotalViagem(int precoTotalViagem) {
		this.precoTotalViagem = precoTotalViagem;
	}
	public float getPrecoTotalEstadias() {
		return precoTotalEstadias;
	}
	public void setPrecoTotalEstadias(float precoTotalEstadias) {
		this.precoTotalEstadias = precoTotalEstadias;
	}
	public int getDias() {
		return dias;
	}
	public void setDias(int dias) {
		this.dias = dias;
	}
}
