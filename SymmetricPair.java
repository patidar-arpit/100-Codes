import java.util.Arrays;


public class SymmetricPair {
    public static void main(String [] args){
        
        int arr[][] = {{10,20}, {30,40}, {50,60}, {20,10}, {40,30}};

        for(int i =0;i<arr.length;i++){
            Arrays.sort(arr[i]);
            for(int j = i+1;j<arr.length;j++){
                Arrays.sort(arr[j]);
                if(arr[i][0] == arr[j][0] && arr[i][1] == arr[j][1]){
                    System.out.println(Arrays.toString(arr[i]));
                    break;
                }
            }
        }

       
    }
}
