class CountVowel{
    public static void main(String [] argvs){
         
         String str= "abcAcdefaAU";
         str = str.toLowerCase();
         String vowels = "aeiou";
        int  count = 0;
         for(int i = 0;i<str.length();i++){
            if(vowels.indexOf(str.charAt(i)) != -1){
                count++;
            }
         }
         System.out.println(count);
    }
}