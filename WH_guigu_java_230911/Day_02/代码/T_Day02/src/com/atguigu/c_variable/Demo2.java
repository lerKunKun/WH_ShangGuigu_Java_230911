package com.atguigu.c_variable;

public class Demo2 {
    public static void main(String[] args) {
        //强制转换
        int num = 100;

        //要么类型一致,要么左大右小
        byte b = (byte)num;
        System.out.println(b);


        System.out.println("--------------------");

        //强制转换
        byte b1 = (byte)200;
        System.out.println(b1);//-56


        double d = 13.14;

        //左小右大 -> 报错
        int num1 = (int)d;
        System.out.println(num1);//13
        System.out.println("--------------------");
        //快捷代码 : .castvar [带转换的自动接收]

        int i = 100;

        byte j = (byte) i;
    }
}
