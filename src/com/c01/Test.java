package com.c01;



public class Test {
    public static void main(String arg[]){
        StudentDao sd=new StudentDao();
        Student s1=new Student("wang",28);
        sd.change(s1);
        System.out.println(s1.getAge());
        int x=100,y=100;
        sd.change(x,y);
        System.out.println(x+"  "+y);


//        int[] x=MyUtil.ranNums(100,10);
//        for(int i=0;i<x.length;i++){
//            System.out.println(x[i]);
//        }
    }
}
