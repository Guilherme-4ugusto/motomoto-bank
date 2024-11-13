package avl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class ArvoreTest {
	
	@Test
    public void testInsercaoSimples() {
        Arvore<Integer> arvore = new Arvore<>();
        arvore.inserir(10);
        arvore.inserir(20);
        arvore.inserir(5);

        assertEquals(Integer.valueOf(10), arvore.getRaiz().getValor());
        assertEquals(Integer.valueOf(5), arvore.getRaiz().getEsquerda().getValor());
        assertEquals(Integer.valueOf(20), arvore.getRaiz().getDireita().getValor());
    }

    @Test
    public void testInsercaoComBalanceamento() {
        Arvore<Integer> arvore = new Arvore<>();
        arvore.inserir(30);
        arvore.inserir(20);
        arvore.inserir(10);

        assertEquals(Integer.valueOf(20), arvore.getRaiz().getValor());
        assertEquals(Integer.valueOf(10), arvore.getRaiz().getEsquerda().getValor());
        assertEquals(Integer.valueOf(30), arvore.getRaiz().getDireita().getValor());
    }

    @Test
    public void testRemocaoFolha() {
        Arvore<Integer> arvore = new Arvore<>();
        arvore.inserir(10);
        arvore.inserir(5);
        arvore.inserir(15);

        arvore.remover(5);
        assertNull(arvore.getRaiz().getEsquerda());
        assertEquals(Integer.valueOf(10), arvore.getRaiz().getValor());
        assertEquals(Integer.valueOf(15), arvore.getRaiz().getDireita().getValor());
    }

    @Test
    public void testRemocaoComFilhos() {
        Arvore<Integer> arvore = new Arvore<>();
        arvore.inserir(20);
        arvore.inserir(10);
        arvore.inserir(30);
        arvore.inserir(25);
        arvore.inserir(40);

        arvore.remover(30);

        assertEquals(Integer.valueOf(20), arvore.getRaiz().getValor());
        assertEquals(Integer.valueOf(40), arvore.getRaiz().getDireita().getValor());
        assertEquals(Integer.valueOf(25), arvore.getRaiz().getDireita().getEsquerda().getValor());
    }

    @Test
    public void testBalanceamentoRotacaoDireitaEsquerda() {
        Arvore<Integer> arvore = new Arvore<>();
        arvore.inserir(10);
        arvore.inserir(30);
        arvore.inserir(20);

        assertEquals(Integer.valueOf(20), arvore.getRaiz().getValor());
        assertEquals(Integer.valueOf(10), arvore.getRaiz().getEsquerda().getValor());
        assertEquals(Integer.valueOf(30), arvore.getRaiz().getDireita().getValor());
    }

    @Test
    public void testBalanceamentoRotacaoEsquerdaDireita() {
        Arvore<Integer> arvore = new Arvore<>();
        arvore.inserir(30);
        arvore.inserir(10);
        arvore.inserir(15);

        assertEquals(Integer.valueOf(15), arvore.getRaiz().getValor());
        assertEquals(Integer.valueOf(10), arvore.getRaiz().getEsquerda().getValor());
        assertEquals(Integer.valueOf(30), arvore.getRaiz().getDireita().getValor());
    }

}
