package com.company;

public class MaxProduct {
    public static void main(String[] args) {
        int arr[]={-10, -3, 5, 6, -2};
        Maxpo(arr);

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
