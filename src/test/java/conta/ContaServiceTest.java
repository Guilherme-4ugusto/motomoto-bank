package conta;

import enums.TipoConta;
import org.junit.Test;
import transacao.Transacao;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class ContaServiceTest {

    ArrayList<Conta> contas = new ArrayList<>();

    ArrayList<Transacao> transacoes = new ArrayList<>();

    @Test
    public void deveRetornarUmAposCriarAConta() throws Exception {
        contas = ContaService.abrirConta(1, TipoConta.CORRENTE, 1, contas);
        assertEquals(1, contas.size());
    }

    @Test
    public void deveRetornarQuinhentos() throws Exception {
        contas = ContaService.abrirConta(1, TipoConta.CORRENTE, 1, contas);
        ContaService.realizarDeposito(contas.get(0), new BigDecimal(500), transacoes);
        assertEquals(contas.get(0).getSaldo(), new BigDecimal(500));
    }

    @Test
    public void deveRetornarExceptionDepositoNegativo() throws Exception {
        contas = ContaService.abrirConta(1, TipoConta.CORRENTE, 1, contas);
        assertThrows(Exception.class, () -> {
            ContaService.realizarDeposito(contas.get(0), new BigDecimal(-1), transacoes);
        });
    }

    @Test
    public void deveRetornarTrezentos() throws Exception {
        contas = ContaService.abrirConta(1, TipoConta.CORRENTE, 1, contas);
        ContaService.realizarDeposito(contas.get(0), new BigDecimal(500), transacoes);
        ContaService.realizarSaque(contas.get(0), new BigDecimal(200), transacoes);
        assertEquals(contas.get(0).getSaldo(), new BigDecimal(300));
    }

    @Test
    public void deveRetornarExceptionSaqueMaiorQueSaldo() throws Exception {
        contas = ContaService.abrirConta(1, TipoConta.CORRENTE, 1, contas);
        ContaService.realizarDeposito(contas.get(0), new BigDecimal(1), transacoes);
        assertThrows(Exception.class, () -> {
            ContaService.realizarSaque(contas.get(0), new BigDecimal(2), transacoes);
        });
    }
}
