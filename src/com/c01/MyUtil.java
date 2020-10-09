package com.c01;

import java.util.Random;

public class MyUtil {
    public static int[] ranNums(int scope,int size){
        int nums[]=new int[size];
        Random ran=new Random();
        for(int i=0;i<size;){
            int temp=ran.nextInt(scope);
            boolean flag=true;
            for(int j=0;j<i;j++){
                if (nums[j]==temp){
                    flag=false;break;
                }
            }
            if (flag) nums[i++]=temp;
        }
        return nums;
    }
}
