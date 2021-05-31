package Testes;
//Classe TestaEmpregados
public class TestaEmpregado {

// Método main
public static void main (String args[]) {

   // Instancia chefes
   Chefe chefe1 = new Chefe(100, "Marli", 41, 10000);
   Chefe chefe2 = new Chefe(1000, "Alessandra", 35, 10000);
   
   // Instancia estagiários
   Estagiario estagiario1 = new Estagiario(10, "Victor", 21, 1000);
   Estagiario estagiario2 = new Estagiario(6, "Alexandre", 20, 500);
   
   // Exibe os salários dos chefes
   System.out.println("Salário de " + chefe1.getNome() + ": " + chefe1.getSalario());
   System.out.println("Salário de " + chefe2.getNome() + ": " + chefe2.getSalario());
   
   // Aumenta o salário do chefe2
   chefe2.aumentoSalarial(10);
   
   // Reexibe os salários dos chefes
   System.out.println("Salário de " + chefe1.getNome() + ": " + chefe1.getSalario());
   System.out.println("Salário de " + chefe2.getNome() + ": " + chefe2.getSalario());
   
   // Exibe os salários dos estagiários
   System.out.println("Salário de " + estagiario1.getNome() + ": " + estagiario1.getSalario());
   System.out.println("Salário de " + estagiario2.getNome() + ": " + estagiario2.getSalario());

   // Aumenta o salário do estagiario2
   estagiario2.aumentoSalarial(10);
   
   // Reexibe os salários dos chefes
   System.out.println("Salário de " + estagiario1.getNome() + ": " + estagiario1.getSalario());
   System.out.println("Salário de " + estagiario2.getNome() + ": " + estagiario2.getSalario());
   
   // Exibe as informações dos chefes e dos estagiários
   System.out.println(chefe1.toString());
   System.out.println(chefe2.toString());
   System.out.println(estagiario1.toString());
   System.out.println(estagiario2.toString());
	}
}
//Empregado na empresa como não estático

//Classe Empregado
/*public  class Empregado {
private  String empresa;
//Atributos
private int codigo;
private String nome;
private int idade;
private double salario;

// Construtor
public Empregado(String nome, int idade, double salario) {
   this.nome = nome;
   this.idade = idade;
   this.salario = salario;
}
// Getters e setters
public int getCodigo() {
   return codigo;
}
public void setCodigo(int codigo) {
   this.codigo = codigo;
}
public String getEmpresa() {
//public static String getEmpresa() {
   return empresa;
}
//public void setEmpresa(String empresa) {
public void setEmpresa(String empresa) {
   this.empresa = empresa;
}
public int getIdade() {
   return idade;
}
public void setIdade(int idade) {
   this.idade = idade;
}
public String getNome() {
   return nome;
}
public void setNome(String nome) {
   this.nome = nome;
}
public double getSalario() {
   return salario;
}
public void setSalario(double salario) {
   this.salario = salario;
}
// Método aumentoSalarial
public void aumentoSalarial() {
   salario = ((20/100 * salario) + salario);
}
}
*/