package bj_10807;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int[] arr1 = new int[num];

        for (int i = 0; i < arr1.length; ++i) {
            int n = scanner.nextInt();
            arr1[i] = n;
        }

        int index = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < arr1.length; ++i) {
            if (arr1[i] == index) {
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}
