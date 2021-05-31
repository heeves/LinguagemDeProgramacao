package Heranca;

public class Utilitario extends Automovel {
	private int capacidade;
	private double altura;
	public Utilitario(){
		capacidade = 0;
		altura = 0;
	}
	public int getCapacidade(){
		return capacidade;
	}
	public void setCapacidade(int capacidade){
		this.capacidade = capacidade;
	}
	public double getAltura(){
		return altura;
	}
	public void setAltura(double altura){
		this.altura = altura;
	}
	@Override
	public String toString(){
		String resultado;
		resultado = super.toString();
		resultado +="\nCapacidade: " + capacidade;
		resultado +="\nAltura: " + altura;
		resultado += "\nConsumo: " + consumo() +" km/l";
		return resultado;
	}
	public double consumo(){
		int i;
		double consumo;
		consumo = 0;
		altura = altura * 0.25;
		for(i = 5;i <= capacidade; i++){
			consumo = 15.0 - ((2013 - ano) * 0.05) + 0.03;
			}
		return consumo - altura;
	}
}
