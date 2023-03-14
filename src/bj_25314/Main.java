package bj_25314;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        // Python 처럼 문자열 반복이 될 거라고 샐각햇음 ...
        for (int i = 0; i < num; i += 4) {
            System.out.printf("long ");
        }
        System.out.println("int");
    }
}
