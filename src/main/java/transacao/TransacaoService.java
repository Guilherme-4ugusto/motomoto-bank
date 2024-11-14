package transacao;

import enums.TipoTransacao;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class TransacaoService {

    public static List<Transacao> registrarTransacao(Integer codConta, BigDecimal valor, TipoTransacao tpTransasao, List<Transacao> transacoes){
        Transacao transacao = new Transacao(transacoes.size()+1, codConta, valor, tpTransasao, new Date());
        transacoes.add(transacao);
        return transacoes;
    }
}
