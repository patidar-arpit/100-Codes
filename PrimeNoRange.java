import java.util.ArrayList;

public class PrimeNoRange {

    public static void main(String[] args) {
        int a = 10;
        int b = 53;

      ArrayList<Integer> ans = primeNoInRange(a, b);
      System.out.println(ans);
    }

    private static ArrayList<Integer> primeNoInRange(int a, int b) {
       
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i= a;i<=b;i++){
            if(isPrime(i)){
                result.add(i);
            }
        }
        
        return result;
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
