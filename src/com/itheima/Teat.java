package com.itheima;

public class Teat {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        method();




    }

    public static void method(){
        int a=-5;
        int b=--a;
        if (a%2==0){
            a =++b;
            System.out.println(a);
        }else {
            b =--a;
            System.out.println(b);
        }

    }


}
