
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("========== AUMENTO DE SALÁRIO ==========");

        Scanner input = new Scanner(System.in);

        double salario, aumento, porc;

        System.out.println("Digite seu salário: ");
        salario = input.nextDouble();

        System.out.println("Qual é a porcentagem de aumento que você vai receber? ");
        aumento = input.nextDouble();

       porc = (salario*aumento) / 100;

        aumento = salario + porc;
        System.out.printf("O aumento do salário é R$%.2f\nO novo salário vai ser R$%.2f", porc, aumento);

    }
}
