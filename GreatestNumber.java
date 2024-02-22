public class GreatestNumber {
    
    public static void main(String[] args) {
        int a= 10;
        int b = 50;
        int c = 30;

        int ans = greatestOfNumber(a,b,c);
        System.out.println(ans);
    }

    private static int greatestOfNumber(int a, int b, int c) {
        
        if(a>b){
            if(a>c){
               return a;
            }
            else{
                return c;
            }
        }
        else{
            if(b>c){
                return b;
            }
            else
              return c;

        }

    }
}
