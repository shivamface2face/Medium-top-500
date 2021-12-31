package com.company;

import java.util.HashSet;

public class MinmumIndexRept {
    public static void main(String[] args) {
        int arr[]={5, 6, 3, 4, 3, 6, 4 };
       int ans= GetMinofReaptEle(arr);
        System.out.println(ans);
    }

     static int GetMinofReaptEle(int[] arr) {

        int minIndex= arr.length;
         HashSet<Integer>h=new HashSet<Integer>();
         for (int i = arr.length-1; i >=0 ; i--) {
             if (h.contains(arr[i])){
                 minIndex=i;
             }else {
                 h.add(arr[i]);
             }

         }
         if (minIndex== arr.length){
             return -1;
         }
         return minIndex;

    }
}
