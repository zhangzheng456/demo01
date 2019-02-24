package com.itheima;

public class Demo01 {
    public static void main(String[] args) {

        int c = sum(3, 5);
        System.out.println(c);

        String b = nba("哈登", "牛逼");
        System.out.println(b);

    }

    public static int sum(int a, int b) {
        int c = a + b + a++;
        return c;
    }


    public static String nba(String b, String a) {
        String c = a + b + "的很";
        return c;
    }


}