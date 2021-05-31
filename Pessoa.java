package Heranca;

public class Pessoa {
	protected int idade;
	protected String nome;
	protected double valorDoIngresso;
	public Pessoa(){
		idade = 0;
		nome = "null";
		valorDoIngresso = 100;
	}
	public int getIdade(){
		return idade;
	}
	public void setIdade(int idade){
		this.idade = idade;
	}
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public double valorDoIngresso(){
		if(idade <= 5)
			return valorDoIngresso - 0.80;
		if(idade >= 60)
			return valorDoIngresso - 0.50;
		else
			return valorDoIngresso;
	}
	@Override
	public String toString(){
		String resultado;
		resultado = "Idade: " + idade;
		resultado += "\nNome: " + nome;
		resultado += "\nTotal: " + valorDoIngresso() +" reais";
		return resultado;  
	}
}
