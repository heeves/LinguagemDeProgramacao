package br.mackenzie.fci.loja;
public class CDs extends Produto{
    private int numeroDeFaixas;

    public int getNumeroDeFaixas() {
        return numeroDeFaixas;
    }

    public void setNumeroDeFaixas(int numeroDeFaixas) {
        this.numeroDeFaixas = numeroDeFaixas;
    }
     public String toString(){
        return super.toString() +
                "\nNúmero de faixas: " + this.numeroDeFaixas;
    }
}
