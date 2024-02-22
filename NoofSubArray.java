import java.util.*;
class NoofSubArray{
    public static void main(String [] argvs){
        int [] arr = {10 , 2, -2, -20, 10};
        System.out.println(findSubArraySum(arr,-10));
    }
    static int findSubArraySum(int arr[],int k)
    {
       int count =0;
       HashMap<Integer,Integer> map = new HashMap<>();
       map.put(0,1);
       int prevSum = 0;
       for(int i =0 ;i<arr.length;i++){
           prevSum += arr[i];
           if(map.containsKey(prevSum-k)){
               count = count + map.get(prevSum-k);
           }
           
               if(map.containsKey(prevSum)){
                   map.put(prevSum,map.get(prevSum)+1);
               }
               else{
                   map.put(prevSum,1);
               }     
       }
       
       return count;
    }
}