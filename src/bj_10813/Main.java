package bj_10813;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 문제에 맞는 N과 M을 입력받고
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        // N을 배열 크기로 할당한다.
        int[] array = new int[N];

        // 배열의 크기에 맞춰 버구니에 적혀있는 번호와 같은 번호가 적힌 공을 넣는다.
        for (int i = 0; i < N; ++i) {
            array[i] = i+1;
        }

        // M 줄의 개수만큼 입력받는다.
        for (int k = 0; k < M; ++k) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();

            // 공간을 만들어서 바꾼다.
            int temp = array[i - 1];
            array[i - 1] = array[j - 1];
            array[j - 1] = temp;
        }

        // 전체 배열 출력
        for (int i : array) System.out.printf(i + " ");
    }
}
