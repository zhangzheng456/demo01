package com.itheima;

public class Demo05 {
    public static void main(String[] args) {


        String fenshu = chengji(20);
        System.out.println(fenshu);

        String a = tizhong (100);
        System.out.println (a);



    }
   public static String chengji(int a){
        if (a>=80&&a<=100){
            return "优秀";
        }else if (a>=70&&a<80){
            return  "良好";
        }else if (a>=60&&a<70){
            return "及格";
       }else  if (a>=0&&a<60){
            return "不及格";
        }else {
            return "数据错误";
        }

   }
   public static String tizhong(int a){
        if (a<=100&&a>=0){
            return "偏瘦";
        }else if (a>=100&&a<=140){
            return "正常";
        }else if (a>140&&a<160){
            return  "超重";
        }else if (a>160&&a<300){
            return  "该减肥了";
       }else {
            return  "数据错误";
        }
   }
}

