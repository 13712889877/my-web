package com.cg.demo.variable;

public class LifeCycleMain {

    public static void main(String[] args) {
        LifeCycle lifeCycle  = new LifeCycle();

        int i = 10;
        lifeCycle.say();
        System.out.println(lifeCycle.i);


        int a = 8;
        //副本值传递
        lifeCycle.change(a);
        System.out.println(a);

        StringBuffer b = new StringBuffer("hell");
        //副本值传递
        lifeCycle.change(b);
        System.out.println(b);

        //引用传递
        Variable v = new Variable("4321");
        lifeCycle.change(v);
        System.out.println(v.name);


    }
}
