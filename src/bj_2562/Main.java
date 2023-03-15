package bj_2562;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[9];

        for (int i = 0; i < array.length; ++i) {
            int n = scanner.nextInt();
            array[i] = n;
        }

        int max = array[0];
        int maxNumber = 1;

        for (int j = 0; j < array.length; ++j) {
            if (array[j] > max) {
                max = array[j];
                maxNumber = j + 1;
            }
        }
        System.out.println(max + "\n" + maxNumber);
    }
}