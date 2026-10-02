import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        double total = 0;
        double meta = 150;
        boolean resp = true;

        do {
            System.out.printf("Está chovendo? (TRUE/FALSE)\n");
            resp = input.nextBoolean();
            if(resp == true){
                total += 5;
            }
            System.out.println("Escolha uma opção:\n[1]Ifood\n[2]Zé Delivery\n[3]Rappi\n");
            int opcao = input.nextInt();

            switch (opcao) {

                case 1:
                    total += 8;
                    
                    break;

                case 2:
                    total += 9;
                    break;

                case 3:
                    total += 10;
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

            System.out.println("Total acumulado: R$ " + total);

        } while (total <= meta);

        System.out.printf("Meta de R$150 atingida!\nValor total no final:R$",total);

        input.close();
    }
}
