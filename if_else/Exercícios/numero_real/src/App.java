import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner leia=new Scanner(System.in);

        double n1, terca_parte, dobro;

        System.out.println("Digite um número: ");
        n1 = leia.nextDouble();

        terca_parte = n1/3;

        dobro = n1*2;

        System.out.printf(" O dobro é %.2f.\n A terça parte é %6f ", dobro, terca_parte);

    }
}
