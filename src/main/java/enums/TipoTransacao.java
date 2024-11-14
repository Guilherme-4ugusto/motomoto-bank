package enums;

public enum TipoTransacao {
    ENTRADA("EN"),
    SAIDA("SA");

    private String descricao;

    TipoTransacao(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
