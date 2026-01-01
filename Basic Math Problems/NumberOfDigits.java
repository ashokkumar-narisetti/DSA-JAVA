import java.util.Scanner;
/*
Problem: Count Number of Digits
Approach:
- If the number is 0, digit count is 1
- Otherwise, repeatedly divide the number by 10
- Count how many times division happens

Time Complexity: O(n) where n is number of digits
Space Complexity: O(1)
*/
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
