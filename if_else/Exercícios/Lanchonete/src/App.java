import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.err.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨ LANCHONETE ¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");

        System.out.println(
                " BEM - VINDOS A NOSSA LANCHONETE !!\n DE UMA OLHADA QUALQUER SABOR DE HAMBURGUER OU REFRIGERANTE POR UM PREÇO ÚNICO!!:\n Hamburguer: 18,00\n Refrigerante: 7,00");

        Scanner input = new Scanner(System.in);

        double hamburguer, total, refri;
        int quantidade_refri, quantidade_hamburguer;
        refri = 7;
        hamburguer = 18;
        total = 0;

        Thread.sleep(4000);
        System.out.printf("Você gostaria de refrigerante? (SIM/NAO) ");
        String resp = input.next().toUpperCase().trim();


        if (resp.equals("SIM")) {

            System.out.println("Digite quantos você quer: ");
            quantidade_refri = input.nextInt();
            total += quantidade_refri * refri;

            System.out.println("Ok...Processando...");
            Thread.sleep(2000); // 1.5 segundos

            System.out.println("Digite quantos hambúgueres você quer: ");
            quantidade_hamburguer = input.nextInt();
            total += quantidade_hamburguer * hamburguer;
            System.out.println("Preparando pedido...");
            Thread.sleep(1700);

            System.out.println("Processando...  ");
            Thread.sleep(1600);

            System.out.println("Enviando...");
            Thread.sleep(1500);

            System.out.printf("Tudo fica R$%.2f. Boa apetite e Volte sempre!", total);

        } else if (resp.equals("NAO")) {
            System.out.println("Ok...Processando...");
            Thread.sleep(1700);

            System.out.println("Digite quantos hambúgueres você quer: ");
            quantidade_hamburguer = input.nextInt();
            total += quantidade_hamburguer * hamburguer;
            System.out.println("Preparando pedido...");
            Thread.sleep(1600);

            System.out.println("Processando...  ");
            Thread.sleep(1500);

            System.out.println("Enviando...");
            Thread.sleep(1400);

            System.out.printf("Tudo fica R$%.2f. Boa apetite e Volte sempre!", total);
        }

    }
}
