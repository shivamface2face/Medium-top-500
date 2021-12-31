package com.company;

import java.util.Arrays;

public class SortBinaryArray {

    public static void main(String[] args) {
        int arr[]={1,0,0,1,0,1,0,1};
        Sortbinary(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Sortbinary(int[] arr) {
        int zero=0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==0){
                zero++;
            }
        }
//        copy the element in arr
        int k=0;
       while (zero--!= 0){
           arr[k++]=0;
       }
       while (k< arr.length){
           arr[k++]=1;
       }

    }
}
