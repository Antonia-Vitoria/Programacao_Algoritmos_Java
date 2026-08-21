public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("========== AUMENTO DE SALÁRIO ==========");
        int salario, aumento, porc;
        salario = 2000;
        porc = (salario*15)/ 100;
        aumento = salario + porc;
        System.out.printf("O aumento do salário é R$%d\nO novo salário vai ser R$%s", porc, aumento);
    
    }
}
