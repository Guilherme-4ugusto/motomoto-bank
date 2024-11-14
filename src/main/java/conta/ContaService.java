package conta;

import enums.Status;
import enums.TipoConta;
import enums.TipoTransacao;
import transacao.Transacao;
import transacao.TransacaoService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContaService {
    public static ArrayList<Conta> abrirConta(Integer codCliente, TipoConta tpConta, Integer codAgencia, ArrayList<Conta> contas){
        Conta novaConta = new Conta(contas.size() + 1, codCliente, tpConta, new Date(), codAgencia, new BigDecimal(0), Status.ATIVA);
        contas.add(novaConta);
        return contas;
    }

    public static void realizarDeposito(Conta conta, BigDecimal valor, List<Transacao> transacoes) throws Exception {
        if (valor.signum() == -1) throw new Exception("O valor do deposito não pode ser negativo!!");
        conta.setSaldo(conta.getSaldo().add(valor));
        TransacaoService.registrarTransacao(conta.getCodConta(), valor, TipoTransacao.ENTRADA, transacoes);
    }

    public static void realizarSaque(Conta conta, BigDecimal valor, List<Transacao> transacoes) throws Exception {
        if (conta.getSaldo().compareTo(valor) < 0) throw new Exception("O valor do saque é maior que o malor em conta!!");
        conta.setSaldo(conta.getSaldo().subtract(valor));
        TransacaoService.registrarTransacao(conta.getCodConta(), valor, TipoTransacao.SAIDA, transacoes);
    }
}
