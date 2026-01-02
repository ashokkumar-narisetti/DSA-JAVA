import java.util.*;
/*
problem = Binary Search
Approach: 
  - The array must be sorted.
  - Initialize two pointers:
  - low at the start of the array
  - high at the end of the array
  - While low <= high:
  - Find the middle index mid
  - If the middle element equals the target, return mid
  - If the target is smaller than the middle element, move high to mid - 1
  - Otherwise, move low to mid + 1
  - If the loop ends without finding the target, return -1.
Time Complexity = O(logn).
Space Complexity = O(1).
 */
public class BinarySearch {
    public static int binarySearch(int[] arr,int target){
         int low = 0 ;
         int high = arr.length-1;
         while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target){
                return mid;
            }else if (target < arr[mid]) {
                high = mid - 1;   
            } else {
                low = mid + 1;   
            }
         }
         return -1;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int result = binarySearch(arr, target);
        if(result == -1){
            System.out.println("element not found");
        }else{
            System.out.println("Element found at"+result);
        }
        sc.close();
    }
}
