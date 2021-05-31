//Alan Diego Ribeiro de Azevedo TIA: 41143485
package br.mackenzie.fci.projeto;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class AlocacaoSala {
    private String assunto;
    private Date dataAlocacao;
    private Time horaInicioAlocacao;
    private Time horaFimAlocacao;
    private ArrayList listaMateriaisAlocados;
    private SalaReuniao sala;
    private Funcionario responsavelAlocacao;
    Scanner ent = new Scanner (System.in);
    String da, hia, a, hfa, lma;
    int s;
            
    public Funcionario getResponsavelAlocacao(){
        return responsavelAlocacao;
    }    
    
    public Time getHoraInicioAlocacao(){
        return horaInicioAlocacao;
    }
    
    public Time getHoraFimAlocacao(){
        return horaFimAlocacao;
    }
    
    public ArrayList getListaMateriaisAlocados(){
        return listaMateriaisAlocados;
    }
    
    public SalaReuniao getSala(){
        return sala;
    }
        
    public String getAssunto(){
        return assunto;
    }
    
    
    public Date getDataAlocacao(){
        return dataAlocacao;
    }
    
    public static Date convertDate(String date, String mask){
        SimpleDateFormat formatter = new SimpleDateFormat(mask);
        try{
            return formatter.parse(date);    
        }
        catch(Exception e){
            return null;    
       }    
    }    
  
    public static Time convertTime(String time, String mask){
        SimpleDateFormat formatter = new SimpleDateFormat(mask);
        try{
            return (Time) formatter.parse(time);
        }
        catch(Exception x){
            return null;
        }
    }
    
    public void alocar(){
        System.out.print("Sala :");
        SalaReuniao s = new SalaReuniao();
        s.setNumero(ent.nextInt());
        this.sala = s;
        System.out.print("Data :");
        da = ent.nextLine();
        Date data = convertDate(da, "dd/MM/yyyy");
        this.dataAlocacao = data;
        System.out.print("Quando começa: ");
        hia = ent.nextLine();
        Time hour = convertTime(hia, "HH:mm");
        this.horaInicioAlocacao = hour;
        System.out.print("Assunto: ");
        a = ent.nextLine();
        this.assunto = a;
        System.out.print("Quando acaba: ");
        hfa = ent.nextLine();
        Time hour1 = convertTime(hfa, "HH:mm");
        this.horaFimAlocacao = hour1; 
        System.out.println("Cadastro de materiais");
        Material m = new Material();
        m.cadastrar();
    }
    
    public void realocar(String novaData, String novaHoraInicio, String novaHoraFim, int novaSala){
        this.dataAlocacao = dataAlocacao;
        this.horaInicioAlocacao = horaInicioAlocacao;
        this.horaFimAlocacao = horaFimAlocacao;
        this.sala = sala;
        System.out.println("Reunião remarcda com sucesso !");
    }
    
    public void cancelar(){
        System.out.println("Reunião cancelada com sucesso !");
    }
}