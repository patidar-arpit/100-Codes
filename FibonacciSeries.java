public class FibonacciSeries {
    public static void main(String[] args) {
       fibonacci(5);
       fibonacci1(8);
       
    }

    

    private static void fibonacci1(int num) {
        int a = 0;
        int b = 1;
        System.out.print(a+" "+b+" ");
        for(int i = 2;i<num;i++){
            int next = a+b;
            a = b;
            b = next;
            System.out.print(next+" ");
        }
         System.out.println();

    }

    private static void fibonacci(int num) {
        int [] arr = new int[num];
         arr[0] = 0;
         arr[1] = 1;
         System.out.print(arr[0]+" "+arr[1]+" ");
         for(int  i = 2;i<num;i++){
            arr[i] = arr[i-1] +arr[i-2];
            System.out.print(arr[i]+" ");
         }
          System.out.println();
    }

}
