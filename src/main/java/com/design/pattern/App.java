package com.design.pattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        // List<Integer> list = new ArrayList<>();
        // int[] arr = new int[10];

        // for(int i=0; i<10; i++){
        //     int val = (int)(Math.random()*100);
        //     list.add(val);
        //     arr[i] = val;
        // }
        // System.out.println(list);
        // Collections.sort(list);
        // System.out.println(list);
        // Collections.sort(list,Collections.reverseOrder());
        // System.out.println(list);
        
        // System.out.println("Arrays : " + Arrays.toString(arr));
        // Arrays.sort(arr);
        // System.out.println("Arrays : " + Arrays.toString(arr));
        // System.out.println(Math.max(12, 20));
        
        // "array": [5, 2, [7, -1], 3, [6, [-13, 8], 4]]
        int[] arrayOne = {-1, 5, 10, 20, 28, 3};
        int[] arrayTwo = {26, 134, 135, 15, 17};
        smallestDifference(arrayOne,arrayTwo);
    }

    public static void smallestDifference(int[] arrayOne, int[] arrayTwo) {
      // Write your code here.
      Arrays.sort(arrayOne);
      Arrays.sort(arrayTwo);
      int p1 = 0;
      int p2 = 0;
      int smallest = Integer.MAX_VALUE;
      int current = 0;
      int[] arr = new int[2];
      while(p1<arrayOne.length && p2<arrayTwo.length){ 
        int first = arrayOne[p1];
        int second = arrayTwo[p2];
        if(first < second){
          current = second - first;
          p1++;
        }else if(first > second){
          current = first - second;
          p2++;
        }else{
          arr[0]=first;
          arr[1]=second;
          break;
        }
  
        if(smallest > current){
          smallest = current;
          arr[0]=first;
          arr[1]=second;
        }
      }  
      System.out.println(Arrays.toString(arr));
    }



    public static int productSum() {
        // Write your code here.
        int sum = 0;

        List<Object> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        List<Object> l1 = new ArrayList<>();
        l1.add(7);
        l1.add(-1);
        list.add(l1);
        list.add(3);

        l1 = new ArrayList<>();
        l1.add(6);
        List<Object> l2 = new ArrayList<>();
        l2.add(-13);
        l2.add(8);
        l1.add(l2);
        l1.add(4);
        list.add(l1);

        sum = productSum(list,1);
        return sum;
      }
    
      private static int productSum(List<Object> array , int depth){
        int sum = 0;
        for(Object obj : array){
          if(obj instanceof ArrayList){
            sum+=(productSum((List<Object>)obj,depth+1));
          }else{
            sum+=((int)obj);
          }
        }
        return (depth*sum);
      }
}


