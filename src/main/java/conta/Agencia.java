package conta;

import endereco.Endereco;

public class Agencia {
	
	private int codAgencia;
	
	private Endereco endereco;
	
	private String nome;

	public int getCodAgencia() {
		return codAgencia;
	}

	public void setCodAgencia(int codAgencia) {
		this.codAgencia = codAgencia;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Agencia(int codAgencia, Endereco endereco, String nome) {
		this.codAgencia = codAgencia;
		this.endereco = endereco;
		this.nome = nome;
	}
}
