package com.cg.demo.geometry;

public class Triangle extends AbstractGeometry {
    @Override
    public void CalculatingPerimeter(int r) {
        double triangle = 6 * r;
        System.out.println("三角形的周长：" + triangle);
    }

    @Override
    public void CalculatedArea(int r) {
        double height = Math.pow(2 * r, (double)2);
        double triangle = (r * height) /2 ;
        System.out.println("三角形的面积：" + triangle);
    }
}
