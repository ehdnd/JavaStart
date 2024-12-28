package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        // intValue = doubleValue; // 컴파일 오류 발생
        // 명시적 형변환
        intValue = (int) doubleValue;
        // intValue = (int) 1.5;
        // intValue = 1;
        System.out.println(intValue);
    }
}
