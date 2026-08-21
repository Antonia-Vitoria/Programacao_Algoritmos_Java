public class App {
    public static void main(String[] args) throws Exception {
        double nota1, nota2, nota3, media;
        nota1 = 7.5;
        nota2 = 5.5;
        nota3 = 2.5;

         

        media = (nota1 + nota2 + nota3) / 3;
        
        if (media >= 6) { // se  for VERDADE faça oq esta dentro
            System.out.println("\nA média foi " + media + ", e ele está Aprovado.");
        } else { // se for FALSA faça oq está neste bloco
            System.out.println("\nA média foi " + media + ", e ele está Reprovado.");
        }
    }
}
