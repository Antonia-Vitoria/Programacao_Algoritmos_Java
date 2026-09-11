import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        // System.out.println("Digite o mês: ");
        // String mes = input.next();

        // switch (mes) {
        // case "1":
        // System.out.println("Janeiro");
        // break;

        // case "2":
        // System.out.println("Fevereiro");
        // break;

        // case "3":
        // System.out.println("Março");
        // break;

        // case "4":
        // System.out.println("Abril");
        // break;

        // case "5":
        // System.out.println("Maio");
        // break;

        // case "6":
        // System.out.println("Junho");
        // break;

        // case "7":
        // System.out.println("Julho");
        // break;

        // case "8":
        // System.out.println("Agosto");
        // break;

        // case "9":
        // System.out.println("Setembro");
        // break;

        // case "10":
        // System.out.println("Outubro");
        // break;

        // case "11":
        // System.out.println("Novembro");
        // break;

        // case "12":
        // System.out.println("Dezembro");
        // break;
        // default:
        // break;
        // }

        System.out.println("""
                Informe o dia da semana:
                1 - Domingo
                2 - Segunda
                3 - Terça
                4 - Quarta
                5 - Quinta
                6 - Sexta
                7 - Sabado
                """);

        int diaSemana = input.nextInt();

        switch (diaSemana) {
            case 1: {
                System.out.printf("Você escolheu %d, o dia da semana é Domingo", diaSemana);
            }
                break;
            case 2: {
                System.out.printf("Você escolheu %d, o dia da semana é Segunda", diaSemana);
            }
                break;

            case 3: {
                System.out.printf("Você escolheu %d, o dia da semana é Terça", diaSemana);
            }
                break;

            case 4: {
                System.out.printf("Você escolheu %d, o dia da semana é Quarta", diaSemana);
            }
                break;

            case 5: {
                System.out.printf("Você escolheu %d, o dia da semana é Quinta", diaSemana);
            }
                break;

            case 6: {
                System.out.printf("Você escolheu %d, o dia da semana é Sexta", diaSemana);
            }
                break;

            case 7: {
                System.out.printf("Você escolheu %d, o dia da semana é Sabado", diaSemana);
            }
                break;
            default: {
                System.out.println("Opção invalida");
            }
        }
    }
}
