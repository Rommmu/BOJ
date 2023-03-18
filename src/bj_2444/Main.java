package bj_2444;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        // 1부터 N까지 반복문을 돌도록 설정
        for (int i = 1; i < N + 1; i++) {
            // 공백문자 출력 :: 감소하도록
            for (int k = N - i; k > 0; k--) {
                System.out.print(" ");
            }
            // 별 출력 :: 증가하도록
            for (int j = 1; j < i * 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 나머지 출력
        for (int i = N + 1; i < N * 2; i++) {
            //i의 값에 따라 공백문자가 출력되도록
            for (int k = i; k > N; k--) {
                System.out.print(" ");
            }

          for (int j = i * 2 + 1; j < N * 4; j++) {
                System.out.print("*");
            }
          System.out.println();
        }
    }
}
