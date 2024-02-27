import java.util.*;
class NonRepeatingChar{
    public static void main(String [] argvs){
        String str = "arpit";
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        
        for(int i = 0;i<str.length();i++){
            char c = str.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }

        Set<Character> keys = map.keySet();
        System.out.println(keys);
        for(char c :keys){
            if(map.get(c)==1){
                System.out.print(c+" ");
            }
        }




    }
}