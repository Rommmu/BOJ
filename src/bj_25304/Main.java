package bj_25304;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalSum = scanner.nextInt();
        int totalPrd = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < totalPrd; ++i) {
            int prdPrice = scanner.nextInt();
            int prdCount = scanner.nextInt();

            sum = sum + prdPrice * prdCount;
        }

        if (sum == totalSum) System.out.println("Yes");
        else System.out.println("No");
    }
}
