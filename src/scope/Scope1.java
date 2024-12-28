package scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10;
        if (true) {
            int x = 20;
            System.out.println("if " + m);
            System.out.println("if " + x);
        }
//        System.out.println("main " + x);
        System.out.println("main " + m);
    }
}
