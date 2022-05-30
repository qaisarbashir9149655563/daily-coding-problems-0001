package com.company;

import java.util.Scanner;

public class DCP10 {
    /**************************
     This problem was asked by Facebook.
     Given an array of integers, write a function to determine whether the array could become non-decreasing by modifying at most 1 element.
     For example, given the array [10, 5, 7], you should return true, since we can modify the 10 into a 1 to make the array non-decreasing.
     Given the array [10, 5, 1], you should return false, since we can't modify any one element to get a non-decreasing array.
     ***************************/
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int arr[] = new int[10];
            for(int i=0;i<n;i++)
                arr[i] = s.nextInt();
            System.out.println(nonDecreasingArrayByModifying(arr,n)?"True":"False");

        }
        public static boolean nonDecreasingArrayByModifying(int[] arr,int n){
            int prev = arr[0];
            int count=0;
            for(int i=1;i<n;i++){
                if(arr[i] - prev < 0){
                    count++;
                    if(count > 1)
                        return false;
                }
                prev = arr[i];
            }
            return true;
        }

}
