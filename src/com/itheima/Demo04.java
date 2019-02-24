package com.itheima;

public class Demo04 {
    public static void main(String[] args){
       int num=num();
        System.out.println(num);
        int sum = sum ();
        System.out.println (sum);

    }

    public static int num() {
        int num=0;
        for (int i = 100; i>= 0; i--) {
            num+=i;
        }
        return num;
    }

    public static int sum(){
        int a=0;
        for (int i = 1; i <=100; i++) {
            if(i%2==0){
                a++;
            }
            a+=i;
        }
        return a;
    }
}

