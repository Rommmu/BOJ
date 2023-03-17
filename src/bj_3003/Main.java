package bj_3003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] chess = {1, 1, 2, 2, 2, 8};
        int[] array = new int[6];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();

            System.out.print(chess[i] - array[i] + " ");
        }
    }
}
