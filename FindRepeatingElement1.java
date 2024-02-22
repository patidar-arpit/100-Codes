import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class FindRepeatingElement1 {
     public static void main(String [] args){
        int arr[] = new int[]{10, 30, 50, 20, 10, 20, 30, 10};

         System.out.println(findingRepeatingElem1(arr));
         System.out.println(findingRepeatingElem2(arr));
    }

     private static ArrayList<Integer> findingRepeatingElem2(int[] arr) {

        ArrayList<Integer> result = new ArrayList<Integer>();
        Arrays.sort(arr);
        for(int i = 0;i<arr.length;i++){
            int flag = 0;
            while(i<arr.length-1 && arr[i] == arr[i+1]){
                flag = 1;
                i++;
            }

            if(flag==1){
                result.add(arr[i-1]);
            }

        }
        
        return result;
        
    }

    private static ArrayList<Integer> findingRepeatingElem1(int[] arr) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }

        Set<Integer> set = map.keySet();

        for(int a :set){
            if(map.get(a) >1){
                res.add(a);
            }
        }
        
        return res;

    }
}
