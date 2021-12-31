package com.company;

import java.util.ArrayList;

public class MaxSumSubArry {
    public static void main(String[] args) {
        int arr[]={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        ArrayList ans=MaxSum(arr);
        System.out.println(ans);
    }

     static ArrayList<Integer> MaxSum(int[] arr) {
         ArrayList<Integer>res=new ArrayList<Integer>();

        int reslutSum=0;
        for (int i=0;i< arr.length;i++){
            int sum=0;
            for (int j=i;j< arr.length;j++){
                sum+=arr[j];
                if (sum>reslutSum){
                    reslutSum=sum;
                    res.add(arr[j]);


                }

            }

        }
//        return reslutSum;
        return res;
    }
}
