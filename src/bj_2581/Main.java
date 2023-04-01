package bj_2581;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 입력받는 수
        int M = scanner.nextInt();
        int N = scanner.nextInt();

        int count = 0; // 소수 개수 판별
        int min = -1; // 가장 작은 소수
        int sum = 0; // 합을 위한 수

        for (int i = M; i <= N; i++) {
            int numCount = 0;

            for (int j = 2; j < i; j++) {
                // numCount가 1이상이면 소수가 아님
                if (i % j == 0) numCount++;
            }

            // 소수이면, 소수 개수를 1 더한다.
            if (numCount == 0) {
                count++;
                sum += i;
                if (i == 1) {
                    count -= 1;
                    sum -= 1;
                }
            }

            if (count == 1) {
                if (min == -1) min = i;
            }
        }

        if (sum > 0) System.out.println(sum);
        System.out.println(min);
    }
}
