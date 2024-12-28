package scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 입력: ");
        System.out.println((scanner.nextInt() % 2 == 0) ? "짝수" : "홀수");
    }
}
