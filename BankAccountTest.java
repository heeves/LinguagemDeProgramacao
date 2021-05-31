package Semana4_ImplementacaoDeClasses;

import org.junit.Test;
import org.junit.Assert;
public class BankAccountTest {
    @Test
    public void addInterestTest() {
        BankAccount b = new BankAccount(200);
        b.addInterest(10);
        Assert.assertEquals(220, b.getBalance(), 0);
    } 
}
