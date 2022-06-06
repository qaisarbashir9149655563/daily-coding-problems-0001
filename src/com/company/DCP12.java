package com.company;

import java.util.Scanner;

public class DCP12 {
    /*Contigeous elements of the list sum to k
    *  For example, if the list is [1,2,3,4,5] and k is 9, then it should return [2,3,4], since
    * 2+3+4 = 9
    *  */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int k=sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int l[]=new int[2];
        l=printPowerSets(arr,n,k);
        for(int j=l[0];j<l[1];j++){
            System.out.println(arr[j]);
        }
    }
    public static int[] printPowerSets(int arr[],int n,int k){
        int l[] = new int[n];
        int total = 0;
        for(int i=0;i<n;i++){
            total = arr[i];
            for(int j=i+1;j<n;j++){
                total+=arr[j];
                if(total==k){
                    l[0]=i;
                    l[1]=j+1;
                    return l;
                }
            }
        }
        return l;
    }
}
