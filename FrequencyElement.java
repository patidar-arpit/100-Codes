import java.util.Arrays;

public class FrequencyElement {
    
    public static void main(String [] argvs){

        int arr [] = {10, 30, 10, 20, 10, 20, 30, 10,10,2};
        freqElement(arr);
        freqElement1(arr);
        

    }

    private static void freqElement1(int[] arr) {
        
        Arrays.sort(arr);
        for(int i = 0;i<arr.length;i++){
            int count =1;
            while( i<arr.length-1 && arr[i] == arr[i+1]){
                count++;
                i++;
            }

            System.out.println(arr[i] +"->"+count);
        }
    }

    private static void freqElement(int[] arr) {

        boolean visited [] = new boolean[arr.length];
       
        for(int i = 0;i<arr.length;i++){
            if(visited[i] == true){
                continue;
            }
            int count =1;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]==arr[i]){
                    visited[j] = true;
                    count++;
                }
                      
            }

            System.out.println(arr[i]+"->"+count);

        }

    }
}
