package bj_14215;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int[] arr = {a, b, c};
        Arrays.sort(arr);

        if (arr[2]>= arr[0] + arr[1]) {
            arr[2] = arr[0] + arr[1] - 1;
        }
        System.out.println(arr[0] + arr[1] + arr[2]);
    }
}
