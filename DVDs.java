package br.mackenzie.fci.loja;
public class DVDs extends Produto{
    private String duracao;

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
     public String toString(){
        return super.toString() +
                "\nDuração: " + this.duracao;
    }
}
