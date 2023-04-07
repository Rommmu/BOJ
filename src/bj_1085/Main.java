package bj_1085;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();

        int min = 999999999;

        int[] arr = {x - 0, y - 0, w - x, h - y};

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) min = arr[i];
        }

        System.out.println(min);
    }
}
