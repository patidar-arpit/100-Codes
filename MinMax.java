import java.util.Arrays;

public class MinMax {
    public static void main(String []argvs){
           
        int [] arr= {10,20,30,40,23,21,1};
        int [] res =  minAndMax(arr);
        System.out.println(Arrays.toString(res));

    }

    private static int[] minAndMax(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int [] res = new int[2];

        for(int i = 0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]> max){
                max = arr[i];
            }
        }  

        res[0] = min;
        res[1] = max;
        return res;

    }
}
