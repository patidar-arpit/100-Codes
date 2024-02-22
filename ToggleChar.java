import java.lang.Character;

class ToggleChar{
    public static void main(String [] argvs){
        String str = "abcDeFgH";
        String res = "";

        for(int i = 0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
                res = res + Character.toLowerCase(str.charAt(i));
            }
            else{
                res = res + Character.toUpperCase(str.charAt(i));
            }
        }
        
        System.out.println(res);
    }
}