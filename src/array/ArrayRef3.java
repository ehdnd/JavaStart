package array;

public class ArrayRef3 {
    public static void main(String[] args) {
        int[] students;
        // 배열 리펙토링 - 배열 초기화
        students = new int[]{90, 80, 70, 60, 50};

        for (int i = 0; i < students.length; i++) System.out.println(students[i]);
    }
}
