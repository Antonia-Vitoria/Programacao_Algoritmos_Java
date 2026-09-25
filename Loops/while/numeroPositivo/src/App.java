import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        int num =1;
        int soma = 0;
        while (num != 0) {
            System.out.println("Digite qualquer número positivo ou\nDigite zero (0) para sair");
            num = input.nextInt();

            soma += num;

             System.out.printf("Você digitou %d.\nA soma de todas as tentaivas é %d\n", num, soma);
        }
       
        input.close();
    }
}
