// Problem: Find how many times a user logged in at a given timestamp
// Approach: Binary Search (First & Last Occurrence)
// Time Complexity: O(log n)
// Space Complexity: O(1)


public class RealTimeBinarySearch {
    public static int firstOccurence(int[] logs,int T){
         int low  = 0;
         int high = logs.length -1;
         int ans =-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(logs[mid] == T){
                  ans = mid;
                  high = mid - 1;
            }else if(T < logs[mid]){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public static int lastOccurence(int[] logs,int T){
         int low  = 0;
         int high = logs.length -1;
         int ans =-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(logs[mid] == T){
                  ans = mid;
                  low = mid + 1;
            }else if(T < logs[mid]){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] logs =new int[]{101, 102, 102, 102, 103, 104};
        int T = 102;
        int first = firstOccurence(logs, T);
        int last =lastOccurence(logs, T);
        int count  = last - first +1;
        if( first == -1){
            System.out.println("TimeStamp not found");
        }else{
            System.out.println("First TimeStamp of "+T+" at :" + first);
            System.out.println("Last TimeStamp of "+T+" at :" + last);
            System.out.println("Number of times logged = "+count);
        }
    }
}
