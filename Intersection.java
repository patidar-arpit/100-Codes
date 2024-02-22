import java.util.*;
class Intersection{
    public static void main(String [] argvs){
       Integer [] arr ={1,2,4,5,10,4};
       Integer [] brr = {1,3,4,10,10};

        ArrayList<Integer> res = new ArrayList<>();
        List<Integer> list1 = Arrays.asList(arr);
        List<Integer> list2 = Arrays.asList(brr);

       Set<Integer> hs = new TreeSet<>(list1);
       Set<Integer> hs1 = new TreeSet<>(list2);

        for(int val : hs){
            if(hs1.contains(val)){
                res.add(val);
            }
        }

        System.out.println(res);
    }
}