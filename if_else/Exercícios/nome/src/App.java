import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input=new Scanner (System.in);

        System.out.println("Digite seu nome: ");
        String nome = input.next();

        System.out.printf("Olá %s, é um prazer te conhecer! ", nome);
        input.close();
    }
}
