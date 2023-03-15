package bj_10871;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arrayLth = scanner.nextInt();
        int num = scanner.nextInt();
        int[] arr = new int[arrayLth];

        for (int i = 0; i < arr.length; ++i) {
            int n = scanner.nextInt();
            arr[i] = n;
        }

        for (int j = 0; j < arr.length; ++j) {
            if (arr[j] < num) System.out.printf(arr[j] + " ");
        }
    }
}
