package com.company;

import java.util.Arrays;

public class DuplicateInRange {
    public static void main(String[] args) {
        int arr[]={  1, 2, 3, 4, 4 };
        Arrays.sort(arr);
       int ans= duplicate(arr);
        System.out.println(ans);
    }

     static int duplicate(int[] arr) {

         int totalsum=(arr.length*(arr.length-1))/2;
         int actulSum=0;
         for (int i = 0; i < arr.length; i++) {
             actulSum+=arr[i];
         }
         return actulSum-totalsum;
    }
}
