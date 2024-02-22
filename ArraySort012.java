import java.util.Arrays;

public class ArraySort012 {
    public static void main(String[] args) {
        int [] arr = {0,1,2,2,0,1,2};
       sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortArray(int[] arr) {

        int cnt0=0;
        int cnt1=0;
        int cnt2=0;
       
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==0){
                cnt0+=1;
            }
            else if(arr[i]==1){
                cnt1+=1;
            }
            else{
                cnt2+=1;
            }
        }

        int i = 0;
         while(cnt0 > 0){
            arr[i] =0;
            i++;
            cnt0--;
         }
         while(cnt1 > 0){
            arr[i] = 1;
            i++;
            cnt1--;
         }
         while(cnt2>0){
            arr[i]=2;
            i++;
            cnt2--;
         }
         
    }
}
