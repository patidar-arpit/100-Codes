import java.util.*;

class Union{

    public static void main(String[] argvs){
     Integer [] arr ={1,2,4,5,10,4};
     Integer [] brr = {1,3,4,10,10};

     Set<Integer> set1 = new HashSet<>(Arrays.asList(arr));
     for(int i = 0;i<brr.length;i++){
        set1.add(brr[i]);
     }

     System.out.println(set1);

    }   
     
     
}