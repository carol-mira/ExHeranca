package ExercicioHeranca;

public class Pessoas {
	//Criar uma Classe Pessoa, contendo os atributos encapsulados
	private String nome;
	private String endereco;
	protected int telefone;
	
	
	
	//método construtor
	public Pessoas(String nome, String endereco, int telefone) 
	{ 
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	
    }
	//Com seus respectivos seletores(getters) e modificadores (setters)
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public void setAjudaCusto(int i) {
		// TODO Auto-generated method stub
		
	}
	public void setPrecoTotalEstadias(int i) {
		// TODO Auto-generated method stub
		
	}
	public void setDias(int i) {
		// TODO Auto-generated method stub
		
	}
}

