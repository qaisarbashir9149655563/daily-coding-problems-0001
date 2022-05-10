package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    /*Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
        For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.*/
    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
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
        }
    }
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
}
