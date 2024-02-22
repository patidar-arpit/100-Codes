class CheckVowel{
    public static void main(String [] argvs){
        char ch ='P';

        String vowels = "aeiouAEIOU";
        if(vowels.indexOf(ch)!=-1){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonent");
        }
    }
}