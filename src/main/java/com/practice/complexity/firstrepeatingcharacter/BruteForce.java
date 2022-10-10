package com.practice.complexity.firstrepeatingcharacter;

import java.util.LinkedHashSet;
import java.util.Set;

public class BruteForce {
    public static void main(String[] args) {
        String str = "programming";
        char[] arr = str.toCharArray();
        brute_force(arr);
        visited(arr);
    }

    //T---> O(n^2) S---> O(1)
    private static void brute_force(char[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j< arr.length; j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }

    //T---> O(n) S---> O(1)
    private static void visited(char[] arr){
        Set<Character> visite = new LinkedHashSet<>();
        for(char ch : arr){
            if(visite.contains(ch)){
                System.out.println(ch);
            }else{
                visite.add(ch);
            }        
        }
    }

}
