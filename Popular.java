package Heranca;

public class Popular extends Automovel{
	private double tipoDoMotor;
	private int qtdeDePortas;
	public Popular(){
		tipoDoMotor = 0;
		qtdeDePortas = 0;
	}
	public double getTipoDoMotor(){
		return tipoDoMotor;
	}
	public void setTipoDoMotor(double tipoDoMotor){
		this.tipoDoMotor = tipoDoMotor;
	}
	public int getQtdeDePortas(){
		return qtdeDePortas;
	}
	public void setQtdeDePortas(int qtdeDePortas){
		this.qtdeDePortas = qtdeDePortas;
	}
	public String getMarca(){
		return marca;	}
	public void setMarca(String marca){
		this.marca = marca;
	}
	@Override
	public String toString(){
		String resultado;
		resultado = super.toString();
		resultado += "\nTipo de motor: "+ tipoDoMotor;
		resultado += "\nQuantidade de portas: "+ QtdeDePortas;
		resultado += "\nconsumo: "+ consumo() +" km/l";
		return resultado;
	}
	public double consumo(){
		if(tipoDoMotor == 1.0)
			return 15.0 - ((2013 - ano ) * 0.05) - 0.10;
		if(tipoDoMotor == 1.4)
			return 15.0 - ((2013 - ano ) * 0.05) - 0.08;
		return 0;
	}
}