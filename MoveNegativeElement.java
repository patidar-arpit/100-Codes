import java.util.*;
class MoveNegativeElement{
    public static void main(String [] argvs){
        int [] arr = {1,-2,3,-1,0,4,3,-4};
        moveNegativeElement(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static  void moveNegativeElement(int [] arr){

        int i = 0;
        int j = arr.length-1;

        while(i<=j){
            if(arr[i] <  0 &&  arr[j]<0){
                i++;
            }
            else if(arr[i] > 0 && arr[j] <0){
                swap(arr,i,j);
                i++;
                j--;
            }
            else if(arr[i] > 0 && arr[j] >0){
                j--;
            }
            else{
                i++;
                j--;
            }

        }

    }
    public static void swap(int [] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}