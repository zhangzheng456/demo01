package com.itheima;

public class ZuoYe {
    public static void main(String[] args) {
        int c = sum(4, 6);
        System.out.println("两个整数的和为：" + c);
        System.out.println("========================");

        double v = sum2(2.9, 6.4);
        System.out.println("两个小数的和" + v);


        int i = sum3(2, 4);
        System.out.println("长方形的周长" + i);

        int i1 = sum4(2, 4);
        System.out.println("长方形的面积" + i1);


    }

    public static int sum(int a, int b) {
        int c = a + b;
        return c;
    }


    public static double sum2(double a, double b) {
        double c = a + b;
        return c;
    }


    public static int sum3(int a, int b) {
        int c = a * 2 + b * 2;
        return c;
    }

    public static int sum4(int a, int b) {
        int c = a * b;
        return c;

    }
}



