package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }
        
        // 향상된 for 문, for-each 문
        for (int number : numbers) System.out.println(number);
        // iter 쓰면 알아서 해준다 !!
        for (int number : numbers) {
        }

        // 증가하는 index 필요 -> for-each 문 사용 불가
        for (int i = 0; i < numbers.length; i++) System.out.println("number = " + numbers[i]);
    }
}