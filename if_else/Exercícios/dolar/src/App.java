import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        double total, dolares, real;
        dolares = 5.19;

        System.out.println("Digite quantos reais você tem R$: ");
        real = input.nextDouble();

        total = real / dolares;

        System.out.printf("Vcoê teria %.2f dolares", total);

        input.close();
    }
}
