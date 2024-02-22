public class Power {
    

    public static void main(String [] argvs){
        System.out.println(powerNum(3,3));
    }

    private static int  powerNum(int base, int expo) {
         int result = 1; 
        while(expo > 0){
            result = result * base;
            expo--;
        }
        return result;
    }
}
