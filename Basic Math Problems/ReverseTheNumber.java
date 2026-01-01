import java.util.*;
/*
Problem = Reversing the Given Number.
Approach:
  - Extract the Last digit using Modulo.
  - Build Reverse value by multiplying existing value by 10.
  - Remove last digit by Division.
Time Complexity = O(n).
Space Complexity = O(1).
*/ 
public class ReverseTheNumber {
    public static long reverseNumber(long n){
    long rev = 0;
      while(n > 0){
        long lastDigit = n%10;
        rev = (rev*10)+lastDigit;
        n = n / 10;
      }
      return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.print(reverseNumber(n));
        sc.close();
    }
}
