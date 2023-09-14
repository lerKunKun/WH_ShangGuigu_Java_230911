package com.atguigu.b_constant;
/*
    输出字面值常量
 */
public class Demo {
    public static void main(String[] args) {
        //1. 整数
        System.out.println(-10);
        System.out.println(0);
        System.out.println(10);
        System.out.println("----------------------------");
        //2. 小数,浮点数
        System.out.println(-10.11);
        System.out.println(0.0);
        System.out.println(10.11);
        System.out.println("----------------------------");
        //3. 字符
        System.out.println('a');
        System.out.println('A');
        System.out.println('8');
        System.out.println('!');
        System.out.println('我');
        System.out.println('\u0000');//空字符 : Unicode编码
        System.out.println("----------------------------");
        //4. 字符串
        System.out.println("双引号内可以写任意内容 ! 312dsa^$&^$% ");
        System.out.println("----------------------------");
        //5. 布尔
        System.out.println(true);
        System.out.println(false);
        System.out.println("----------------------------");
        //6. 空
        //System.out.println(null);
    }
}
