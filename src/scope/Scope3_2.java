package scope;

public class Scope3_2 {
    public static void main(String[] args) {
        int m = 20;
        if (m > 10) {
            int temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
// ctrl + E -> Enter 이전으로 돌아가기
// ctrl + N -> Navigator

// 좋은 프로그램은 무한한 자유가 있는 프로그램이 아니라 적절한 제약이 있는 프로그램이다.