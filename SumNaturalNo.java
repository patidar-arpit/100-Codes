public class SumNaturalNo {

    public static void main1(String[] args) {
        int n = 5;
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum = sum +i;
        }
        System.out.println(sum);
    }
     public static void main2(String[] args) {
        int n = 5;
        int ans = (n*(n + 1))/2;
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int ans = sumOfNaturalNumbers(10);
        System.out.println(ans);

    }
    private static int sumOfNaturalNumbers(int i) {
        if(i==1){
            return 1;
        }
        return i+ sumOfNaturalNumbers(i-1);

    }

    
}
