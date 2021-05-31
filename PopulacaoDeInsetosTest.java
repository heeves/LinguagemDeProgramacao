package Semana4_ImplementacaoDeClasses;

import org.junit.Test;
import org.junit.Assert;
public class PopulacaoDeInsetosTest {
    @Test
    public void defaultConstructorTest() {
        PopulacaoDeInsetos p = new PopulacaoDeInsetos();
        Assert.assertEquals(1000, p.getInsetos(), 0);
        }
    @Test
    public void nonDefaultConstructorTest() {
        PopulacaoDeInsetos p = new PopulacaoDeInsetos(500);
        Assert.assertEquals(500, p.getInsetos(), 0);
        }
    @Test
    public void procriarTest() {
        PopulacaoDeInsetos p = new PopulacaoDeInsetos();
        p.procriar();
        Assert.assertEquals(2000, p.getInsetos(), 0);
        }
    @Test
    public void pulverizarTest() {
        PopulacaoDeInsetos p = new PopulacaoDeInsetos(500);
        p.pulverizar();
        Assert.assertEquals(250, p.getInsetos(), 0);
        }
}