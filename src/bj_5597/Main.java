package bj_5597;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 30개 요소를 가지는 배열 생성
        int[] array = new int[30];
        // 각 배열의 요소를 모두 0으로 초기화
        for (int i : array) array[i] = 0;

        // 28개의 수를 입력받으며 그 자리에 해당하는 요소를 1로 수정
        for (int i = 0; i < 28; ++i) {
            int num = scanner.nextInt();
            array[num-1] = 1;
        }

        // 0 ; 즉 입력받지 않았다면 0이니 해당 수를 출력
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == 0) {
                System.out.println(i+1);
            }
        }
    }
}
