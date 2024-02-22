import java.util.*;
class KthMaxAndMin{
    public static void main(String [] argvs){
        int [] arr = {80 ,90, 23, 45, 2, 67};
        int k = 4;

        TreeSet<Integer> ts = new TreeSet<>();
        for(int i = 0;i<arr.length;i++){
            ts.add(arr[i]);
        }

        ArrayList<Integer> list = new ArrayList<>(ts);
        int min = list.get(k-1);
        int max = list.get(list.size()-k);
        
        System.out.println(min+" "+max);
    }
}