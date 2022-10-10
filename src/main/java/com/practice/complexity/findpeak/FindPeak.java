package com.practice.complexity.findpeak;

public class FindPeak {
    public static void main(String[] args) {
        int[] arr= {6,4,5,8,3,7};
        //simpleWay(arr);
        binarySearch(arr);
    }

    private static void simpleWay(int[] arr){
        for(int i=0; i<arr.length; i++){
            if((i==0 || arr[i]>= arr[i-1]) && (i==(arr.length -1) || arr[i]>= arr[i+1])){
                System.out.println(i);
            }
        }
    }

    private static void binarySearch(int[] arr){
        int left = 0;
        int right = arr.length-1;

        while (left < right){
            int mid = (left + right)/2;

            if(arr[mid]<arr[mid+1]){
                left = mid+1;
            }else{
                right = mid;
            }
        }
        System.out.println(arr[left] + "  " + arr[right]);

    }


}
