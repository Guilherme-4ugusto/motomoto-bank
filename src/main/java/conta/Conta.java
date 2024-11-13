package conta;

import enums.Status;
import enums.TipoConta;

import java.math.BigDecimal;
import java.util.Date;

public class Conta {
    private Integer codConta;
    private Integer codCliente;
    private TipoConta tipoConta;
    private Date dtAbertura;
    private Integer codAgencia;
    private BigDecimal saldo;
    private Status status;

    public Conta(Integer codConta, Integer codCliente, TipoConta tipoConta, Date dtAbertura, Integer codAgencia, BigDecimal saldo, Status status) {
        this.codConta = codConta;
        this.codCliente = codCliente;
        this.tipoConta = tipoConta;
        this.dtAbertura = dtAbertura;
        this.codAgencia = codAgencia;
        this.saldo = saldo;
        this.status = status;
    }

    public Integer getCodConta() {
        return codConta;
    }

    public void setCodConta(Integer codConta) {
        this.codConta = codConta;
    }

    public Integer getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(Integer codCliente) {
        this.codCliente = codCliente;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    public Date getDtAbertura() {
        return dtAbertura;
    }

    public void setDtAbertura(Date dtAbertura) {
        this.dtAbertura = dtAbertura;
    }

    public Integer getCodAgencia() {
        return codAgencia;
    }

    public void setCodAgencia(Integer codAgencia) {
        this.codAgencia = codAgencia;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
