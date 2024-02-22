import java.util.Arrays;

public class SortArrayHalf {
    public static void main(String [] args){
        int arr[] = {3, 2, 4, 1, 10, 30, 40, 20};
        func1(arr);
        System.out.print(Arrays.toString(arr));
    }

    private static void func1(int[] arr) {
        int mid = arr.length/2;

        for(int i = 0;i<mid-1;i++){
            for(int j = 0;j<mid-i;j++){
                if(arr[j]>arr[j+1]){
                    swap(j, j+1, arr);
                }
            }

            for(int j = mid;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
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
