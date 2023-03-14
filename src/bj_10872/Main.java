package bj_10872;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int sum = 1;

        for (int i = 1; i < num + 1; ++i) {
            sum *= i;
        }
        System.out.println(sum);
    }
}
