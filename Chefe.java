package Testes;
//Classe Chefe
public class Chefe extends Empregado {

// Atributos
private double beneficio;

// Construtor
public Chefe(double beneficio, String nome, int idade, double salario) {
   super(nome, idade, salario);
   this.beneficio = beneficio;
}
// Método getSalario
@Override
public double getSalario() {
   return super.getSalario() + beneficio;
}
// Método aumentoSalarial
public void aumentoSalarial (double percentual) {
   super.setSalario(super.getSalario() + (percentual/100 * super.getSalario())); 
}
//Método toString
@Override
public String toString() {
   return "Nome: " + super.getNome() + "; Idade: " + super.getIdade() + "; Salario: " + super.getSalario() ; 
   }
}
