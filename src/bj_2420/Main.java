package bj_2420;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        long m = scanner.nextLong();
        long result;

        if (n >= m) {
            result = n - m;
        }
        else {
            result = -(n - m);
        }

        System.out.println(result);
    }
}
