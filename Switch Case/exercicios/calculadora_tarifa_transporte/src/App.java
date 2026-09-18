import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        boolean cont = true;
        double onibus_urbano, metro, trem, rodoviario, total;
        onibus_urbano = 4.40;
        metro = 5.00;
        trem = 6.50;
        rodoviario = 12.00;
        total = 0;

        while (cont) {

            System.out.println("Quantos bilhetes você quer? ");
            int bilhete = input.nextInt();

            System.out.println("""
                    Digite seu transporte:
                    1 - Para ônibus urbano R$4.40
                    2 - Para metrô R$5.00
                    3 - Para trem intermunicipal R$6.50
                    4 - Para ônibus rodoviário R$12.00
                    """);

            int opcao = input.nextInt();

            switch (opcao) {
                case 1 -> {
                    total = onibus_urbano * bilhete;
                    System.out.printf("O valor deu R$ %.2f\n", total); // SWITCH EXPRESSION NAO ULTILIZA BREAK!
                }

                case 2 -> {
                    total = metro * bilhete;
                    System.out.printf("O valor deu R$ %.2f\n", total);
                }
                    
                case 3 -> {
                    total = trem * bilhete;
                    System.out.printf("O valor deu R$ %.2f\n", total);
                }
                    
                case 4 -> {
                    total = rodoviario * bilhete;
                    System.out.printf("O valor deu R$ %.2f\n", total);
                }
                    
                default -> {
                    System.out.println("Opção inválida!\nEscolha opções de 1 ao 4!\n");
                }
                    
            }
            System.out.println("\nDigite 'E' para encerrar ou 'R' para reiniciar: ");
            String resp = input.next();

            // if (resp.equalsIgnoreCase("E")) {
            //     cont = false;
            //     System.out.println("Programa encerrado");
            // }

            if (resp == "E") {
                cont = false;
                System.out.println("Programa encerrado!");
            } else {
                cont = true;
            }
        }
        input.close();
    }
}
