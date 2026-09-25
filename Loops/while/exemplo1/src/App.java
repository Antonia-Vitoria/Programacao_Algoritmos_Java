import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int tab = input.nextInt();

        int num = 0;

        while (num <= 10) {
            System.out.printf("%d X %d = %d\n", tab, num, (tab * num));
            num++;
        }

        input.close();
    }
}
