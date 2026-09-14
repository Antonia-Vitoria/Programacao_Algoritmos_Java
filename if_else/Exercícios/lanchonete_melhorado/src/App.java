import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("""
                ********** LANCHONETE **********
                BEM - VINDO A NOSSA LANCHONETE
                Hamburguer: R$18.00
                Refri: R$7.00
                Digite...
                [1] Para pegar hamburguer e refri
                [2] Para pegar só hamburger
                [3] Para pegar só refri
                """);
        double hamburguer, total_refri, total_hamburguer, refri, total;
        int quantidade_refri, quantidade_hamburguer, opcao;
        refri = 7.00;
        hamburguer = 18.00;
        total_hamburguer = 0;
        total_refri = 0;
        total = 0;

        opcao = input.nextInt();

        switch (opcao) {
            case 1: {
                System.out.println("Digite quantos Hamburguers você quer: ");
                quantidade_hamburguer = input.nextInt();
                total_hamburguer += quantidade_hamburguer * hamburguer;

                System.out.println("Digite quantos refrigerantes você quer: ");
                quantidade_refri = input.nextInt();
                total_refri += quantidade_refri * refri;
                total = total_hamburguer + total_refri;
                System.out.printf("O hamburger ficou R$%.2f\nO refri R$%.2f\nO total é R$%.2f\n", total_hamburguer, total_refri, total);
                        
            }
                break;

            case 2: {
                System.out.println("Digite quantos Hamburguers você quer: ");
                quantidade_hamburguer = input.nextInt();
                total_hamburguer += quantidade_hamburguer * hamburguer;
                System.out.printf("O total é R$%.2f\n", total_hamburguer);
            }
                break;

            case 3: {
                System.out.println("Digite quantos refrigerantes você quer: ");
                quantidade_refri = input.nextInt();
                total_refri += quantidade_refri * refri;
                System.out.printf("O total é R$%.2f\n", total_refri);
            }
                break;

            default:
                System.out.println("Opçãop inválida!\nEscolha de 1 a 3");
        }

        input.close();

    }

}
