package com.company;

import java.util.Scanner;

public class DCP7 {
    /**************************
     This problem was asked by Google.
     We can determine how "out of order" an array A is by counting the number of inversions it has. Two elements A[i] and A[j] form an inversion if A[i] > A[j] but i < j. That is, a smaller element appears after a larger element.
     Given an array, count the number of inversions it has. Do this faster than O(N^2) time.
     You may assume each element in the array is distinct.
     For example, a sorted list has zero inversions. The array [2, 4, 1, 3, 5] has three inversions: (2, 1), (4, 1), and (4, 3). The array [5, 4, 3, 2, 1] has ten inversions: every distinct pair forms an inversion.
     ***************************/
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
                arr[i]=s.nextInt();
            System.out.println(inversion(arr));
        }
        public static int inversion(int[] arr){
            int c=0;
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    if((arr[i] > arr[j]) && (i < j))
                        c++;
                }
            }
            return c;
        }
    }

