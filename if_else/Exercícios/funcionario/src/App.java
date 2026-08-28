import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia=new Scanner (System.in);

        System.out.println("Digite seu nome: ");
        String nome = leia.next();

        System.out.println("Agora digite seu salário: ");
        double salario = leia.nextDouble();

        System.out.printf("O funcionário %s tem um salário de %.2f", nome, salario);

        leia.close();
    }
}
