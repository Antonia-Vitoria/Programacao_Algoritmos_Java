import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia=new Scanner (System.in);

        String nome, mes;

        System.out.println("Digite seu nome: ");
        nome = leia.nextLine();

        System.out.println("Digite o mês: ");
        mes = leia.next();

        System.out.println("Digite seu salário: ");
        double salario = leia.nextDouble();

        System.out.printf("O funcionário %s teve um salário de %.2f no mês de %s", nome, salario, mes);

        leia.close();
    }
}
