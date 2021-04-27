package com.company;

public class Demo05 {
    private static String sex;

    public static void main(String[] args)  throws  Exception{  //继续向上声明异常，不处理
          try {
            setSex("双性人");
        }catch (Exception e){   //调用者处理异常

            System.out.println("调用者说处理过了");
        }
    }

    public static void setSex(String sex)  throws  SexException{
        if (!(sex.equals("男") || sex.equals("女"))){
            throw new SexException("发现一个不对劲");
        }
    }
}
