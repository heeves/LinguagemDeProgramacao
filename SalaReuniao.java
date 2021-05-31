
//Alan Diego Ribeiro de Azevedo TIA: 41143485
package br.mackenzie.fci.projeto;

import java.util.ArrayList;
import java.util.Scanner;

public class SalaReuniao {
    private Integer numero;
    private Integer qdtLugares;
    private Funcionario responsavelAlocacao;
    private ArrayList alocacao;
    Scanner ent = new Scanner (System.in);
    int i, n;
        
    public Integer getNumero(){
        return numero;
    }
    
    public void setNumero(Integer numero){
        this.numero = numero;
    }

    public Integer getQdtLugares(){
        return qdtLugares;
    }
    
    public Funcionario getResponsavelAlocacao(){
        return responsavelAlocacao;
    }
    
    public void cadastrar(){
        System.out.print("Número da sala; ");
        i = ent.nextInt();
        this.numero = i;
        System.out.print("Quantidade de Lugares: ");
        n = ent.nextInt();
        this.qdtLugares = n;
    }
    
     public ArrayList obterSalaLivre(String data, String horaInicio, String horaFim){
        if(numero.equals(alocacao))
            System.out.println("Sala Ocupada");
        else
            System.out.println("Sala Livre");
        return null;
    }
}
