package com.company;

import java.util.Scanner;

public class DCP2 {
    /*Given an array of integers, return a new array such that each element at index i of the new array is
     the product of all the numbers in the original array except the one at i.
    For example, if our input was [1, 2, 3, 4, 5], the expected output would be
     [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].*/
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        prodArray(arr,n);
    }
    public static void prodArray(int arr[],int n){
        int left[]=new int[n];
        int right[]=new int[n];
        int prod[]=new int[n];
        left[0]=1;
        right[n-1]=1;
        for(int i=1;i<n;i++){
            left[i]=arr[i-1]*left[i-1];
        }
        for(int j=n-2;j>=0;j--){
            right[j]=arr[j+1]*right[j+1];
        }
        for(int i=0;i<n;i++){
            prod[i]=left[i]*right[i];
        }
        for(int i=0;i<n;i++){
            System.out.println(prod[i]+" ");
        }
    }
}
