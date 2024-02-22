import java.util.ArrayList;

public class FindingRepeatingElement {
    
    public static void main(String [] args){
        int arr[] = new int[]{10, 30, 30,90,20, 10, 20, 50, 10,40};

         System.out.println(findingRepeatingElem(arr));
    }

    private static ArrayList<Integer> findingRepeatingElem(int[] arr) {
        
        boolean [] visited = new boolean[arr.length];
        ArrayList<Integer> res = new ArrayList<>();

        for(int i =0;i<arr.length;i++){
            if(visited[i]==true){
               continue;
            }
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    visited[j] = true;
                    res.add(arr[i]);
                    break;
                }
            }
        }
        
        return res;
    }
}
