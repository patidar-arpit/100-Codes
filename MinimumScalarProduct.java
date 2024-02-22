import java.util.Arrays;
import java.util.Collections;

public class MinimumScalarProduct {
    public static void main(String [] args){
       Integer arr1[] = {1, 2, 6, 3, 7};
       Integer arr2[] = {10, 7, 45, 3, 7};

        System.out.println("Helooo..!");
        System.out.println(minimumScalar(arr1,arr2));
    }

    private static int minimumScalar(Integer[] arr1, Integer[] arr2) {
        
        Arrays.sort(arr1);
       Arrays.sort(arr2, Collections.reverseOrder());



         int prod =0;

        for(int i = 0;i<arr1.length;i++){

            prod += arr1[i]*arr2[i];

        }

        return prod;

    }
}
