import java.util.*;
/*
problem = LinearSearch
Approach :
  - Traverse the array from index 0.
  - Compare each element with the target.
  - If found, return its index.
  - If traversal ends, return -1.
  Time Complexity = O(n).
  Space Complexity = O(1).
 */
public class LinearSearch {
    public static int linearSearch(int[] arr,int target){
         for(int i = 0 ; i < arr.length ; i++){
              if(arr[i]==target){
                return i;
              }
         }
         return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = linearSearch(arr, target);
        if(result == -1){
            System.out.println("Element not found in array");
        }else{
            System.out.println("element found at index number :"+result);
        }
        sc.close();
    }
}
