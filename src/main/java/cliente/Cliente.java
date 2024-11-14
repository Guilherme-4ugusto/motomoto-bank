package cliente;

import java.time.LocalDateTime;

import endereco.Endereco;

public class Cliente implements Comparable<Cliente>{
	
	private int codCliente;
	
	private String nome;
	
	private String cpf;
	
	private String telefone;
	
	private String email;
	
	private LocalDateTime dtCadastro;
	
	private Endereco codEndereco;

	public int getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDateTime getDtCadastro() {
		return dtCadastro;
	}

	public void setDtCadastro(LocalDateTime dtCadastro) {
		this.dtCadastro = dtCadastro;
	}

	public Endereco getCodEndereco() {
		return codEndereco;
	}

	public void setCodEndereco(Endereco codEndereco) {
		this.codEndereco = codEndereco;
	}

	public Cliente(int codCliente, String nome, String cpf, String telefone, String email, LocalDateTime dtCadastro,
			Endereco codEndereco) {
		this.codCliente = codCliente;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.dtCadastro = dtCadastro;
		this.codEndereco = codEndereco;
	}

	public Cliente(String nome, String cpf, String telefone, String email, Endereco codEndereco) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.codEndereco = codEndereco;
	}

	@Override
	public int compareTo(Cliente outroCliente) {
		return this.cpf.compareTo(outroCliente.cpf);
	}

}
