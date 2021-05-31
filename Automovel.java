package Heranca;

public class Automovel {
	protected String marca;
	protected int ano;
	protected String modelo;
	protected double tanqueDeGasolina;
	public Automovel(){
		marca = "null";
		ano = 0;
		modelo = "null";
		tanqueDeGasolina = 0;
	}
	public String getMarca(){
		return marca;
	}
	public void setMarca(String marca){
		this.marca = marca;
	}
	public int getAno(){
		return ano;
	}
	public void setAno(int ano){
		this.ano = ano;
	}
	public String getModelo(){
		return modelo;
	}
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	public double getTanqueDeGasolina(){
		return tanqueDeGasolina;
	}
	public void setTanqueDeGasolina(double tanqueDeGasolina){
		this.tanqueDeGasolina = tanqueDeGasolina;
	}
	@Override
	public String toString(){
		String resultado;
		resultado = "Marca: " + marca;
		resultado += "\nAno: " + ano;
		resultado += "\nModelo: " + modelo;
		resultado += "\nTanque de Gasolina: " + tanqueDeGasolina;
		resultado += "\nO carro consome: " + consumo() +" km/l";
		return resultado;
	}
	public double consumo(){
		return 15.0 - ((2013 - ano) * 0.05);
	}
}

