package SelectionSort;
import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {


        // Crie o array e chama a funçao de ordenar
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(84, 12, 57, 3, 91, 46, 28
            , 70, 15, 63, 39, 8, 95, 21, 54, 77, 6, 42, 88, 33));

            selectionSort(numeros); 
    }

    // Função de ordenar arrays
    public static void selectionSort(ArrayList<Integer> numeros) {
        ArrayList<Integer> numerosOrdenados = new ArrayList<>();
        System.out.println("Array original: " + numeros);

        // Loop em loop para percorrer, encontrar o menor e add no novo array
        for (int numeroAtual : new ArrayList<>(numeros)) {

            double inverso = 0;
            double maiorInverso = 0;
            int menorNumero = 0;

            for (int candidato : numeros) {
                inverso = (double) 1 / candidato;

                if (inverso > maiorInverso) {
                    maiorInverso = inverso;
                    menorNumero = candidato;
                }
            }

            numerosOrdenados.add(menorNumero);
            numeros.remove(Integer.valueOf(menorNumero));
        }

        System.out.println("Array ordenado: " + numerosOrdenados);
    }
}