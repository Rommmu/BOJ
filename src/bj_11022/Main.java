package bj_11022;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testNumber = scanner.nextInt();

        for (int i = 1; i < testNumber+1; ++i) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            int sum = num1 + num2;

            System.out.println("Case #"+ i + ": " + num1 + " + " + num2 + " = " + sum);
        }
    }
}