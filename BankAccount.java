package Semana4_ImplementacaoDeClasses;
public class BankAccount {
    private double balance;
    public BankAccount(int valor){
        balance = valor;
    }
    public void deposit(double amount) {
        double newBalance = balance + amount;
        balance = newBalance;
        }
    public void withdraw(double amount) {
        double newBalance = balance - amount;
        balance = newBalance;
        }
    public double getBalance() {
        return balance;
        }
    public void addInterest(int amount) {
        double newBalance = amount + amount;
        balance += newBalance;
    }
}
