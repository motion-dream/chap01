package com.c01;

public class DebugTest1 {
    public static void main(String ar[]){
        System.out.println("begin");
        a();
        System.out.println("end");
    }
    public static void a(){
        System.out.println("aaa");
        b();
        System.out.println("aaaa");
    }
    public static void b(){
        System.out.println("bbbb");
    }
}
