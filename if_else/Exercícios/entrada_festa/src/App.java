import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entra = new Scanner(System.in);
        Scanner idad = new Scanner(System.in);
        
        System.out.println("Digite sua idade");
        int idade = idad.nextInt();
        if (idade >= 18) {
            System.out.println("OK... Verificando...");
        } else {
            System.out.println("Você não pode entrar, porque é menor de idade.");
            return;
        }

        System.out.println("Você possui ingresso? (digite TRUE ou FALSE)");
        boolean ingre = entra.nextBoolean();
        if (ingre == true) {
            System.out.println("Você pode entrar.");
        } else {
            System.out.println("Você não pode entrar, porque não possui o ingresso.");
        }
        Scanner close;
    }
}
// Resposta do professor:
// int idade;
// boolean ingresso;
// if(idade >= 18 && ingreesso == true){
//     System.out.println("Pode entrar na festa");
// } else{
//     System.out.println("Não pode entrar na festa");
// }