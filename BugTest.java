package Semana4_ImplementacaoDeClasses;

import org.junit.Test;
import org.junit.Assert;
public class BugTest {
    @Test
    public void getPosicaoTest() {
        Bug b = new Bug();
        Assert.assertEquals(0, b.getPosicao(), 0);
    }
    @Test
    public void andar() {
        Bug u = new Bug();
        Assert.assertEquals(99, u.Andar(), 0);
    }
}