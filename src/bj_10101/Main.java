package bj_10101;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angle1 = scanner.nextInt();
        int angle2 = scanner.nextInt();
        int angle3 = scanner.nextInt();

        if (angle1 + angle2 + angle3 == 180) {
            if (angle1 == angle2) {
                if (angle3 == 60) System.out.println("Equilateral");
                else System.out.println("Isosceles");
            }
            else if (angle2 == angle3) {
                if (angle1 == 60) System.out.println("Equilateral");
                else System.out.println("Isosceles");
            }
            else if (angle1 == angle3) {
                if (angle2 == 60) System.out.println("Equilateral");
                else System.out.println("Isosceles");
            }
            else System.out.println("Scalene");
        }
        else System.out.println("Error");
    }
}
