package agencia;

import java.util.ArrayList;

import endereco.Endereco;

public class AgenciaService {
	
	private ArrayList<Agencia> agencias = new ArrayList<Agencia>();
	
	
	public void criarAgencia(Endereco endereco, String nome) {
		agencias.add(new Agencia(agencias.size(), endereco, nome));
	}
	
	public void removerAgencia(Agencia agencia) {
	    agencias.removeIf(a -> a.getCodAgencia() == agencia.getCodAgencia());
	}
	
	public int getTamanho() {
		return agencias.size();
	}
	
	public Agencia buscarAgencia(int codigo) {
		return agencias.get(codigo);
	}

}
