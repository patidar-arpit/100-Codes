public class PalindromeNo {
    
    public static void main(String[] args) {
       
        System.out.println(isPalindrome(121));

    }

    private static boolean isPalindrome(int number) {
          int result  = 0;
          int temp = number;
         while(number !=0){
            int rem = number % 10;
            result = result*10 +rem;
            number /= 10;
         }
         if(result == temp)
           return true;
        return false;
        
    }
}
