import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner (System.in);

        int n1, suce, ante;

        System.out.println("Digite um número: ");
        n1 = input.nextInt();

        suce = n1-1;

        ante = n1+1;

        System.out.printf(" O seu número digitado foi %d.\n O sucessor dele é o %d\n O antecessor  é o número %d.", n1, suce, ante);

        input.close();
    }
}
