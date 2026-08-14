import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(
            2,8,3,5,9,17, 56, 22,
            81, 9, 68, 44, 15, 77, 30,
            50, 19, 85, 3, 64, 36, 72, 12, 99, 25,
            60, 38, 48, 14, 79, 23));

        ArrayList<Integer> ordenado = quickSort(array);
        System.out.println(ordenado);
    }

    static ArrayList<Integer> quickSort(ArrayList<Integer> array) {
    
        if (array.size() <= 1) {
            return array;
        }

        int pivo = array.get(array.size() - 1);
        ArrayList<Integer> esquerda = new ArrayList<>();
        ArrayList<Integer> direita = new ArrayList<>();

        
        for (int i = 0; i < array.size() - 1; i++) {
            int numero = array.get(i);
            if (numero < pivo) {
                esquerda.add(numero);
            } else {
                direita.add(numero);
            }
        }

    
        ArrayList<Integer> resultado = new ArrayList<>();
        resultado.addAll(quickSort(esquerda));   
        resultado.add(pivo);                    
        resultado.addAll(quickSort(direita));    

        return resultado;
    }
}