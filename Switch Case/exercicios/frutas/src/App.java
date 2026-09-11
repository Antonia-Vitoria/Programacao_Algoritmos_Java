import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("""
                Digite seua fruta:
                1 - Maçã
                2 - Uva
                3 - Manga
                """);
        int fruta = input.nextInt();

        switch (fruta) {
            case 1: {
                System.out.printf("Você escolheu %d sua fruta é Maçã\n", fruta);
                break;
            }

            case 2: {
                System.out.printf("Você escolheu %d sua fruta é Uva\n", fruta);
                break;
            }

            case 3: {
                System.out.printf("Você escolheu %d sua fruta é Manga\n", fruta);
                break;
            }
            default: {
                System.out.println("Opção invalida\n");
            }

        }
        input.close();
    }
}
