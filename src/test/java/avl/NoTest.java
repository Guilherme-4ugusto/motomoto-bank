package avl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class NoTest {
	
	@Test
    public void testCriacaoNoComValor() {
        No<Integer> no = new No<>(10);
        assertEquals(Integer.valueOf(10), no.getValor());
        assertNull(no.getEsquerda());
        assertNull(no.getDireita());
        assertEquals(0, no.getAltura());
        assertEquals(0, no.getFatorBalanceamento());
    }

    @Test
    public void testSetValor() {
        No<String> no = new No<>("A");
        no.setValor("B");
        assertEquals("B", no.getValor());
    }

    @Test
    public void testSetAltura() {
        No<Integer> no = new No<>(5);
        no.setAltura(2);
        assertEquals(2, no.getAltura());
    }

    @Test
    public void testSetFatorBalanceamento() {
        No<Integer> no = new No<>(5);
        no.setFatorBalanceamento(-1);
        assertEquals(-1, no.getFatorBalanceamento());
    }

    @Test
    public void testSetEsquerda() {
        No<Integer> no = new No<>(5);
        No<Integer> esquerda = new No<>(3);
        no.setEsquerda(esquerda);
        assertEquals(esquerda, no.getEsquerda());
        assertEquals(Integer.valueOf(3), no.getEsquerda().getValor());
    }

    @Test
    public void testSetDireita() {
        No<Integer> no = new No<>(5);
        No<Integer> direita = new No<>(7);
        no.setDireita(direita);
        assertEquals(direita, no.getDireita());
        assertEquals(Integer.valueOf(7), no.getDireita().getValor());
    }

    @Test
    public void testToString() {
        No<Double> no = new No<>(10.5);
        assertEquals("Node [valor=10.5]", no.toString());
    }

}
