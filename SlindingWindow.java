class SlindingWindow{
     public static void main(String [] argvs){
        int [] arr ={2,9,31,-4,21,7};
        int k = 3;

        System.out.println(maxSubArrSum(arr,3));


    }
     public static int maxSubArrSum(int [] arr,int k){
        
        int maxSum = Integer.MIN_VALUE;
        int windSum = 0;
        for(int i = 0;i<k;i++){
           windSum += arr[i];
        }
        for(int i=k;i<arr.length;i++){
            windSum = windSum +arr[i] - arr[i-k]; 
            maxSum = Math.max(maxSum,windSum);
        }

        return maxSum;
    }
}