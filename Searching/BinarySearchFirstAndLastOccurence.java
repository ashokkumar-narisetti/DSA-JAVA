import java.util.*;
/*
problem =BinarySearch for First and Last Occuarence
The array must be sorted.
Approach : 
- Use Binary Search to find the target.
- For first occurrence:
   -> When arr[mid] == target, store mid
   -> Continue searching in the left half.
- For last occurrence:
   -> When arr[mid] == target, store mid
   -> Continue searching in the right half.
- If the target is never found, return -1.

Time Complexity = O(logn).
Space Complexity = O(1).
*/
public class BinarySearchFirstAndLastOccurence {
    public static int firstOccurence(int[] arr,int target){
        int low = 0 ;
        int high = arr.length - 1;
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid]==target){
                  ans = mid;
                  high = mid - 1;
            }else if(target < arr[mid]){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public static int lastOccurence(int[] arr,int target){
        int low = 0 ;
        int high = arr.length - 1;
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid]==target){
                  ans = mid;
                  low = mid + 1;
            }else if(target < arr[mid]){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int first = firstOccurence(arr, target);
        int last = lastOccurence(arr, target);
        if(first == -1){
        System.out.println("Element not found");
        }else{
            System.out.println("first occurence at index :"+first);
            System.out.println("last occurence at index :"+last);
        }
    }
}
