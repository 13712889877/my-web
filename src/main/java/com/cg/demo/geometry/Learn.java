package com.cg.demo.geometry;

import java.util.Date;
import java.util.Scanner;

public class Learn {


    public static void main(String[] args) {
        double b = 4.998;
        double c = Math.sqrt(b);
        int n = 123456789;
        float f = n;
        int nb = (int) b;
        float fb = (float) b;
        String s = "helloworld";
        String ss = "dsfsfsfs";
        String sss = "Helloworld";
        String str = s.substring(0, 3) + "p!";
        String tt = "";
        StringBuilder bu = new StringBuilder();
        bu.append(ss);
        bu.append(s);
        if (tt.equals("")) {
            System.out.println(0);
        }
        Scanner in = new Scanner(System.in);

        String st = s.substring(0, 7);
        String all = String.join("", "s", "b");
        System.out.println(st);
        System.out.println(fb);
        System.out.println(nb);
        System.out.println(c);
        System.out.println(f);
        System.out.println(all);
        System.out.println(str);
        System.out.println(s.equals(ss));
        System.out.println(s.equalsIgnoreCase(sss));
        System.out.println(s.equalsIgnoreCase(ss));
        System.out.println(bu);
        System.out.println(new Date());

    }
}
