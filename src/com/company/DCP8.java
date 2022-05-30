package com.company;

import java.util.Scanner;

public class DCP8 {
/**************************
 There is an N by M matrix of zeroes. Given N and M, write a function to count the number of ways of starting at the top-left corner and getting to the bottom-right corner. You can only move right or down.
 For example, given a 2 by 2 matrix, you should return 2, since there are two ways to get to the bottom-right:
 ***************************/

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int m = s.nextInt();
            System.out.println(countWays(n,m));
        }
        public static int countWays(int n,int m){
            if(n == 1 || m==1)
                return 1;
            return countWays(n-1,m)+countWays(n,m-1);
        }
    }

