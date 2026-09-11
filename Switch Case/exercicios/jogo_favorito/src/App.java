import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("""
                Digite seu nome favorito:
                1 - Minecraft
                2 - FIFA
                3 - Fortnite
                4 - Call of Duty
                5 - The Sims
                """);
        int jogo = input.nextInt();

        switch (jogo) {
            case 1: {
                System.out.printf("Você escolheu %d, seu jogo favorito é Minecraft\n", jogo);
                break;
            }
            case 2: {
                System.out.printf("Você escolheu %d, seu jogo favorito é FIFA\n", jogo);
                break;
            }
            case 3: {
                System.out.printf("Você escolheu %d, seu jogo favorito é Fortnite\n", jogo);
                break;
            }
            case 4: {
                System.out.printf("Você escolheu %d, seu jogo favorito é Call of Duty\n", jogo);
                break;
            }
            case 5: {
                System.out.printf("Você escolheu %d, seu jogo favorito é The Sims\n", jogo);
                break;
            }
            default: {
                System.out.println("Jogo não encontrado escolha opção de 1 ao 5\n");
            }

        }
        input.close();
    }
}
