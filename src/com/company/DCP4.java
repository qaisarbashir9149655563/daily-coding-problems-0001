package com.company;

import java.util.Scanner;

public class DCP4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(findMaxNonAdjSum(arr,n));

    }
    public static int findMaxNonAdjSum(int arr[],int n){
        if(n==1){
            return arr[0];
        }
        if(n==2){
            return Math.max(arr[0],arr[1]);
        }
        int sum[]=new int[n];
        sum[n-1]=arr[n-1];
        sum[n-2]=Math.max(arr[n-1],arr[n-2]);
        for(int i=n-3;i>=0;i--){
            sum[i]=Math.max(arr[i]+sum[i+2],sum[i+1]);
        }
        return sum[0];
    }
}
