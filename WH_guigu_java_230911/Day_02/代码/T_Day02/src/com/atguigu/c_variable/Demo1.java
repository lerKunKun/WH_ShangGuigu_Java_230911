package com.atguigu.c_variable;
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


    移动代码的快捷键 : alt + shift + 上下键 [想去哪就去哪]/ ctrl + shift + 上下键 [只能在有效范围内移动]
 */
public class Demo1 {
    public static void main(String[] args) {
        //定义一个整数变量num
        int num;

        num = 100;

        System.out.println(num);

        //代码块
        byte b = 100;
        {
            System.out.println(b);
        }

        b = 120;

        System.out.println("---------------------");
        //修改代码 -> 优化代码
//        double x = 1.1;
//        double y = 2.2;
//        double z = 3.3;

//        double x,y,z;
//        x = 1.1;
//        y = 2.2;
//        z = 3.3;

        double x = 1.1,y = 2.2,z = 3.3;
    }
}
