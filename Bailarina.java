package br.mackenzie.fci.interfaces;

public class Bailarina extends Humano implements intAtleta, intDancarina{
    public double altura;
    public double peso;
    
    public void correr(){
        System.out.println("Bailarina Correndo");
    }
    
    public void dancar(){
        System.out.println("Bailarina Dançando");
    }
    
    public void pular(){
        System.out.println("Bailarina pulando");
    }
    
    public void dormirAgora(){
        System.out.println("Bailarina dormindo");
    }
}
