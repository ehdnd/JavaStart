package operator;

public class Operator2 {
    public static void main(String[] args) {
        String result1 = "hello " + "world";
        System.out.println(result1);

        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + s2;
        System.out.println(result2);

        // 문자열과 숫자 더하기: 숫자를 문자열로
        String result3 = "a + b = " + 10;
        System.out.println(result3);

        // 문자열과 숫자 더하기2: 문자열과 더하는 것은 다 문자열로
        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println(result4);
    }
}
