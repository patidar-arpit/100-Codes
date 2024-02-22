import java.util.*;

class FreqChar{
     public static void main(String [] argvs){
        String str = "arpitai";
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }

        Set<Character> set = map.keySet();

        for(char c: set ){
            System.out.println(c+"-"+map.get(c));
        }
     
    }
}