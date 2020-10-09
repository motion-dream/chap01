package com.c01;

public class DebuggingTest {
    public static int sum(int n){
        int s=0;
        for(int i=0;i<n;i++){
            int t=1;
            for(int j=1;j<=i;j++)
                t=t*j;
            s+=t;
        }
        return s;
    }
    public static void main(String ar[]){
        int ss=0;
        ss=sum(5);
        System.out.println(ss);
    }
}
