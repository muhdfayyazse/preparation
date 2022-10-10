package com.practice.complexity.maxsubarray;

public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] arr = {-4,2,3,-1,4,-10,2,5};
        bruteForce(arr);
        cumulative(arr);
        global_local(arr);
    }


    private static void bruteForce(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int actualSum = 0;
                for(int k=i; k<j+1; k++){
                    actualSum += arr[k];
                }
                if(maxSum < actualSum){
                    maxSum = actualSum;
                }
            }
        }
        System.out.println("bruteForce : " + maxSum);
    }

    private static void cumulative(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            int cumulativeSum = 0;
            for(int j=i; j<arr.length; j++){
                cumulativeSum += arr[j];                    
                if(maxSum < cumulativeSum){
                    maxSum = cumulativeSum;
                }
            }
        }
        System.out.println("cumulative : " + maxSum);
    }

    private static void global_local(int[] arr){
        int globalSum = Integer.MIN_VALUE;
        int localSum = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < localSum+arr[i]){
                localSum = localSum+arr[i];
            }else{
                localSum = arr[i];
            }
            if(globalSum < localSum){
                globalSum = localSum;
            }
        }
        System.out.println("global_local : " + globalSum);

    }
    
}
