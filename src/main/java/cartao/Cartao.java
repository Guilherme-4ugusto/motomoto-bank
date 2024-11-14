package cartao;

import java.math.BigDecimal;

public class Cartao {
    private Integer codCartao;
    private Integer codConta;
    private BigDecimal limiteTotal;
    private BigDecimal limiteDisponivel;

    public Cartao(Integer codCartao, Integer codConta, BigDecimal limiteTotal, BigDecimal limiteDisponivel) {
        this.codCartao = codCartao;
        this.codConta = codConta;
        this.limiteTotal = limiteTotal;
        this.limiteDisponivel = limiteDisponivel;
    }

    public Integer getCodCartao() {
        return codCartao;
    }

    public void setCodCartao(Integer codCartao) {
        this.codCartao = codCartao;
    }

    public Integer getCodConta() {
        return codConta;
    }

    public void setCodConta(Integer codConta) {
        this.codConta = codConta;
    }

    public BigDecimal getLimiteTotal() {
        return limiteTotal;
    }

    public void setLimiteTotal(BigDecimal limiteTotal) {
        this.limiteTotal = limiteTotal;
    }

    public BigDecimal getLimiteDisponivel() {
        return limiteDisponivel;
    }

    public void setLimiteDisponivel(BigDecimal limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
    }
}
