package com.cg.demo.variable;

public class LifeCycle {

    public int i = 1;

    void say() {

        i =5;

        {
            System.out.println(i);
        }

    }

    void change(int a) {

       a  = 20;

    }

    void change(StringBuffer a) {

        a.append("ollh");

    }


    void change(Variable v){
        v.name = "1234";
    }
}
