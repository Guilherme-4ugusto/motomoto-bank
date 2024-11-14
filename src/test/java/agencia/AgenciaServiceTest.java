package agencia;

import endereco.Cep;
import endereco.Endereco;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AgenciaServiceTest {

    private AgenciaService agenciaService;
    private Endereco endereco1;
    private Endereco endereco2;

    @Before
    public void setUp() {
        agenciaService = new AgenciaService();
        endereco1 = new Endereco("123", new Cep("49030160", "Farolandia", "Rua A", "Aracaju", "SE"), "Fim de mundo");
        endereco2 = new Endereco("123", new Cep("49030160", "Farolandia", "Rua B", "Aracaju", "SE"), "Fim de mundo 2");
    }

    @Test
    public void testCriarAgencia() {
        agenciaService.criarAgencia(endereco1, "Agencia Central");

        assertEquals(1, agenciaService.getTamanho());
        assertEquals("Agencia Central", agenciaService.buscarAgencia(0).getNome());
        assertEquals(endereco1, agenciaService.buscarAgencia(0).getEndereco());
    }

    @Test
    public void testCriarAgenciaComMaisDeUma() {
        agenciaService.criarAgencia(endereco1, "Agencia Central");
        agenciaService.criarAgencia(endereco2, "Agencia Norte");

        assertEquals(2, agenciaService.getTamanho());
        assertEquals("Agencia Norte", agenciaService.buscarAgencia(1).getNome());
        assertEquals(endereco2, agenciaService.buscarAgencia(1).getEndereco());
    }

    @Test
    public void testRemoverAgencia() {
        agenciaService.criarAgencia(endereco1, "Agencia Central");
        agenciaService.criarAgencia(endereco2, "Agencia Norte");

        Agencia agenciaParaRemover = agenciaService.buscarAgencia(0);

        agenciaService.removerAgencia(agenciaParaRemover);
        assertEquals(1, agenciaService.getTamanho());
        assertEquals("Agencia Norte", agenciaService.buscarAgencia(0).getNome());
    }

    @Test
    public void testRemoverAgenciaInexistente() {
        agenciaService.criarAgencia(endereco1, "Agencia Central");
        Agencia agenciaInexistente = new Agencia(99, endereco2, "Agencia Falsa");
        agenciaService.removerAgencia(agenciaInexistente);
        assertEquals(1, agenciaService.getTamanho());
    }
}
