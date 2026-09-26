import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int senha = 1234;
        int tentativa = 0;
        int conte = 0;

        do {

            System.out.println("Tente descobrir a minha senha e escape do loop\n");
            tentativa = input.nextInt();
            if (tentativa != senha) {
                System.out.println("Você errou, tente novamente\n");
            }
            conte += 1;
        } while (tentativa != senha);
        System.out.printf("Parabens você acertou!!\nPara chegar neste resultado, você tentou %d vezes\n", conte);

        input.close();
    }
}
