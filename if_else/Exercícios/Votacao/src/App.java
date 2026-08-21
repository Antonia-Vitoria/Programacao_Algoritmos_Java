public class App {
    public static void main(String[] args) throws Exception {
        System.err.println("Qual é a sua idade");
        int idade;
        idade = 17;

        if (idade >= 18) {
            System.err.println("Você já pode votar!");
        }
        else{
            System.err.println("Você ainda é menor de idade, não pode votar");
        }
    }
}
