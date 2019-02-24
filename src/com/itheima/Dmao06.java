package com.itheima;

public class Dmao06 {
    public static void main(String[] args) {
        int num = getmax(2, 3);
        System.out.println(num);

        int num2 = getmax(2, 3, 4);
        System.out.println(num2);

        double num3 = getmax(2, 2.5);
        System.out.println(num3);

        double num4 = getmax(3.8, 4);
        System.out.println(num4);
    }

    public static int getmax(int a,int b) {
        if (a>b){
            return a;
        }else {
            return b;
        }
    }

    public static int getmax(int a,int b,int c) {
        if (a>b&&a>c){
            return a;
        }else if(b>a&&b>c){
            return b;
        }else {
            return  c;
        }
    }
    public static double getmax(int a,double b) {
        if (a>b){
            return a;
        }else {
            return b;
        }
    }

    public static double getmax(double a,int b) {
        if (a>b){
            return a;
        }else {
            return b;
        }
    }


}
