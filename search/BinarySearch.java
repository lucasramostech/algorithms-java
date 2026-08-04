import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

        System.out.print("Digite o número a buscar: ");
        int target = sc.nextInt();

        // Chamada da função
        int result = binarySearch(arr1, target);
      
        sc.close();
    }

    // Função de busca de binária 
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        // Loop de busca binária
        while (low <= high) {
            int mid = (low + high) / 2;

            // Condicionais de verificação
            if (arr[mid] == target) {
                System.out.println("Número encontrado na posição: " + mid);
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1; 
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Número não encontrado"); return -1; 
    }
}