    //Alan Diego Ribeiro de Azevedo TIA: 41143485
package br.mackenzie.fci.projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class Material {
    private String nome;
    private ArrayList materiaisUsados;
    String n;
    Scanner ent = new Scanner(System.in);
    
    public String getNome(){
        return nome;
    }
    
    public ArrayList getMateriaisUsados(){
        return materiaisUsados;
    }
    
    public void cadastrar(){
        System.out.print("Qual o nome: ");
        n = ent.nextLine();
        this.nome = n;
        ArrayList materiaisUsados = new ArrayList();
        materiaisUsados.add(n);
    }
}
