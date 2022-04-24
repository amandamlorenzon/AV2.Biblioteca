package servicos;

public class MenuService extends MenuAbstractService {
    public static String render(Boolean logado) {
        StringBuilder sb = new StringBuilder();
        sb.append("Selecione uma das opções\n");
        if (!logado) {
            sb.append("1 - Logar\n");
        } else {
            sb.append("2 - Listar livros\n");
            sb.append("3 - Alugar livro\n");
            sb.append("4 - Sair\n");
        }
        return sb.toString();
    }
}
