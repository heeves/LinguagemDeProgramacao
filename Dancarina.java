package br.mackenzie.fci.interfaces;

public class Dancarina extends Humano implements intDancarina{
    public void dancar(){
        System.out.println("Dançarina dançando");
    }
    
    public void dormirAgora(){
        System.out.println("Dançarina dormindo");
    }
}
