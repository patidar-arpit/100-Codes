import java.util.HashMap;

public class Disjoint1 {
    public static void main(String[] args) {
        
        int arr1[] = {10, 51, 3, 43, 6};
        int arr2[] = {80, 71, 29,3};
        
        if (disjoint(arr1, arr2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    private static boolean disjoint(int[] arr1, int[] arr2) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<arr1.length;i++){
             map.put(arr1[i],1);
        }

        for(int i =0;i<arr2.length;i++){
            if(map.containsKey(arr2[i])){
                return false;
            }
        }

        return true;
    }
}
