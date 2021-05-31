package Testes;
//Classe Estagiario
public class Estagiario extends Empregado {
 
 // Atributos
 private int quantMeses;
 
 // Construtor
 public Estagiario(int quantMeses, String nome, int idade, double salario) {
     super(nome, idade, salario);
     this.quantMeses = quantMeses;
 }

 // Método toString
 @Override
 public String toString() {
     return "Nome: " + super.getNome() + "; Idade: " + super.getIdade() + "; Salario: " + super.getSalario() + "; Quantidade de meses: " + quantMeses;
 }

 // Método aumentoSalarial
 public void aumentoSalarial (double percentual) {
     super.setSalario(super.getSalario() + (percentual/100 * super.getSalario()));     } }
