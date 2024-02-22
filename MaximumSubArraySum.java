class MaximumSubArraySum{
    public static void main(String [] argvs){
        int [] arr ={2,9,31,-4,21,7};
        int k = 3;

        System.out.println(maxSubArrSum(arr,3));


    }

    public static int maxSubArrSum(int [] arr,int k){
        
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<=arr.length-k;i++){
            int curSum = 0;
            for(int j = i;j<i+k;j++){
                curSum = curSum+arr[j];
            }
            maxSum = Math.max(maxSum,curSum);
        }

        return maxSum;
    }
}