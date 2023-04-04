package bj_11653;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int i = 2;
        //n이 1이 될 때까지 반복
        while (N != 1) {
            // i가 n의 약수이면 나누고 출력
            if (N % i == 0) {
                N /= i;
                System.out.println(i);
            } else {
                i++;
            }
        }
    }
}
