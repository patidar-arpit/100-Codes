import java.util.*;
class Anagram{
    public static void main(String [] argvs){
        String str1 = "arpit";
        String str2 = "apitra";

        str1 = sortString(str1);
        str2 = sortString(str2);

        if(str1.equals(str2)){
            System.out.println("Anagram");
        } 
        else{
            System.out.println("Not Anagram.!!");
        }
       
      
    }

    public static String sortString(String str){
        char [] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

}