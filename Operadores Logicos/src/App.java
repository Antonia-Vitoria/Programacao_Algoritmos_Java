public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(" ==================== OPERADORES LÓGICOS ====================");
        double nota = 6;
        int frequencia = 75;
        boolean result;

        /*
         * Operador "and &&" as duas condições devem ser true
         * Operador "or ||" pelo menos 1 condição deve ser true
         * Operador "not !" nega a saída
         */

        System.out.print("\nOperador &&:");
        result = (nota >= 6 && frequencia >= 75);
        // System.out.println("Operador e " + (nota >= 6 && frequencia >= 75));
        System.out.println(result);

        System.out.print("\nOperador ||: ");
        result = (nota >= 6 || frequencia >= 75);
        System.out.println(result);

        System.out.print("\nOperador !: ");
        System.out.println(!result);

        System.out.print("\nOperador !! (Negar o negado): ");
        System.out.println(!(!result));

    }
}
