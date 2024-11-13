package enums;

public enum Status {
    ATIVA("AT"),
    INATIVA("IT");

    private String descricao;

    Status(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
