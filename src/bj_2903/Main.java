package bj_2903;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        System.out.println((int)((Math.pow(2, N) + 1) * (Math.pow(2, N) + 1)));
    }
}
