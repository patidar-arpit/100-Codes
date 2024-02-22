import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SymetricPair1 {
    public static void main(String [] args){
        
        int arr[][] = {{10,20}, {30,40}, {50,60}, {20,10}, {40,30}};
        
        Map<Integer,Integer> map  = new HashMap<>();
        
        for(int i = 0;i<arr.length;i++){
               int first = arr[i][0];
               int second = arr[i][1];

               Integer val = map.get(second);

               if(val != null && val == first){
                    System.out.println("(" + first + "," + second+")");
               }
               else{
                map.put(first,second);
               }
        }
       
    }
}
