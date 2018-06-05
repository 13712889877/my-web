package com.cg.demo.geometry;

public class Square extends AbstractGeometry {
    @Override
    public void CalculatingPerimeter(int r) {

        double square = 4 * r;
        System.out.println("正方形的周长：" + square);
    }

    @Override
    public void CalculatedArea(int r) {
        double square = r * r;
        System.out.println("正方形的面积：" + square);
    }
}
