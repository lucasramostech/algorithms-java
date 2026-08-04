import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

        System.out.print("Digite o número a buscar: ");
        int target = sc.nextInt();

        int low = 0; int high = arr1.length - 1; int mid = 0;
        boolean encontrado = false;

        while (low <= high) {
            mid = (low + high) / 2;

            if (target > arr1[mid]) {
                low = mid + 1;
            } else if (target < arr1[mid]) {
                high = mid - 1;
            } else {
                System.out.printf("O número %d foi encontrado na posição %d", target, mid);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.printf("O número %d não foi encontrado", target);
        }

        sc.close();
    }
}