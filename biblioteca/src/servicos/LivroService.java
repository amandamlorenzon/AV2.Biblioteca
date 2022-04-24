package servicos;

import entidades.Livro;

import java.util.List;

public interface LivroService {
    String listarLivros();
    String listarLivros(List<Livro> livros);
    Livro alugar(Integer id);
}
