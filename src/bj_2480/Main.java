package bj_2480;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int result = num1;
        if (num2 > result) {
            result = num2;
        }
        if (num3 > result) {
            result = num3;
        }

        if (num1 == num2) {
            if (num2 == num3) {
                System.out.println(10000 + num1 * 1000);
            }
            else {
                System.out.println(1000 + num1 * 100);
            }
        }
        else if (num2 == num3) {
            if (num3 == num1) {
                System.out.println(10000 + num2 * 1000);
            }
            else {
                System.out.println(1000 + num2 * 100);
            }
        }
        else if (num3 == num1) {
            if (num1 == num2) {
                System.out.println(10000 + num3 * 1000);
            }
            else {
                System.out.println(1000 + num3 * 100);
            }
        }
        else {
            System.out.println(result * 100);
        }
    }
}
