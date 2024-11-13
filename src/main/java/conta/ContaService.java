package conta;

import enums.Status;
import enums.TipoConta;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

public class ContaService {
    public static ArrayList<Conta> abrirConta(Integer codCliente, TipoConta tpConta, Integer codAgencia, ArrayList<Conta> contas){
        Conta novaConta = new Conta(contas.size() + 1, codCliente, tpConta, new Date(), codAgencia, new BigDecimal(0), Status.ATIVA);
        contas.add(novaConta);
        return contas;
    }

    public void realizarDeposito(Conta conta, BigDecimal valor){

    }
}
