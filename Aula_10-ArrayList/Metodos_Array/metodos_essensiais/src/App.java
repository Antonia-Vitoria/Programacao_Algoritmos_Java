import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        // Como declarar um ArrayList
        ArrayList<String> nomes = new ArrayList<>();

        // 01 - Método: add() - Adiciona Elementos á Lista

        //nomes.add("Gilmar");

        // System.out.println(nomes);

        // 02 Método: get(int indice) - Acessa um item

        // System.out.println(nomes.get(0));

        // 03 Método: set(int index, "Elemento") - Alterar um item

        //nomes.set(1, "Paulo");

        // System.out.println(nomes);

        // 04 - Método: remove(int index) - Remover item por posição

        //nomes.add("Sofia");

        // System.out.println(nomes);
        //nomes.remove(1);

        // 05 Método: size() - Tamanho a Lista

        // System.out.println(nomes.size());

        // 06 Método: clear() - Limpar toda a Lista

        // nome.clear();

        // System.out.println(nomes);

        // 07 Método: contains("Elemento") - Verificar se existe na Lista e retorna um
        // boolean

        // System.out.println(nomes.contains("Gilmar"));

        // 08 Método: isEmpty() - Verificar se a Lista está vazia e retorna um boolean

        // nomes.clear();
        // System.out.println(nomes.isEmpty());

        // 09 Método: indexOf("Elemento") - Retorna a posição de um item, se não existir
        // ele retorna negativo(-1)

        nomes.add("João");
        nomes.add("Vitoria");
        nomes.add("Antonia");

        // System.out.println(nomes.indexOf("Não sei"));

        // 10 Método: replaceAll() - Substitui todos os elementos com base em uma única
        // regra

        // nomes.replaceAll(nome -> nome.toUpperCase());

        // System.out.println(nomes);
        // input.close();

        //11 Método: sort() - Ordena a Lista em ordem crescente, albaética e numérica
        // Para usar esse método deve importar realizar um novo import: import java.util.Collecions;

        //System.out.println(nomes);
        Collections.sort(nomes);

        System.out.println(nomes);

        //12 Método: forEach() - Loop co interação do ArrayList

        //nomes.forEach(nome -> System.out.println("Olá "+ nome));

        //13 Método: Visualizar a Lista co  Loop for tradicional

        for(int i = 0; i < nomes.size(); i++){
            System.out.printf("%d %s ", i+1, nomes.get(i));
        }

    }
}
