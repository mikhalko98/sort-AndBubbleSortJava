import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {
    private Scanner in = new Scanner(System.in);

    public static void main(String[] argc) {
        new Main().run();
    }

    private void run() {
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        //Arrays.sort(arr);
        bubbleSort(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}
