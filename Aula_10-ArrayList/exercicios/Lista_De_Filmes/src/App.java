import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

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
                    5 - Sair do programa.
                """);
        int opcao = input.nextInt();

        switch (opcao) {
            case 1: {
                System.out.println("Digite o nome do Filme/Série:");
                String nomoItem = input.nextLine();
                listaFilmes.add(nomoItem);

                
            }
                break;

            case 2: {

            }
                break;

            case 3: {

            }
                break;

            case 4: {

            }
                break;

            case 5: {

            }
                break;

            default:
                System.out.println("Erro!\nTente outra opção.");
                break;
        }

        input.close();
    }
}
