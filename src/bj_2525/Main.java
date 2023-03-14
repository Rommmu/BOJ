package bj_2525;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        int time = scanner.nextInt();

        hour = hour + time / 60;
        minute = minute + time % 60;

        if (minute > 59) {
            if (hour >= 23) {
                minute = minute - 60;
                hour = hour + 1 - 24;
            }
            else {
                hour = hour + 1;
                minute = minute - 60;
            }
        }
        else {
            if (hour >= 24) {
                hour = hour - 24;
            }
        }
        System.out.printf("%d %d", hour, minute);
    }
}
