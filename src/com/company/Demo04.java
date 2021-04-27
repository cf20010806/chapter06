package com.company;

class Demo4 {
    public static void main(String[] args) throws Exception {   //继续向上声明异常，不处理
       /* try {
            setSex("双性人");
        }catch (Exception e){   //调用者处理异常
            e.printStackTrace();
            System.out.println("非男非女");
        } */
     setSex("afwarf");
    }
    public static void setSex(String sex) {   //声明异常
        if (!(sex.equals("男") || sex.equals("女"))){
            try {
                throw  new Exception("处理不了的异常， 扔出去");   //抛出异常
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
