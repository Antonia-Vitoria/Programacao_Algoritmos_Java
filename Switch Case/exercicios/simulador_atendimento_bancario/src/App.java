import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        double deposito, total, saque;
        int saldo, opcao;
        saldo = 1000;

        System.out.println("""
                Simulador de Atendimento Bancário
                1 - Para consultar saldo
                2 - Para sacar dinheiro
                3 - Para depositar dinheiro
                4 - Para encerrar atendimento
                 """);

        opcao = input.nextInt();

        switch (opcao) {
            case 1: {
                System.out.printf("Seu saldo é de %d\n", saldo);

            }
                break;
            case 2: {
                System.out.println("Quanto você quer sacar?\n");
                saque = input.nextDouble();

                if (saque > saldo) {
                    System.out.printf("Opção invalida! \nValor maior que o saldo\n Você tem no seu saldo R$%d\n",
                            saldo);
                } else {
                    System.out.printf("Você sacou R$%.2f\n", saque);
                    total = saldo - saque;
                }
            }
                break;
            case 3: {
                System.out.println("Digite quanto você quer depositar:");
                deposito = input.nextDouble();
                total = saldo + deposito;
                System.out.printf("Seu saldo agora é de: R$%.2f", total);
            }
                break;
            case 4: {
                System.out.println("Atendimento terminado!\n");
            }
                break;
            default: {
                System.out.println("Essa opção não existe");
            }

        }
    }
}
