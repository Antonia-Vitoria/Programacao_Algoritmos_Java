import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨ AREA E COMPRIMENTO ¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        Scanner entra = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        double area, largura, comprimento;

        System.out.println("Digite quanto você quer de largura:");
        largura = entra.nextDouble();

        System.out.println("Digite quanto você quer de comprimento:");
        comprimento = input.nextDouble();

        area = (largura * comprimento);

        System.out.printf("A largura é %.2f metros. O comprimento é %.2f metros. A área é %.2f\n", area);
        Scanner close;

    }
}
/*
 * %d = inteira
 * %f = Para números fracionados
 * %s = Para textos
 * %b = Para booleanos
 * %c = Para caracteres
 * Utilize o System.out.printf(); para saidas formatadas
 * EXEMPLO:
 * System.out.printf("A largura é %.2f metros. O comprimento é %.2f metros. A área é %.2f\n", area);
 * Obs: Para determinar a quantidade de casas decimais após a vígula use %.2f. Onde o "2" é a quantidade de casas após a vírgula
 */
