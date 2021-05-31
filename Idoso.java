package Heranca;

public class Idoso extends Pessoa{
	@Override
	public String toString(){
		String resultado;
		resultado = super.toString();
		return resultado;
	}
	public double valorDoIngresso(double valorDoIngresso){
		return valorDoIngresso - 0.50;	
	}
}
