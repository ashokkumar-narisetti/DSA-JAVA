import java.util.*;
class ArrayResult{
    int sum, min,max;
}
public class ArrayTraversal {
    public static ArrayResult traversalNumber(int[] arr){
        ArrayResult result = new ArrayResult();
        result.sum = 0;
        result.min = arr[0];
        result.max = arr[0];
        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
            result.sum += arr[i];
            if(arr[i]>result.max){
                result.max = arr[i];
               
            }
            if(arr[i] < result.min){
                result.min = arr[i];
              
            }
        }
        
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        ArrayResult res = traversalNumber(arr);
        System.out.println("Sum = "+res.sum);
        System.out.println("Maximum element is "+res.max);
        System.out.println("Minimum element is "+res.min);
        sc.close();
    }
}
