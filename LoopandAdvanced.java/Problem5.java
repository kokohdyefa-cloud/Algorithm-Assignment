public class Problem5 {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;

        for (int i = 2; i <= n; i = i + 2) {
            sum = sum + i;
        }

        System.out.println("Sum = " + sum);
    }
}