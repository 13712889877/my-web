package com.cg.demo.variable;

import java.io.File;

public final class Variable {

    public String name;

    public static final String FILE_PATH = "C:\\Users\\15659\\Desktop";

    public static Variable v = new Variable("A");

    public static String MY_EYE = "HELLO";

    // 私有变量，仅在该类可见
    private double salary;

    static{

        System.out.println("static block");

    }


    //在构造器中对name赋值
    public Variable (String empName){
        System.out.println("customer constructer init "+empName);
        name = empName;

    }

    public static String getMyEye(){
        return MY_EYE;
    }

    public Variable (){
        System.out.println("default constructor init ");
    }

    public static String getApple(File file){
        String a = "c";
        a = "d";
        String c = getMyEye();
        return "I'm golden";
    }

    //设定salary的值
    public void setSalary(double empSal){
        salary = empSal;
    }

    // 打印信息
    public void printEmp(){
        System.out.println("名字 : " + name );
        System.out.println("薪水 : " + salary);
        System.out.println(FILE_PATH);
    }
}
