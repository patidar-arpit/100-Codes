import java.util.Arrays;

public class ArrayRotation2 {
     public static void main(String[] args) {
        
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        //rotateArrayByOne(arr);
        rotateArray(arr,3);
        System.err.println(Arrays.to);
    }

    private static void rotateArray(int[] arr, int k) {
           
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0,arr.length-1);

    }

    private static void reverse(int[] arr, int i, int j) {
         while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
         }    

    }

}
