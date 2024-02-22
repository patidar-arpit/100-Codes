public class DecimalToBinary {
    
    public static void main(String[] args) {


        decimalToBinary(12);
        
    }

    private static  void decimalToBinary(int num) {
         int [] arr = new int [20];
         int i = 0;
        while(num >0){
            int rem = num % 2;
            arr[i++] = rem;
            num  = num / 2; 
        }

        for(int j = i-1;j>=0;j--){
            System.out.print(arr[j]);
        }
        
    }
}
