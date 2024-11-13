package usuario;

import enums.Status;

import java.util.ArrayList;
import java.util.List;

public class UsuarioService {

    public static ArrayList<Usuario> criarUsuario(ArrayList<Usuario> usuarios, String usuario, String senha, Integer codConta) throws Exception {
        if(existeUsuarioParaAConta(usuarios, codConta)) throw new Exception("Já existe um usuario associado a essa conta!!");

        if(isUsuarioJaCadastrado(usuarios, usuario)) throw new Exception("Esse usuario já está em uso reinicie o cadastro utilizando outro!!");

        Usuario usr = new Usuario(usuario.length()+1, codConta, Status.ATIVA, usuario, senha);
        usuarios.add(usr);
        return usuarios;
    }

    private static boolean existeUsuarioParaAConta(List<Usuario> usuarios, Integer codConta){
        for (Usuario usuario : usuarios){
            if(usuario.getCodCliente() == codConta) return true;
        }
        return false;
    }

    private static boolean isUsuarioJaCadastrado(List<Usuario> usuarios, String login){
        for (Usuario usuario : usuarios){
            if(usuario.getUsuario() == login) return true;
        }
        return false;
    }

    public static boolean realizarLogin(String login, String senha, List<Usuario> usuarios){
        for (Usuario usr : usuarios){
            if(usr.getUsuario() == login && usr.getSenha() == senha){
                return true;
            }
        }
        return false;
    }
}
