package bj_1546;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        double[] array = new double[N];
        double max = 0;

        for(int i = 0; i < array.length; i++) {
            int score = scanner.nextInt();
            array[i] = score;
            if (array[i] > max) max = array[i];
        }

        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] / max) * 100;
            sum += array[i];
        }

        System.out.println(sum / array.length);
    }
}
