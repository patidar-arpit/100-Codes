public class BinaryToDecimal {
    public static void main(String[] args) {
        
        System.out.println(binaryToDecimal(1001));
    }

    private static int binaryToDecimal(int num) {
        
        int res = 0;
        int count = 0;

        while(num > 0){
            int rem = num % 10;
            res = res + (int)Math.pow(2, count)*rem;
            count++;
            num = num / 10;

        }
        return res;
    }
}
