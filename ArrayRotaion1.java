import java.util.Arrays;

public class ArrayRotaion1 {

     public static void main(String[] args) {
        
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        //rotateArrayByOne(arr);
        rotateArray(arr,3);
        System.err.println(Arrays.toString(arr));
    }

    private static void rotateArray(int[] arr, int k) {
        
        int [] temp =new int[k];

        for(int i = 0;i<k;i++){
            temp[i] = arr[i];
        }

        for(int i = 0;i<arr.length-k;i++){
            arr[i] = arr[i+k]; 
        }
        int p = 0;
        for(int i = arr.length-k;i<arr.length;i++){
            arr[i] = temp[p++];
        }

    }
    
}
