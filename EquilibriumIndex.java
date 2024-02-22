public class EquilibriumIndex {
     public static void main(String[] args)
    {
        int arr[] = { 1,2,3,4,5,6,5,1,3,2,4};
        int arr_size = arr.length;
        System.out.print("Equilibrium Index : ");
        System.out.println(equilibrium_index(arr, arr_size));
    }

    private static int equilibrium_index(int[] arr, int arr_size) {
        
        for(int i =1;i<arr_size;i++) {
            int leftArraySum =0;
            int rightArraySum =0;
            for(int j = i-1;j>=0;j--){
                leftArraySum += arr[j];
            }
            for(int j = i+1;j<arr_size;j++){
                rightArraySum += arr[j];
            }

            if(leftArraySum == rightArraySum){
               return i ;
            }
        }

        return -1;

        
    }
}
