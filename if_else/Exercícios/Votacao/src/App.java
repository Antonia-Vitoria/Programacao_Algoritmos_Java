import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input=new Scanner(System.in);
        int idade;
        
        System.err.println("Digite sua idade: ");
        idade = input.nextInt();

        if (idade >= 18) {
            System.err.println("Você é maior de idade, já pode votar.");
        }
        else{
            System.err.println("Você ainda é menor de idade, não pode votar.");
        }
    }
}
