package bj_9506;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            if (n == -1) break;
            else {
                int result = 0;

                for (int j = 1; j < n; j++) {
                    if (n % j == 0) result += j;
                }

                if (result == n) {
                    System.out.print(n + " = 1");
                    for (int k = 2; k < n; k++) {
                        if (n % k == 0) System.out.print(" + " + k);
                    }
                    System.out.println();
                }

                else {
                    System.out.println(n + " is NOT perfect.");
                }
            }
        }
    }
}
