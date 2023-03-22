package bj_4344;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int C = scanner.nextInt();

        for (int i = 0; i < C; i++) {
            int N = scanner.nextInt();
            double[] array = new double[N];
            double sum = 0, avg, avgPercent;
            int avgNum = 0;

            for (int j = 0; j < N; j++) {
                int score = scanner.nextInt();
                array[j] = score;
                sum += score;
            }

            avg = sum / (double) N;

            for (Double d : array) {
                if (d > avg) ++avgNum;
            }

            avgPercent = avgNum / (double) N * 100;
            System.out.println(String.format("%.3f", avgPercent) + "%");
        }
    }
}
