import java.util.Scanner;

public class NumberOfDigits {

    public static int countDigits(long n) {
        if (n == 0) {
            return 1;
        }
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        System.out.println(countDigits(n));

        sc.close();
    }
}
