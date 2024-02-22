import java.util.*;
class MergeArrays{
    public static void main(String [] argvs){
    
        int arr1[] = {1, 3, 5, 7};
        int arr2[] = {2, 4, 6, 8};

        mergeSortedArray(arr1,arr2);
        mergeSortedArray1(arr1,arr2);
    }

    public static void mergeSortedArray(int [] arr1,int [] arr2){
        int [] a = new int[arr1.length+arr2.length];

        int i;
        for(i = 0;i<arr1.length;i++){
            a[i] = arr1[i];
        }

        for(int j = 0;j<arr2.length;j++){
            a[i] = arr2[j];
            i++;
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));




    }
     public static void mergeSortedArray1(int [] arr1,int [] arr2){
        int [] a = new int[arr1.length+arr2.length];
        
        int i = 0;
        int j = 0;
        int k = 0;

        while( i< arr1.length && j<arr2.length){
            if(arr1[i] < arr2[j]){
                a[k++]= arr1[i++];
            }
            else if(arr1[i] > arr2[j]){
                a[k++]= arr2[j++];
            }
            else{
                a[k++]= arr2[j++];
            }
        }

        while(i<arr1.length){
            a[k++] = arr1[i++];
        }

        while(j<arr2.length){
            a[k++] = arr2[j++];
        }

        System.out.println(Arrays.toString(a));
     }
}
