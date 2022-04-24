package servicos.impl;

import entidades.Usuario;
import servicos.LoginService;

import java.util.List;
import java.util.Optional;

public class LoginServiceImpl implements LoginService {

    @Override
    public Boolean logar(String email, String senha) {
        List<Usuario> usuarios = Usuario.getUsuarios();
        Optional<Usuario> usuario = usuarios.stream().filter(u -> email.equals(email)).findFirst();
        if (usuario.isPresent()) {
            return senha.equals(usuario.get().getSenha());
        }
        return false;
    }
}
