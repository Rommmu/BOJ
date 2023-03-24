package bj_2566;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] arr = new int[9][9];
        int max = arr[0][0];
        int maxN = 0, maxM = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();
                if (arr[i][j] >= max) {
                    max = arr[i][j];
                    maxN = i + 1;
                    maxM = j + 1;
                }
            }
        }
        System.out.println(max);
        System.out.print(maxN + " " + maxM);
    }
}
