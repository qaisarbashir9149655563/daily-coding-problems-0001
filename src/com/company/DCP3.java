package com.company;

import java.util.Scanner;

public class DCP3 {
    /*Given an array of integers, find the first missing positive integer in linear time and constant space.
    In other words, find the lowest positive integer that does not exist in the array.
     The array can contain duplicates and negative numbers as well.
       For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.*/
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(MissingNumber(arr,n));
    }
    public static int MissingNumber(int arr[],int n){
        int hash[]=new int[10000001];
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                hash[arr[i]]=1;
            }
        }
        int j=1;
        while(j<n){
            if(hash[j]==0){
                return j;
            }
            j++;
        }
        if(j==n){
            return n;
        }
        return -1;
    }
}
