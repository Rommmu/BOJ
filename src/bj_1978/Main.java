package bj_1978;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            int numCount = 0;

            for (int j = 2; j < num; j++) {
                if (num % j == 0) numCount++;
            }

            if (numCount == 0) count++;

            if (num == 1) count -= 1;
        }

        System.out.println(count);
    }
}
