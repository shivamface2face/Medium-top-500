package com.company;

import java.util.ArrayList;

public class MaxCircularSubArry {
    public static void main(String[] args) {

        int arr[]={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int ans=MaxSumCircular(arr);
        System.out.println(ans);
    }

    static int MaxSumCircular(int[] arr) {
        ArrayList<Integer>res=new ArrayList<Integer>();
         int temp[]=new int[2* arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i]=temp[arr.length+i]=arr[i];
        }
        int reslutSum=0;
        for (int i=0;i< arr.length;i++){
            int sum=0;
            for (int j=i;j< arr.length;j++){
                sum+=arr[j];
                if (sum>reslutSum){
                    reslutSum=sum;



                }

            }

        }
     return reslutSum;

    }
}
