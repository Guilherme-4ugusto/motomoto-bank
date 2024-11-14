package cliente;

import java.time.LocalDateTime;

import avl.Arvore;
import endereco.Endereco;

public class ClienteService {
	
	Arvore<Cliente> listaCliente = new Arvore<Cliente>();
	
	public void inserirCliente(String nome, String cpf, String telefone, String email,
			Endereco codEndereco) {
		listaCliente.inserir(new Cliente(listaCliente.getTamanho()+1 ,nome,  cpf,  telefone,  email,  LocalDateTime.now(),
			 codEndereco));
	}
	
	public void removerCliente(String cpf) {
		Cliente clienteRemovido = new Cliente(0, null, cpf, null, null, null, null);
		listaCliente.remover(clienteRemovido);
	}
	
	public Cliente buscarCliente(String cpf) {
		Cliente clienteProcurado = new Cliente(0, null, cpf, null, null, null, null);
        return listaCliente.buscar(clienteProcurado);
	}
	
	public void atualizarCliente(Cliente cliente) {
		Cliente clienteAntigo = buscarCliente(cliente.getCpf());
		if (clienteAntigo != null) {
			atualizarDados(cliente, clienteAntigo);
		} else {
			System.out.println("Cliente não localizado");
		}

	}
	
	private void atualizarDados(Cliente dadosNovos, Cliente dadosAntigo) {
		dadosAntigo.setCodEndereco(dadosNovos.getCodEndereco());
		dadosAntigo.setEmail(dadosNovos.getEmail());
		dadosAntigo.setTelefone(dadosNovos.getTelefone());
		dadosAntigo.setNome(dadosNovos.getNome());
	}

}
