package bj_3052;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[42];
        int sum = 0;
        for (int i :array) array[i] = 0;

        // 수 10개 입력 받기
        for (int i = 0; i < 10; ++i) {
            int n = scanner.nextInt();
            array[n % 42] = 1;
        }

        // 해당 배열을 사용해 서로 다른 나머지 개수 구하기
        for (int i : array) {
            if (i == 1) ++sum;
        }
        System.out.println(sum);

    }
}
