package transacao;

import enums.TipoTransacao;

import java.math.BigDecimal;
import java.util.Date;

public class Transacao {
    private Integer codTransacao;
    private Integer codConta;
    private BigDecimal vlTransacao;
    private TipoTransacao tpTransacao;
    private Date dtTransacao;

    public Transacao(Integer codTransacao, Integer codConta, BigDecimal vlTransacao, TipoTransacao tpTransacao, Date dtTransacao) {
        this.codTransacao = codTransacao;
        this.codConta = codConta;
        this.vlTransacao = vlTransacao;
        this.tpTransacao = tpTransacao;
        this.dtTransacao = dtTransacao;
    }

    public TipoTransacao getTpTransacao() {
        return tpTransacao;
    }

    public void setTpTransacao(TipoTransacao tpTransacao) {
        this.tpTransacao = tpTransacao;
    }

    public BigDecimal getVlTransacao() {
        return vlTransacao;
    }

    public void setVlTransacao(BigDecimal vlTransacao) {
        this.vlTransacao = vlTransacao;
    }

    public Integer getCodConta() {
        return codConta;
    }

    public void setCodConta(Integer codConta) {
        this.codConta = codConta;
    }

    public Integer getCodTransacao() {
        return codTransacao;
    }

    public void setCodTransacao(Integer codTransacao) {
        this.codTransacao = codTransacao;
    }

    public Date getDtTransacao() {
        return dtTransacao;
    }

    public void setDtTransacao(Date dtTransacao) {
        this.dtTransacao = dtTransacao;
    }
}
