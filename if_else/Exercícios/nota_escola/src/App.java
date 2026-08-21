import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("========== MÉDIA ==========");
        double media;
        Scanner entrada = new Scanner(System.in);
        Scanner entra = new Scanner(System.in);

        System.out.println("Digite sua 1° nota: ");
        double nota1 = entrada.nextDouble();

        System.err.println("Digite sua 2° nota: ");
        double nota2 = entra.nextDouble();

        media = (nota1 + nota2) / 3;
        if (media >= 5) {
            System.out.printf("A média final é %d, e o aluno está aprovado", media);
        } else {
            System.out.printf("A média final é %s, e o aluno está reprovado", media);
        }

    }
}
