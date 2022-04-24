package servicos.impl;

import entidades.Livro;
import servicos.LivroService;

import java.util.List;
import java.util.Optional;

public class LivroServiceImpl implements LivroService {
    @Override
    public String listarLivros() {
        List<Livro> livros = Livro.getLivros();
        return listarLivros(livros);
    }

    @Override
    public String listarLivros(List<Livro> livros) {
        StringBuilder sb = new StringBuilder();
        livros.forEach(l -> {
            sb.append(String.format("ID: %d - Nome: %s - Categoria: %s\n", l.getId(), l.getNome(), l.getCategoria().getNome()));
        });
        return sb.toString();
    }

    @Override
    public Livro alugar(Integer id) {
        List<Livro> livros = Livro.getLivros();
        Optional<Livro> livro = livros.stream().filter(l -> id.equals(id)).findFirst();
        return livro.isPresent() ? livro.get() : null;
    }
}
