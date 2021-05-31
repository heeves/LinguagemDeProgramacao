package Heranca;

public class Crianca extends Pessoa{
	private int idade;
	private String nome;
	private double valorDoIngresso;
	public Crianca(){
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
	public double valorDoIngresso(double valorDoIngresso){
		return 100 - 0.80;
	}
	@Override
	public String toString(){
		String resultado;
		resultado = super.toString();
		return resultado;
	}
}
