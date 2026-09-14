import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        boolean cont = true;
        double deposito, saque, saldo = 1000.0;
        int opcao;

        while (cont) {

            System.out.println("""
                    Simulador de Atendimento Bancário
                    DIGITE UM DESSES NÚMEROS:\n
                    1 - Para consultar saldo
                    2 - Para sacar dinheiro
                    3 - Para depositar dinheiro
                    4 - Para encerrar atendimento
                     """);

            opcao = input.nextInt();

            switch (opcao) {
                case 1: {
                    System.out.printf("Seu saldo é de R$%.2f\n", saldo);

                } break;
                    
                case 2: {
                    System.out.println("Quanto você quer sacar?\n");
                    saque = input.nextDouble();

                    if (saque > saldo) {
                        System.out.printf("Opção invalida! \nValor maior que o saldo\nVocê tem no seu saldo R$%.2f\n",
                                saldo);

                    } else {
                        saldo -= saque;
                        System.out.printf("Saque realizado com sucesso! Novo saldo: R$%.2f\n", saldo);
                    }

                } break;

                case 3: {
                    System.out.println("Digite quanto você quer depositar:");
                    deposito = input.nextDouble();
                    saldo += deposito;
                    System.out.printf("Seu saldo agora é de: R$%.2f\n", saldo);
                } break;

                case 4: {
                    System.out.println("Atendimento terminado!\n");
                    cont = false;
                    break;
                }

                default: {
                    System.out.println("Essa opção não existe");
                    break;
                }

            }
            if (opcao != 4) {
                System.out.println("\nDigite 'E' para encerrar ou 'R' para voltar ao menu principal: ");
                String resp = input.next();

                if (resp.equalsIgnoreCase("E")) {
                    cont = false;
                    System.out.println("Programa encerrado.");
                }
            }

        }
        input.close();
    }
}
