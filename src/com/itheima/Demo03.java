package com.itheima;

public class Demo03 {
    public static void main(String[] args) {
        int a=jiou(20);
        System.out.println(a);

        int shu = shu (19);
        System.out.println (shu);
    }

    public static int jiou(int a) {
        if (a % 2 == 0) {
            System.out.println("a为偶数");
        } else {
            System.out.println("a为奇数");
        }
        return a;
    }


    public static int shu(int b) {
        if (b % 2 == 0) {
            System.out.println (b + "为偶数");
        } else {
            System.out.println (b + "奇数");
        }

        return b;
    }

}
