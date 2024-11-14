package cartao;

import fatura.Fatura;

import java.math.BigDecimal;
import java.util.List;

public class CartaoService {
    public static void realizarCompra(Cartao cartao, BigDecimal valor, List<Fatura> faturas) throws Exception {
        if (cartao.getLimiteDisponivel().compareTo(valor)  < 0) throw new Exception("Compra negada!! Saldo insuficiente!!");
        cartao.setLimiteDisponivel(cartao.getLimiteDisponivel().subtract(valor));
    }
}
