import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicate {
     public static void main(String [] args){
        int arr[] = new int[]{10, 30, 50, 20, 10, 20, 30,1};

         System.out.println(removeDuplicate(arr));
          int n = removeDuplicate1(arr);
          for(int i= 0;i<n;i++){
            System.out.print(arr[i]+" ");
          }
    }

    private static int removeDuplicate1(int[] arr) {

        int j = 0;
        Arrays.sort(arr);
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i] !=arr[i+1]){
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[arr.length-1];

        return j;
        
    }

    private static ArrayList<Integer> removeDuplicate(int[] arr) {
        
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0;i<arr.length;i++){
            set.add(arr[i]);
        }

        ArrayList<Integer> result = new ArrayList<>(set);

        return result;

    }

    
}
