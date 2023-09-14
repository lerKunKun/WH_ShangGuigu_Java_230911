package com.atguigu.c_vairable;
/*
    变量使用的注意事项 :
        1. 使用变量就是使用变量的变量名
        2. 变量的值的变化是在一定范围内发生改变 [数据类型的范围决定的]
        3. 整数默认使用int类型,浮点数默认使用double类型
        4. 如果要表示long类型的变量需要在数值的后方加 L [如果数值的范围没有超过int的范围,可以省略L]
        5. 如果要表示float类型的变量需要在数值的后方加 F
        6. 变量未赋值不能直接使用 [变量可以先定义后赋值]
        7. 变量只在其定义的大括号内有效 , 出了大括号就无效了 [作用域问题]
        8. 在同一个作用域下 不可用出现同名变量
        9. 一行可以定义多个变量,但是多个变量的数据类型必须是一致的!
            格式 :
                数据类型 变量名1 = 初始化值1,变量名2 = 初始化值2 .....;
 */
public class Demo {
    public static void main(String[] args) {
        //定义一个整数变量 ->int
        int num = 10;
        System.out.println(num);
        //修改变量num的值
        num = 20;
        System.out.println(num);

        //定义一个long类型的变量
        long num1 = 100L;
        System.out.println(num1);

        //定义一个float类型的变量
        float num2 = 13.14F;
        System.out.println(num2);

        int num3 = 100;
        int num4 = 300;
        byte b = (byte) num3;
        byte b1 = (byte) num4;
        System.out.println(b);
        System.out.println(b1);//大转小,强制转化;导致数据类型精度缺失


    }

}
