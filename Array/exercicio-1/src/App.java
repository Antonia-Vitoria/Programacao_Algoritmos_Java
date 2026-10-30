import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] usuarios = new String[5];

        for (int i = 0; i < usuarios.length; i++) {
            System.out.printf("Digite o nome da %d° pessoa: ", (i+1));
            usuarios[i] = input.nextLine();
        }

        System.out.println("\n========== INFORMAÇÕES DOS USUÁRIOS ==========");

        for (int i = 0; i < usuarios.length; i++) {

            System.out.printf("\nUsuário ", (i + 1));
            System.out.printf("Nome: ", usuarios[i]);
            System.out.printf("Quantidade de caracteres: ", usuarios[i].length());
            System.out.printf("Nome em maiúsculo: ", usuarios[i].toUpperCase());
            System.out.printf("Nome em minúsculo: ", usuarios[i].toLowerCase());
        }

        input.close();
    }
}
