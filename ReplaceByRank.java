import java.util.Arrays;
import java.util.HashMap;

public class ReplaceByRank {
    public static void main(String[] args) {
        int[] arr = { 100, 2, 70, 12 , 90};
 
        // Function Call
        changeArr(arr);
 
        // Print the array elements
        System.out.println(Arrays.toString(arr));
    }

    private static void  changeArr(int[] arr) {

        int [] copiedArr = Arrays.copyOf(arr, arr.length);
        
        Arrays.sort(arr);
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            map.put(arr[i],i+1);
        }
        
        for(int i =0;i<copiedArr.length;i++){
            arr[i] = map.get(copiedArr[i]);
        }

       
    }
}
