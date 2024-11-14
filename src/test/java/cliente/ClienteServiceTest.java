package cliente;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import endereco.Cep;
import endereco.Endereco;

public class ClienteServiceTest {
    private ClienteService clienteService;
    private Endereco endereco;

    @Before
    public void setUp() {
        clienteService = new ClienteService();
        endereco = new Endereco("123", new Cep("49030160", "Farolandia", "Rua A", "Aracaju", "SE"), "Fim de mundo");
    }

    @Test
    public void testInserirCliente() {
        clienteService.inserirCliente("João", "12345678901", "999999999", "joao@email.com", endereco);

        Cliente clienteBuscado = clienteService.buscarCliente("12345678901");
        
        assertNotNull(clienteBuscado);
        assertEquals("João", clienteBuscado.getNome());
        assertEquals("12345678901", clienteBuscado.getCpf());
    }
    
    @Test
    public void testRemoverCliente() {
        clienteService.inserirCliente("João", "12345678901", "999999999", "joao@email.com", endereco);

        Cliente clienteRemovido = clienteService.buscarCliente("12345678901");
        assertNotNull(clienteRemovido);
        clienteService.removerCliente("12345678901");
        clienteRemovido = clienteService.buscarCliente("12345678901");
        assertNull(clienteRemovido);
        
    }
    
    @Test
    public void testBuscarCliente() {
        clienteService.inserirCliente("João", "12345678901", "999999999", "joao@email.com", endereco);

        Cliente clienteBuscado = clienteService.buscarCliente("12345678901");

        assertNotNull(clienteBuscado);
        assertEquals("João", clienteBuscado.getNome());
    }
    
    @Test
    public void testAtualizarCliente() {
        clienteService.inserirCliente("João", "12345678901", "999999999", "joao@email.com", endereco);

        Cliente clienteExistente = clienteService.buscarCliente("12345678901");
        
        assertNotNull(clienteExistente);
        assertEquals("João", clienteExistente.getNome());
        clienteExistente.setNome("João Silva");
        clienteExistente.setTelefone("888888888");
        clienteExistente.setEmail("joaosilva@email.com");

        clienteService.atualizarCliente(clienteExistente);

        Cliente clienteAtualizado = clienteService.buscarCliente("12345678901");
        assertNotNull(clienteAtualizado);
        assertEquals("João Silva", clienteAtualizado.getNome());
        assertEquals("888888888", clienteAtualizado.getTelefone());
        assertEquals("joaosilva@email.com", clienteAtualizado.getEmail());
    }
    
    @Test
    public void testBuscarClienteNaoEncontrado() {
        Cliente clienteBuscado = clienteService.buscarCliente("99999999999");

        assertNull(clienteBuscado);
    }
    
    
    @Test
    public void testAtualizarClienteNaoEncontrado() {
        ByteArrayOutputStream saidaCapturada = new ByteArrayOutputStream();
        System.setOut(new PrintStream(saidaCapturada));

        Cliente clienteInexistente = new Cliente("Carlos", "99999999999", "888888888", "carlos@email.com", endereco);
        
        clienteService.atualizarCliente(clienteInexistente);

        Cliente clienteBuscado = clienteService.buscarCliente("99999999999");

        assertNull(clienteBuscado);
        assertTrue(saidaCapturada.toString().contains("Cliente não localizado"));

        System.setOut(System.out);
    }
    
    @Test
    public void testInserirVariosClientes() {
        clienteService.inserirCliente("João", "12345678901", "999999999", "joao@email.com", endereco);
        clienteService.inserirCliente("Maria", "98765432100", "888888888", "maria@email.com", endereco);

        Cliente clienteJoao = clienteService.buscarCliente("12345678901");
        Cliente clienteMaria = clienteService.buscarCliente("98765432100");

        assertNotNull(clienteJoao);
        assertNotNull(clienteMaria);
        assertEquals("João", clienteJoao.getNome());
        assertEquals("Maria", clienteMaria.getNome());
    }
    
}
