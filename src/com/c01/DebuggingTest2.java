package com.c01;

public class DebuggingTest2 {
    public static void main(String ar[]){
        //设置条件断点
        for(int i=0;i<1000;i++){
            int x=i+1;
            System.out.println(x);
        }
        //以下是另一个额例子
        Student s1=new Student("wang",28);
        int age=s1.getAge();
        if (age<12){
            System.out.println("儿童 ****");
        }else if (age>90){
            System.out.println("老人 ****");
        }else{
            System.out.println("中年人***");
        }
    }
}
