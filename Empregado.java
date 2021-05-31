package Testes;
//Classe Empregado
public abstract class Empregado {
// Atributos
private int codigo;
private String nome;
private int idade;
private double salario;
private static String empresa = "Banco do Brasil";
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
public void setEmpresa(String empresa) {
//public static void setEmpresa(String empresa) {
   Empregado.empresa = empresa;
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
   salario = ((20/100 * salario) + salario); } }