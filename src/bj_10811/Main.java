package bj_10811;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] array = new int[N];

        for(int i = 0; i < array.length; ++i) {
            array[i] = i + 1;
        }

        for(int s = 0; s < M; ++s) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();

            for (int k = i; k < j; k++, j--) {
                int temp = array[k - 1];
                array[k - 1] = array[j-1];
                array[j-1] = temp;
            }
        }

        for (int i : array) System.out.print(i + " ");
    }
}
