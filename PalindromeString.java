class PalindromeString{
    
  public static void main(String [] argvs){
         
         String str= "abba";
         
         int i = 0;
         int j = str.length()-1;
         int flag = 0;
         while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                flag =1;
                System.out.println("NO..!");
                 break;
            }  
            i++;
            j--; 
         }
         if(flag == 0){
            System.out.println("YES..!");
         }

    }
}