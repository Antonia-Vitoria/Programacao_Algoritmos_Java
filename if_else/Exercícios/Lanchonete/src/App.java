import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.err.println("========== LANCHONETE ==========");
        double hamburguer, total, refri;
        refri = 7;
        hamburguer = 18;
        total = (hamburguer * 2) + (refri * 3);

        System.err.printf("O total de tudo fica R$%s", total);
    }
}
