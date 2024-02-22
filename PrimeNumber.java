public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(23));
         System.out.println(isPrime1(25));
    }

    private static boolean isPrime1(int num) {
        if(num  < 2 ){
            return false;
        }
        for(int i = 2;i<=Math.sqrt(num);i++){
            if(num%i == 0){
                return false;   
            }
        }
        return true;
     
    }

    private static boolean isPrime(int num) {
        if(num == 1 ){
            return false;
        }
        for(int i = 2;i<=num/2;i++){
            if(num%i == 0){
                return false;   
            }
        }
        return true;
    }
}
