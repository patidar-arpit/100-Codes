class RemoveVowel{
      public static void main(String [] argvs){
         
         String str= "abcAcdefaAU";
         String vowels = "aeiouAEIOU";
         String res = "";

         for(int i = 0;i<str.length();i++){
            if(vowels.indexOf(str.charAt(i)) == -1){
                res = res + str.charAt(i);
            }
         }
         System.out.println(res);
    }
}