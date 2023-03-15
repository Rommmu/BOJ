package bj_10810;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] array = new int[N];

        for (int s : array) array[s] = 0;

        for (int p = 0; p < M; ++p) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            int k = scanner.nextInt();

            for (int q = i - 1; q < j; ++q) {
                array[q] = k;
            }
        }

        for (int s : array) System.out.printf(s + " ");
    }
}
