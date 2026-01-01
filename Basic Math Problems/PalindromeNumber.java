import java.util.*;
/*
Problem = Palindrome number.

Approach:
  - Store the Original Element.
  - Reverse the element using Modulo and division.
  - Comparing the Original and Reversed Element.

Time Complexity = O(n).
Space Complexity = O(1).
 */
public class PalindromeNumber {
   public  static boolean  isPalindrome(long n){
     if(n<0) return false;
     long rev = 0;
     long original = n;
     while(n > 0){
        long lastDigit = n % 10;
        rev = (rev*10) + lastDigit;
        n = n / 10;
     }
     return rev == original;
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.print(isPalindrome(n));
        sc.close();
    }
}
