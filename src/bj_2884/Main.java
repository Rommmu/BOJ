package bj_2884;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int minute = scanner.nextInt();

        if (minute >= 45) System.out.printf("%d %d", (hour), (minute - 45));
        else {
            if (hour == 0) System.out.printf("%d %d", 23, minute + 15);
            else System.out.printf("%d %d", hour - 1, minute + 15);
        }
    }
}
