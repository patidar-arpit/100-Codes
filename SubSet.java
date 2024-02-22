import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SubSet {
    
    public static void main(String[] args) {
        
        int arr1[] = { 11, 10, 13, 21, 30, 70 };
        int arr2[] = { 11, 30, 70, 10};
    
        int m = arr1.length;
        int n = arr2.length;
 
        if (isSubset(arr1, arr2, m, n))
            System.out.print("arr2[] is subset of arr1[] ");
        else
            System.out.print("arr2[] is not subset of arr1[] ");
    }

    private static boolean isSubset(int[] arr1, int[] arr2, int m, int n) {
       
        Set<Integer> map = new HashSet<>();
        for(int i = 0;i<arr1.length;i++){
             map.add(arr1[i]);
        }

        for(int i =0;i<arr2.length;i++){
            if(!map.contains(arr2[i])){
                return false;
            }
        }

        return true;
    
    }
}
