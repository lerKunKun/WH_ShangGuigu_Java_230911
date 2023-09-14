package com.guigu.a_First;

public class Test_01 {
    public static void main(String[] args) {
    int n = 10;
    n += (n++) + (++n);
    /*相当于n= n+(n++)+(++n)
    n++先取值再自增故取值为10,自增后n为11
    ++n先自增后取值故取值为12
    此时n += (n++) + (++n) -> n= n+(n++)+(++n)=10+10+12=32
    */
        System.out.println(n);//输出值为32
    }
 }