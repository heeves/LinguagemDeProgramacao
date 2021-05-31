package br.mackenzie.fci.loja;
public class Loja {
    public static void main(String[] args) {
        Livro l = new Livro();
        l.setNome("xxxxxxxxxxxxx");
        l.setPreco(11.11);
        l.setAutor("Fulano");
        l.toString();
        
        CDs CD = new CDs();
        CD.setNome("xxxxxxxxxxxx");
        CD.setPreco(11.11);
        CD.setNumeroDeFaixas(10);
        CD.toString();
        
        DVDs DVD = new DVDs();
        DVD.setNome("xxxxxxxxxxxx");
        DVD.setPreco(11.11);
        DVD.setDuracao("xxxxxxxxxx");
        DVD.toString();
    }
}
