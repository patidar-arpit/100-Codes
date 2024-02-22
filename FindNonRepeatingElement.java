import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class FindNonRepeatingElement {
     public static void main(String [] args){
        int arr[] = new int[]{10, 30, 50, 20, 10, 20, 30,1};

         System.out.println(findingNonRepeatingElem1(arr));
         System.out.println(findingNonRepeatingElem2(arr));
    }

    private static ArrayList<Integer> findingNonRepeatingElem2(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        boolean visited [] = new boolean[arr.length];
    
        for(int i =0;i<arr.length;i++){
            if (visited[i] == true)
             continue;

            // Count frequency
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                   visited[j] = true;
                   count++;
                }
            }

            if(count==1)   
              result.add(arr[i]);
            
        }

        return result;

    }

    private static ArrayList<Integer> findingNonRepeatingElem1(int[] arr) {

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
            if(map.get(a) ==1){
                res.add(a);
            }
        }
        
        return res;

    }
}
