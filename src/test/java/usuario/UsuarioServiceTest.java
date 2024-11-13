package usuario;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;


import static org.junit.Assert.assertThrows;

public class UsuarioServiceTest {
    @Test
    public void deveRetornarUmAposCriarOUsuario() throws Exception {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios = UsuarioService.criarUsuario(usuarios, "guilherme", "1234", 1);
        Assert.assertEquals(1, usuarios.size());
    }

    @Test
    public void deveRetornarQueJaExisteOUsuario() throws Exception {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios = UsuarioService.criarUsuario(usuarios, "guilherme", "1234", 1);
        ArrayList<Usuario> finalUsuarios = usuarios;
        assertThrows(Exception.class, () -> {
            UsuarioService.criarUsuario(finalUsuarios, "guilherme", "1234", 2);
        });
    }

    @Test
    public void deveRetornarQueJaExisteUsuarioParaAConta() throws Exception {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios = UsuarioService.criarUsuario(usuarios, "guilherme", "1234", 1);
        ArrayList<Usuario> finalUsuarios = usuarios;
        assertThrows(Exception.class, () -> {
            UsuarioService.criarUsuario(finalUsuarios, "guilherme2", "1234", 1);
        });
    }

    @Test
    public void deveRetornarTrueParaLogado() throws Exception {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios = UsuarioService.criarUsuario(usuarios, "guilherme", "1234", 1);
        Boolean isUsrLogado = UsuarioService.realizarLogin("guilherme", "1234", usuarios);
        Assert.assertTrue(isUsrLogado);
    }

    @Test
    public void deveRetornarFalseParaLogado() throws Exception {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        usuarios = UsuarioService.criarUsuario(usuarios, "guilherme", "1234", 1);
        Boolean isUsrLogado = UsuarioService.realizarLogin("guilherme", "12346", usuarios);
        Assert.assertFalse(isUsrLogado);
    }
}
