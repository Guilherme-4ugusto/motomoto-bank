package conta;

import enums.Status;
import enums.TipoConta;
import org.junit.Assert;
import org.junit.Test;
import usuario.Usuario;
import usuario.UsuarioService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

public class ContaServiceTest {

    @Test
    public void deveRetornarUmAposCriarAConta() throws Exception {
        ArrayList<Conta> contas = new ArrayList<>();
        contas = ContaService.abrirConta(1, TipoConta.CORRENTE, 1, contas);
        Assert.assertEquals(1, contas.size());
    }
}
