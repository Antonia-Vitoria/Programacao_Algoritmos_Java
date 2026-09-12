import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos bilhetes você quer? ");
        int bilhete = input.nextInt();

        double onibus_urbano, metro, trem, rodoviario, total;
        onibus_urbano = 4.40;
        metro = 5.00;
        trem = 6.50;
        rodoviario = 12.00;
        total = 0;

        System.out.println("""
                Digite seu transporte:
                1 - Para ônibus urbano
                2 - Para metrô
                3 - Para trem intermunicipal
                4 - Para ônibus rodoviário
                """);

        int opcao = input.nextInt();

        switch (opcao) {
            case 1: {
                total = onibus_urbano * bilhete;
                System.out.printf("O valor deu R$ %.2f\n", total);
            }
                break;
            case 2: {
                total = metro * bilhete;
                System.out.printf("O valor deu R$ %.2f\n", total);
            }
                break;
            case 3: {
                total = trem * bilhete;
                System.out.printf("O valor deu R$ %.2f\n", total);
            }
                break;
            case 4: {
                total = rodoviario * bilhete;
                System.out.printf("O valor deu R$ %.2f\n", total);
            }
                break;
            default: {
                System.out.println("Opção inválida!");
            }
                break;
        }

        input.close();
    }
}
