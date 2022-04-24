package entidades;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private Integer id;
    private String nome;
    private String email;
    private String senha;

    public Usuario(Integer id, String nome, String email, String senha) {
        this.email = email;
        this.id = id;
        this.nome = nome;
        this.senha = senha;
    }

    public static List<Usuario> getUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario(1, "João", "joao@email.com", "123"));
        usuarios.add(new Usuario(2, "Pedro", "pedro@email.com", "123"));
        return usuarios;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
