package W1.d1;
import java.util.Arrays;
public class KthSmallestAndLargest {
    
    public static void main(String args[]){
        int arr[]={32,3233,554,21,875,23,77,44,13,765,3,2,13,6653,322,123};
        int k=5;
        int size=arr.length;
        Arrays.sort(arr);
        System.out.println("Kth largest value "+ arr[size-k-1]);
        System.out.println("Kth smallest value "+ arr[k-1]);
    }   
}
