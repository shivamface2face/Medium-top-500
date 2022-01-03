package com.company;

import java.util.Arrays;

public class MaxProduct {
    public static void main(String[] args) {
        int arr[]={-10, -3, 5, 6, -2};
        Maxpo(arr);
        Maxpo2(arr);

    }

    static void Maxpo2(int[] arr) {
        int n= arr.length;
        if (n<2){
            return;
        }

        Arrays.sort(arr);
        if (arr[0]*arr[1]>arr[n-1]*arr[n-2]){
            System.out.println(arr[0]+" "+arr[1]);
        }else {
            System.out.println(arr[n-1]+" "+arr[n-2]);
        }

    }

    static void Maxpo(int[] arr) {
        int maxprd=Integer.MIN_VALUE;
        int max_i=-1;
        int max_j=-1;

         for (int i = 0; i < arr.length; i++) {

             for (int j = i+1; j < arr.length; j++) {

                    if (maxprd<arr[i]*arr[j]){

                        maxprd=arr[i]*arr[j];
                        max_i=i;
                        max_j=j;

                    }

             }

         }
         System.out.println(" max product element are ("+arr[max_i]+","+arr[max_j]+")");

    }
}
