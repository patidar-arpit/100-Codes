import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FrequencyElement1 {
    
     public static void main(String[]args){
         int arr [] = {10, 30, 10, 20, 10, 20, 30, 10,10,2};
        freqElement(arr);
        
    }

    private static void freqElement(int[] arr) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i<arr.length;i++){
               if(map.containsKey(arr[i])){
                    map.put(arr[i],map.get(arr[i])+1); 
               }
               else{
                   map.put(arr[i],1);
               }
        }

        Set<Integer> keys = map.keySet();

        for(int key :keys){
            System.out.println(key+"->"+map.get(key));
        }

    }
}
        

        
