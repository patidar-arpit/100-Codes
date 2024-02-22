class ReverseString{

    public static void main(String [] argvs){
         
        reverse1();
        reverse2();
    }
    public static void reverse1(){
         String str= "arpit";
         String reversedString = "";
        
         int i = str.length()-1;
    
         while(i>=0){
           reversedString+=str.charAt(i);
           i--;
         }
         
         System.out.println(reversedString);

    }

    public static void reverse2(){
         String str= "arpit";
         StringBuilder sb = new StringBuilder(str);
         sb.reverse();
         System.out.println(sb.toString());

    }
}