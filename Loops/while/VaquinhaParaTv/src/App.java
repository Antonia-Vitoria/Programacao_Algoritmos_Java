import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        boolean cont = true;
        double deposito, saldo, caixinha = 6634.05;
        saldo = 0;

        while (cont) {

            System.out.println("""
                    VAQUINHA PARA TV DE 55 OLED LG
                    CUSTA R$6.634,05
                    
                     """);

                    System.out.println("Digite quanto você quer depositar:");
                    deposito = input.nextDouble();
                    saldo += deposito;
                    System.out.printf("Sua caixinha agora é de: R$%.2f\n", saldo);
                    System.out.printf("Falta %.2f\n", (caixinha-saldo));

                    if (saldo == caixinha) {
                        System.out.println("PARABENS!!!!\nVocê chegou na sua meta\n");
                    }
                
            System.out.println("\nDigite zero (0) para encerrar ou um (1) para reiniciar");
            int resp = input.nextInt();

            if (resp == 0) {
                cont = false;
                System.out.println("Programa encerrado.");
            } else if (resp == 1){
                
            }
        }
        input.close();
    }
}
