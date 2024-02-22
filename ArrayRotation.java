import java.util.Arrays;

public class ArrayRotation {

    public static void main(String[] args) {
        
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        //rotateArrayByOne(arr);
        rotateArray(arr,3);
        System.err.println(Arrays.toString(arr));
    }

    private static void rotateArray(int[] arr, int k) {
        for(int i = 0;i<k;i++){
            rotateArrayByOne(arr);
        } 
    }

    private static void rotateArrayByOne(int[] arr) {
        int temp  = arr[0];
       for(int i = 1;i<arr.length;i++){
           arr[i-1] = arr[i];
       }    

       arr[arr.length-1] = temp;
    } 
    
}

