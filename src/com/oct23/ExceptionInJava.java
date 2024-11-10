package com.oct23;

public class ExceptionInJava {
    public void a(){
        b();
    }
    public void b(){
        System.out.println("B");
    }

    public static void main(String[] args) {
//        String str="lucky";
//        System.out.println(100/0);
        ExceptionInJava ex = new ExceptionInJava();
        ex.a();
    }
}
