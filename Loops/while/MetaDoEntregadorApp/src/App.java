import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        do{

        System.out.println("""
                BEM - VINDO A PRAÇA DE ALIMENTAÇÃO
                ESCOLHA ONDE VOCÊ DESEJA COMER HOJE!
                [1] Para Ifood
                [2] Para Zé Delivery
                [3] Para Rappi
                """);
        int opcao = input.nextInt();
        float ifood, delivery, rappi;
        ifood = 8;
        delivery = 9;
        rappi = 10;

        switch (opcao) {
            case 1: {
                System.out.println("Está chovendo? TRUE/FALSE");
                boolean resp = input.nextBoolean();

                if (resp == true) {
                    ifood += 5;
                }
            }
                break;
            case 2: {
                System.out.println("Está chovendo? TRUE/FALSE");
                boolean resp = input.nextBoolean();

                if (resp == true) {
                    delivery += 9;
                }
            }
            case 3: {
                System.out.println("Está chovendo? TRUE/FALSE");
                boolean resp = input.nextBoolean();

                if (resp == true) {
                    rappi += 10;
                }
            }
            default: System.out.println("Opção inválida!\nEscolha de 1 a 3.\n");
                break;
        }
    
        } while ();
        input.close();
    }
}
