import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        ArrayList<String> listaFilmes = new ArrayList<>();

        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨ BEM - VINDO A SUA LISTA DE FILMES ¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");

        System.out.println("""
                    Escolha a opção desejada:
                    1 - Cadastrar um novo filme ou série.
                    2 - Visualizar todos os títulos já cadastrados.
                    3 - Alterar um filme ou sérieda sua lista.
                    4 - Excluir um título da lista.
                    5 - Apagar a lista.
                    6 - Sair do programa.
                """);
        int opcao = input.nextInt();

        do {
            switch (opcao) {
                case 1: {
                    System.out.println("Digite o nome do Filme/Série:");
                    String novoItem = input.nextLine();
                    listaFilmes.add(novoItem);

                }
                case 2: {
                    if (listaFilmes.isEmpty() == true) {
                        System.out.println("""
                                    ERROR
                                    Sua lista está vazia
                                    Adicione um item paara visualizar
                                """);
                    } else {
                        System.out.println("====== LISTA DE FILMES E SÉRIES PARA ASSISTIR ======");

                        for (int i = 0; i < listaFilmes.size(); i++) {
                            System.out.printf("%d° - %s\n", i + 1, listaFilmes.get(i));
                        }
                    }
                }
                case 3: {
                    System.out.println("""
                                Você escolheu alterar um item da lista
                                Escolha o número que você quer alterar:
                            """);
                    for (int i = 0; i < listaFilmes.size(); i++) {
                        System.out.printf("%d - %s\n", i + 1, listaFilmes.get(i));
                    }
                    int alterarFilme = input.nextInt();
                    input.nextLine();

                    System.out.println("\nDigite o nome do novo título:\n");
                    String novoTitulo = input.nextLine();

                    listaFilmes.set(alterarFilme - 1, novoTitulo);

                    System.out.println("\nNome alterado com sucesso!!\n");

                    System.out.println("===== LISTA DE FILMES E SÉRIES PARA ASSISTIR =====\n");

                    for (int i = 0; i < listaFilmes.size(); i++) {
                        System.out.printf("%d - %s\n", i + 1, listaFilmes.get(i));
                    }
                }
                default:
                    System.out.println("Erro!\nTente outra opção.");
                    break;
            }
        } while (opcao != 5);

        input.close();
    }
}
