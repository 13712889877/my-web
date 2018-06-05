package com.cg.demo.geometry;

public class Circular extends AbstractGeometry {
    @Override
    public void CalculatingPerimeter(int r) {
        double circular = 2 * π * r;
        System.out.println("圆的周长：" + circular);

    }

    @Override
    public void CalculatedArea(int r) {
        double circular = π * r * r;
        System.out.println("圆的面积：" + circular);

    }
}
