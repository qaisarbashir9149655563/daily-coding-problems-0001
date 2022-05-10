package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);

       //.........................First problem
    /*    int n=sc.nextInt();
        int k= sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            int input = sc.nextInt();
            arr.add(input);
        }
        if(twoSum(arr,k)){
            System.out.println("True");
        }else {
            System.out.println("False");
        }*/

     //..........................Second Problem
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        prodArray(arr,n);
    }
    // first problem
    public static boolean twoSum(ArrayList<Integer> arr,int k){
        int n = arr.size();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int num = arr.get(i);
            if(map.containsKey(k-num)){
                return true;
            }
            map.put(arr.get(i),i);
        }
        return false;
    }
    //second problem
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
