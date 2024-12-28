package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.print("정수 입력: ");
            int num = input.nextInt();

            if (num == 0) {
                System.out.println("모든 정수 합: " + sum);
                break;

            }
            sum += num;
        }
    }
}
