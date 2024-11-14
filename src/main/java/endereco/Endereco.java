package endereco;

public class Endereco {
	
	private String numero;
	
	private Cep cep;
	
	private String complemento;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public Cep getCep() {
		return cep;
	}

	public void setCep(Cep cep) {
		this.cep = cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public Endereco(String numero, Cep cep, String complemento) {
		this.numero = numero;
		this.cep = cep;
		this.complemento = complemento;
	}

}
