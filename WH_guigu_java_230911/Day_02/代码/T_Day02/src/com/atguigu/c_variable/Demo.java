package com.atguigu.c_variable;
/*
    变量使用的注意事项 :
        1. 使用变量就是使用变量的变量名
        2. 变量的值的变化是在一定范围内发生改变 [数据类型的范围决定的]
        3. 整数默认使用int类型,浮点数默认使用double类型
        4. 如果要表示long类型的变量需要在数值的后方加 L [如果数值的范围没有超过int的范围,可以省略L]
        5. 如果要表示float类型的变量需要在数值的后方加 F
 */
public class Demo {
    public static void main(String[] args) {
        //定义一个整数变量 -> int
        int num = 10;
        System.out.println(num);

        //修改变量num的值
        num = 20;
        System.out.println(num);

        //num = "Hello";

        //定义一个long类型的变量
        long num1 = 2200000000L;
        System.out.println(num1);

        float num2 = 13.14F;
        System.out.println(num2);
    }
}
