class RemoveCharacter{
     public static void main(String [] argvs){
       String str = "$Gee*k;s..fo, r’Ge^eks?";
       StringBuilder sb  =new StringBuilder();
       for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isAlphabetic(ch)){
                sb.append(ch);
            }
       }

       System.out.println(sb);
    }
}