import java.util.Arrays;

public class ReverseArray {
    public static void main(String [] args){
        int arr [] = {1,2,3,4,5}; 
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr) {
          
        int r = arr.length-1;
        int l = 0;
        while(l<r){
             int temp = arr[r];
             arr[r] = arr[l];
             arr[l] = temp;
             l++;
             r--;
        }
    }
}
