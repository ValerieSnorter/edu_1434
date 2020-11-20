package com.company;

public class Main {
    public static void main(String[] args) {
        int nums[] = {6,1,5,2,4,2};
        int sum = 0;
        int i = 0;
        
       for (i=0; i < nums.length - 1;i++){
       if ( (sum = sum + nums[i])<=10)
           System.out.println(nums[i]) ;
       }
    }
