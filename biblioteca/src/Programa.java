import entidades.Livro;
import servicos.MenuService;
import servicos.impl.LivroServiceImpl;
import servicos.impl.LoginServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Programa {

    private Boolean logado = false;
    private List<Livro> alugados = new ArrayList<>();

    private LivroServiceImpl livroService = new LivroServiceImpl();
    private LoginServiceImpl loginService = new LoginServiceImpl();

    public static void main(String[] args) {
        Programa programa = new Programa();
        programa.chamarMenu();
    }

    public void chamarMenu() {
        renderizaMenu();
        Scanner sc = new Scanner(System.in);
        int opcao = sc.nextInt();
        executarMenu(opcao);
    }

    public void executarMenu(Integer opcao) {
        Scanner sc = new Scanner(System.in);
        Integer livro;
        String email;
        String senha;

        if (opcao.equals(1) && logado) {
            System.out.println("Opção indisponível, usuário logado");
            chamarMenu();
            return;
        }

        if (opcao > 1 && !logado) {
            System.out.println("Para utilizar o sistema, deve estar logado");
            opcao = 1;
        }

        switch (opcao) {
            case 1:
                System.out.println("Digite o email");
                email = sc.nextLine();
                System.out.println("Digite a senha");
                senha = sc.nextLine();
                logado = loginService.logar(email, senha);
                if (logado) {
                    System.out.println("Logado com sucesso");
                } else {
                    System.out.println("Falha ao logar");
                }
                break;
            case 2:
                System.out.println(livroService.listarLivros());
                break;
            case 3:
                System.out.println("Digite o ID do livro desejado");
                livro = sc.nextInt();
                Livro alugado = livroService.alugar(livro);
                if (Objects.nonNull(alugado)) {
                    alugados.add(alugado);
                    System.out.println("Alugado com sucesso");
                } else {
                    System.out.println("Livro não encontrado");
                }
                System.out.println("\n Livros alugados");
                System.out.println(livroService.listarLivros(alugados));
                break;
            case 4:
                logado = false;
                alugados = new ArrayList<>();
                break;
            default:
                System.out.println("Opção invalida");
        }
        chamarMenu();
    }

    public void renderizaMenu() {
        System.out.println(MenuService.render(logado));
    }
}
