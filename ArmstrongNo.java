public class ArmstrongNo {
    public static void main(String[] args) {
      
       System.out.println(isArmstrong(407));

    }

    private static boolean isArmstrong(int num) {
       
        int count = countDigits(num);
        int result = 0;
        int temp  =num;
        while ((num !=0)) {
               
            int rem = num%10;
            result = (int) (result + Math.pow(rem,count));
            num = num/10;
        }
        if(result==temp) return true;
        return false;

    }

    private static int countDigits(int num) {
       int count = 0;
       while (num != 0) {
         count++;
         num = num/10;
        
       }
       return count;
    }
}
