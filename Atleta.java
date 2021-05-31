package br.mackenzie.fci.interfaces;

public class Atleta extends Humano implements intAtleta, intDancarina{
    
    public void dormirAgora(){
        System.out.println("Atleta dormindo");
    }
    
    public void correr(){
        System.out.println("Atleta correndo");
    }
    
    public void pular(){
        System.out.println("Atleta pulando");
    }

    public void dancar() {
        System.out.println("Atleta Dançcando");
    }
}