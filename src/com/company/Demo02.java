package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        int [] a = new int[2];
        Scanner scanner = new Scanner(System.in);
        try {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            a[0] = i;
            a [2] = j;

            System.out.println(a[0] /a[2]);
        }catch (ArrayIndexOutOfBoundsException  | InputMismatchException | ArithmeticException e){
            System.out.println("数组越界异常");
            System.out.println("数据格式不正常异常");
            System.out.println("算术异常");
            System.out.println("以上异常中的一个");
        }
    }
}
