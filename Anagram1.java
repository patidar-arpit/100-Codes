import java.util.*;
class Anagram1{
     public static void main(String [] argvs){
        String str1 = "arpit";
        String str2 = "tiprai";

        System.out.println(anagram(str1,str2));
    }

    public static boolean anagram(String str1,String str2){
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0;i<str1.length();i++){
            char ch = str1.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }

       for(int i  = 0;i<str2.length();i++){
         char ch = str2.charAt(i);
         if(map.containsKey(ch)){
            map.put(ch,map.get(ch)-1); 
         }
         else{
            return false;
         }
       }

       Set<Character> keys = map.keySet();
       for(char ch:keys){
        if(map.get(ch)!=0)
           return false;
       }

       return true;
      
    }
}