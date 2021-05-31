//Alan Diego Ribeiro De Azevedo TIA: 41143485
package br.mackenzie.fci.projeto;

import java.util.Scanner;
 
public class Funcionario {
    Scanner ent = new Scanner (System.in);
    String n, c;
    int r;
    private String nome;
    private String cargo;
    private Integer ramal;
    private Integer numero;
            
    public String getNome(){
        return nome;
    }
    
    public String getCargo(){
        return cargo;
    } 
    
    public Integer getRamal(){
        return ramal;
    }
    
    public Integer getNumero(){
        return numero;
    }
    
    public void cadastrar(){
        System.out.print("Digite seu nome: ");
        n = ent.nextLine();
        this.nome = n;
        System.out.print("Digite o seu cargo; ");
        c = ent.nextLine();
        this.cargo = c;
        if(c.equals("Diretor"))
            this.numero = 1;
        else if(c.equals("Gerente"))
            this.numero = 2;
        if(c.equals("Funcionário"))
            System.out.print("Você não pode agendar reuniões");
        else{
            System.out.print("Qual o seu ramal: ");
            r = ent.nextInt();
            this.ramal = r;
        }
    }
}
