import java.util.HashMap;
import java.util.Map;

public class CountDistinctElement {
    public static void main(String [] args){
        int arr [] = {10, 30, 20, 10, 50, 10};
        System.out.println(countDistinct(arr));
    }

    private static int countDistinct(int[] arr) {
        
       Map<Integer, Integer> map = new HashMap<Integer, Integer>();

       for(int i= 0;i<arr.length;i++){
           if(map.containsKey(arr[i])){
             map.put(arr[i],map.get(arr[i])+1);
           }
           else{
            map.put(arr[i],1);
           }
       }

       return map.size();


    }
}
