public class MaximumProductSubArray {

    public static void main(String[] args) {
        int arr[] = {  1, -2, -3, 0, 7, -8, -2  };
        System.out.println("Maximum Sub array product is " + maxSubarrayProduct(arr));
    }

    private static int maxSubarrayProduct(int[] arr) {
        int res = arr[0];
        
        for(int i =0;i<arr.length;i++){
            int mul = arr[i];
            for(int j = i+1;j<arr.length;j++){
                res = Math.max(mul, res);
                mul = mul *arr[j];
            }
            
            res = Math.max(res,mul);

        }

        return res;
    }
    
}
