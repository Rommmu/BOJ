package bj_10818;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arrayLth = scanner.nextInt();
        int[] arr = new int[arrayLth];

        for (int i = 0; i < arr.length; ++i) {
            int n = scanner.nextInt();
            arr[i] = n;
        }

        int min = arr[0];
        int max = arr[0];

        for(int i = 1; i < arr.length; i++)
        {
            if(min > arr[i])
            {
                min = arr[i];
            }

            if(max < arr[i])
            {
                max = arr[i];
            }
        }

        System.out.printf("%d %d", min, max);
    }
}
