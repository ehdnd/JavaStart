package loop;

public class While2_1 {
    public static void main(String[] args) {
        int sum = 0;
        int plus = 1;
        while (plus <= 3) sum += plus++;
        System.out.println(sum);
    }
}
