import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class SortingElementByFreq {
    public static void main(String [] argvs){

        Integer arr[] = {2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12};
        sortingElemByFreq(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortingElemByFreq(Integer[] arr) {
        
        HashMap<Integer,Integer> mapCount = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> mapIndex  = new HashMap<Integer,Integer>();

       
        for(int i = 0;i<arr.length;i++){
            if(mapCount.containsKey(arr[i])){
                mapCount.put(arr[i],mapCount.get(arr[i])+1);
            }
            else{
                mapCount.put(arr[i],1);
                mapIndex.put(arr[i],i);
            }
        }
        
        List<Integer> list = Arrays.asList(arr);

       Collections.sort(list, new Comparator<Integer>() {
        
          public int compare(Integer n1,Integer n2){
              int f1 = mapCount.get(n1);
              int f2 = mapCount.get(n2);

              if(f1 != f2){

                return f2-f1;

              }
              return mapIndex.get(n1) - mapIndex.get(n2); 

          }
       });


    }
}
