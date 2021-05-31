package br.mackenzie.fci.interfaces;

public class Teste {
    public static void main(String[] args){
        
        intDancarina id = new Dancarina();
        id.dancar();
        
        intDancarina ia = new Bailarina();
        ia.dancar();
        
        intAtleta it = new Atleta();
        it.pular();
        
        intAtleta il = new Atleta();
        il.correr();
        
        Humano h = new Dancarina();
        h.dormirAgora();
        
        Humano u = new Atleta();
        u.dormirAgora();
        
        Humano m = new Bailarina();
        m.dormirAgora();
    }
}
