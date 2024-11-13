package usuario;

import enums.Status;

public class Usuario {
    private Integer codUsuario;
    private Integer codConta;
    private Status status;
    private String usuario;
    private String senha;

    public Usuario(Integer codUsuario, Integer codConta, Status status, String usuario, String senha) {
        this.codUsuario = codUsuario;
        this.codConta = codConta;
        this.status = status;
        this.usuario = usuario;
        this.senha = senha;
    }

    public Integer getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Integer codUsuario) {
        this.codUsuario = codUsuario;
    }

    public Integer getCodCliente() {
        return codConta;
    }

    public void setCodConta(Integer codConta) {
        this.codConta = codConta;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
