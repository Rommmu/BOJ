package bj_2439;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for (int i = 1; i < num+1; ++i) {
            for (int k = num+1 - i; k > 1; --k) System.out.printf(" ");
            for (int j = 0; j < i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}