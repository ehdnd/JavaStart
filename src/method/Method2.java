package method;

public class Method2 {
    public static void main(String[] args) {

        printHeader();
        System.out.println("프로그램 동작");
        printFooter();
    }

    public static void printHeader() {
        System.out.println("== 프로그램 시작 ==");
        return;
    }

    public static void printFooter() {
        System.out.println("== 프로그램 종료 ==");
        return;
    }
}
