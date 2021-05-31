package Semana4_ImplementacaoDeClasses;
public class PopulacaoDeInsetos {
    private int insetos;
    public PopulacaoDeInsetos(){
        insetos = 1000;
    }
    public PopulacaoDeInsetos(int valor){
        insetos = valor;
    }
    public int getInsetos(){
        return insetos;
    }
    public int PopulacaoDeInsetos(int n){
        insetos = n;
        return insetos;
    }
    public void procriar(){
        insetos *= 2;
    }
    public void pulverizar(){
        insetos = insetos / 2;
    }
}
