package com.cg.demo.geometry;

public class GeometryMain {


    public static  void calcuateArea(AbstractGeometry abs,int r){

        abs.CalculatedArea(r);
    }

    public static  void calcuateSea(AbstractGeometry abs,int r){

        abs.CalculatingPerimeter(r);
    }

    public static void main(String[] args) {
    /*    Learn l = new Learn();
        String s ="sadads";*/
        //AbstractGeometry gs = new Circular();
        AbstractGeometry gs = new Square();
        //AbstractGeometry gs = new Triangle();

        GeometryMain.calcuateArea(gs,100);
        GeometryMain.calcuateSea(gs,100);





    }
}

