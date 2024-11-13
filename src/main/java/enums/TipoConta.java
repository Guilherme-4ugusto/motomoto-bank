package enums;

public enum TipoConta {
    CORRENTE("CC"),
    POUPANCA("CP");

    private String descricao;

    TipoConta(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
