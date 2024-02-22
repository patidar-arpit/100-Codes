public class HCF {
    public static void main(String[] args) {
        
        System.out.println(hcf(100,25));
    }

    private static int hcf(int a, int b) {
        
        int min = Math.min(a, b);
        int res = 0;
        for(int i = 2;i<=min;i++){
            if( a%i ==0 && b%i ==0){
                res = Math.max(res, i);
            }
        }

        return res;

    }
}
