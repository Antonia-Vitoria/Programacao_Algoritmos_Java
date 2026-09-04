import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(" BEM - VINDO A NOSSA LANCHONETE\n HARBURGUER: R$18,00\n REFRI: R$7,00\n DIGITE [1] PARA PEGAR HARMBURGUERES E REFRI\n DIGITE [2] PARA PEGAR SÓ HAMBURGUER\n DIGITE [3] PARA PEGAR SÓ REFRI");
        
        Scanner input = new Scanner(System.in);


        String resp = input.next();
        double hamburguer, total, refri;
        int quantidade_refri, quantidade_hamburguer;
        refri = 7.00;
        hamburguer = 18.00;
        total = 0;

        if (resp.equals ("1")) {
            System.out.println("Digite quantos Hamburguers você quer: ");
            quantidade_hamburguer = input.nextInt();
            total += quantidade_hamburguer * hamburguer;
            System.out.printf("O total é %.2f\n", total);

            System.out.println("Digite quantos refrigerantes você quer: ");
            quantidade_refri = input.nextInt();
            total += quantidade_refri * refri;
            System.out.printf("O total é %.2f", total);

        } else if (resp.equals ("2")) {
             System.out.println("Digite quantos Hamburguers você quer: ");
            quantidade_hamburguer = input.nextInt();
            total += quantidade_hamburguer * hamburguer;
            System.out.printf("O total é %.2f\n", total);

        } else if (resp.equals  ("3")) {
            System.out.println("Digite quantos refrigerantes você quer: ");
            quantidade_refri = input.nextInt();
            total += quantidade_refri * refri;
            System.out.printf("O total é %.2f\n", total);
        }
        input.close();

        }

}

