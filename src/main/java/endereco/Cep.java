package endereco;

public class Cep {
	
	private String numero;
	
	private String bairro;
	
	private String logradouro;
	
	private String cidade;
	
	private String uf;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public Cep(String numero, String bairro, String logradouro, String cidade, String uf) {
		this.numero = numero;
		this.bairro = bairro;
		this.logradouro = logradouro;
		this.cidade = cidade;
		this.uf = uf;
	}


}
