import java.util.Arrays;

public class SecondMinimum {
    
    public static void main(String [] args){
          int [] arr = {2,1,3,5,6,1};
          int res = secondMin(arr);
          int res1 = secondMin1(arr);
          int res2 = secondMin2(arr);
          System.out.println(res);
          System.out.println(res1);
          System.out.println(res2);
    }

    private static int secondMin2(int[] arr) {
       
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for(int  i = 0;i <arr.length;i++){
            if(arr[i] <firstMin){
                secondMin = firstMin;
                firstMin = arr[i];
            }
            else if(arr[i] < secondMin && arr[i] != firstMin){
                secondMin = arr[i];
            }
        }
        return secondMin;
    }

    private static int secondMin1(int[] arr) {
        int secondMin = 0;
        Arrays.sort(arr);
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                 secondMin = arr[i+1];
                 break;
            }
        }

        return secondMin;

    }

    private static int secondMin(int[] arr) {

        int n = arr.length; 
        int smallest = Integer.MAX_VALUE; 
        // traversing the array to find 
        // smallest element. 
        for (int i = 0; i < n; i++) { 
            if (arr[i] < smallest) { 
                smallest = arr[i]; 
            } 
        } 
  
        int second_smallest = Integer.MAX_VALUE; 
  
        // traversing the array to find second smallest 
        // element 
        for (int i = 0; i < n; i++) { 
            if (arr[i] < second_smallest 
                && arr[i] > smallest) { 
                second_smallest = arr[i]; 
            } 
        } 

        return second_smallest;
    }
}
