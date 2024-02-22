public class ReverseNo {
    public static void main(String[] args) {
        int number = 23090;
        System.out.println(reverseNo1(number,0));
    }

    private static int reverseNo(int number) {
       int result  = 0;
        while(number !=0){
            int rem = number % 10;
            result = result*10 +rem;
            number /= 10;
        }
        return result;
    }
    private static int reverseNo1(int number,int rev) {
       
        if(number == 0){
            return rev;
        }
         
         int rem = number%10;
         rev = rev * 10 + rem;
         return reverseNo1(number/10,rev);
    }
}
