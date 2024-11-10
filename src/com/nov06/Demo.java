package com.nov06;

public class Demo<T> {
    T box;
    Demo(T b){
        this.box=b;
    }

    public static void main(String[] args) {
        Demo<Integer> d = new Demo<>(56852);
        System.out.println(d.box);
    }
}
