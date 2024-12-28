package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue;
        System.out.println("longValue = " + longValue);

        // 자동 형변환, 묵시적 형변환
        doubleValue = intValue;
        // doubleValue = (double)intValue;
        // doubleValue = (double)10;
        // doubleValue = 10.0;
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L;
        System.out.println("doubleValue2 = " + doubleValue);
    }
}
