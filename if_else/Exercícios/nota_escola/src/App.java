import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("========== MÉDIA ==========");
        Scanner entrada = new Scanner(System.in);

        double media, nota1, nota2;

        System.out.println("Digite sua 1° nota: ");
        nota1 = entrada.nextDouble();

        System.err.println("Digite sua 2° nota: ");
        nota2 = entrada.nextDouble();

        media = (nota1 + nota2) / 3;
        if (media >= 5) {
            System.out.printf("A média final é %.2f, e o aluno está aprovado", media);
        } else {
            System.out.printf("A média final é %.2f, e o aluno está reprovado", media);
        }

    }
}
