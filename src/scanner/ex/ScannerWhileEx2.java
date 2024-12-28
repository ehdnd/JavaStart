package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int input = 0;

        while ((input = scanner.nextInt()) != -1) {
            sum += input;
            count++;
        }
        System.out.println("sum = " + sum);
        System.out.println("avg = " + (double) sum / count);
    }
}
