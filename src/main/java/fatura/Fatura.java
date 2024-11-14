package fatura;

import java.math.BigDecimal;
import java.util.Date;

public class Fatura {
    private Integer codCartao;
    private Integer codFatura;
    private Date dtFatura;
    private Date dtFechamento;
    private BigDecimal valor;

    public Fatura(Integer codCartao, Integer codFatura, Date dtFatura, Date dtFechamento, BigDecimal valor) {
        this.codCartao = codCartao;
        this.codFatura = codFatura;
        this.dtFatura = dtFatura;
        this.dtFechamento = dtFechamento;
        this.valor = valor;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Date getDtFechamento() {
        return dtFechamento;
    }

    public void setDtFechamento(Date dtFechamento) {
        this.dtFechamento = dtFechamento;
    }

    public Date getDtFatura() {
        return dtFatura;
    }

    public void setDtFatura(Date dtFatura) {
        this.dtFatura = dtFatura;
    }

    public Integer getCodFatura() {
        return codFatura;
    }

    public void setCodFatura(Integer codFatura) {
        this.codFatura = codFatura;
    }

    public Integer getCodCartao() {
        return codCartao;
    }

    public void setCodCartao(Integer codCartao) {
        this.codCartao = codCartao;
    }
}

