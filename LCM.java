public class LCM {
    public static void main(String[] args) {
        
        System.out.println(findLcm(11,12));
    }

    private static int findLcm(int a, int b) {
        
        int max = Math.max(a, b);

        for(int i = max;i<=a*b;i++){
            if(i%a== 0 && i%b==0){
                 return i;
            }
        }

        return a*b;
    }
}
