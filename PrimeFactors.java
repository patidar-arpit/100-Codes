public class PrimeFactors {
    public static void main(String [] argvs){
         
        primeFactorization(90);

    }

    private static void primeFactorization(int num) {
       
        while( num %2==0){
            System.out.print(2 +  " ");
            num /= 2;
        }

        for(int i = 3;i<=num/2;i=i+2){

            while( num % i==0){
                System.out.print(i +  " ");
                num /= i;
            }

        }

        if (num > 2)
     System.out.print(num);

    }
}
