import java.util.Arrays;

public class Sort {
    public static void main(String [] argvs){
        int arr [] = {10,9,8,7,6,5,4,3,2,1,0};
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortArray(int[] arr) {
        
        for(int  i = 0 ;i< arr.length-1;i++){
            for(int j = 0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    swap(j, j+1, arr);
                }

                }
            }
        }
    private static void swap(int i,int j,int [] arr){

         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;

    }
}
