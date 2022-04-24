package entidades;

import java.util.ArrayList;
import java.util.List;

public class Livro {
    private Integer id;
    private String nome;
    private String descricao;
    private Categoria categoria;

    public Livro(Integer id, String nome, String descricao, Categoria categoria) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
    }

    public static List<Livro> getLivros() {
        List<Livro> livros = new ArrayList<>();
        livros.add(new Livro(1, "Cravo e a Rosa", "Livro xpto", new Categoria("Livros tipo 1")));
        livros.add(new Livro(2, "Livro Abc", "Livro abc", new Categoria("Livros tipo 2")));
        return livros;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
