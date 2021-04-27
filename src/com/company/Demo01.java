package com.company;

public class Demo01 {

    public static void main(String[] args) {
        int divisor = 100;
        int dividend = 0;

           // System.out.println(divisor / dividend);  //ArithmeticException  算数异常
            try {
                System.out.println(divisor / dividend);  //ArithmeticException  算数异常
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("捕获到一个异常");
            } finally {
                System.out.println("不管如何都会执行这里的代码");
            }
            System.out.println("哈哈哈哈哈哈哈哈哈");


    }
}