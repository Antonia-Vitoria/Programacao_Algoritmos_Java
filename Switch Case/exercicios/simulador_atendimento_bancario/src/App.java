import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        boolean cont = true;
        while (cont) {

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
                    System.out.printf("Seu saldo é de R$%d\n", saldo);

                    System.out.println("Digite 'E' para encerrar ou 'R' para reiniciar: ");
                    String resp = input.next();

                    if (resp.equalsIgnoreCase("E")) {
                        cont = false;
                        System.out.println("Programa encerrado.");
                    } else {
                        
                    }

                }
                    break;

                case 2: {
                    System.out.printf("Quanto você quer sacar?\nLEMBRANDO: Seu saldo é de R$%d\n", saldo);
                    saque = input.nextDouble();
                    total = saldo - saque;

                    if (saque > saldo) {
                        System.out.printf("Opção invalida! \nValor maior que o saldo\nVocê tem no seu saldo R$%d\n", saldo);
                                
                        System.out.println("Digite 'E' para encerrar ou 'R' para reiniciar: ");
                        String resp = input.next();

                        if (resp.equalsIgnoreCase("E")) {
                            cont = false;
                            System.out.println("Programa encerrado.");
                        } else {
                            
                        }

                    } else if (saque <= saldo) {
                        System.out.printf("Você sacou R$%.2f\nAgora seu saldo é de R$%.2f\n", saque, total);
                        System.out.println("Digite 'E' para encerrar ou 'R' para reiniciar: ");
                        String resp = input.next();

                        if (resp.equalsIgnoreCase("E")) {
                            cont = false;
                            System.out.println("Programa encerrado.");
                        } else {
                            
                        }
                    }

                }
                    break;

                case 3: {
                    System.out.println("Digite quanto você quer depositar:");
                    deposito = input.nextDouble();
                    total = saldo + deposito;
                    System.out.printf("Seu saldo agora é de: R$%.2f\n", total);

                    System.out.println("Digite 'E' para encerrar ou 'R' para reiniciar: ");
                    String resp = input.next();

                    if (resp .equalsIgnoreCase("E")) {
                        cont = false;
                        System.out.println("Programa encerrado.");

                    } else {
                        
                    }
                }
                    break;

                case 4: {
                    System.out.println("Atendimento terminado!\n");
                    cont = false;
                    break;
                }

                default: {
                    System.out.println("Essa opção não existe");

                    System.out.println("Digite 'E' para encerrar ou 'R' para reiniciar: ");
                    String resp = input.next();

                    if (resp.equalsIgnoreCase("E")) {
                        cont = false;
                        System.out.println("Programa encerrado.");
                    } else {
                    
                    }

                }
                    break;
                
            }
            
        }
        input.close();
    }
}
