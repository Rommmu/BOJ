package bj_5086;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            if (num1 == 0 && num2 == 0) break;

            // 나머지가 0이고 몫이 1이상
            if (num1 % num2 == 0 && num1 / num2 > 1) {
                System.out.println("multiple");
            }
            // 몫이 0이고 나머지가 num1
            else if (num1 / num2 == 0 && num1 % num2 == num1) {
                System.out.println("factor");
            }
            else {
                System.out.println("neither");
            }
        }
    }
}
