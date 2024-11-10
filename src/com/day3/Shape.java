package com.day3;

public class Shape {
//    Quesion 3
//    Create a Shape class with a method calculateArea() that takes different parameters to calculate the area of different shapes.
//    Calculate the area of a rectangle with length and width as parameters.
//    Calculate the area of a circle with radius as a parameter.
//    Calculate the area of a triangle with base and height as parameters.
//    Expected Output:
//            Shape.calculateArea(5, 3) should return 15.0 (area of rectangle)
//            Shape.calculateArea(4) should return 16.0 (area of circle)
//            Shape.calculateArea(3, 4) should return 6.0 (area of triangle)

    public double calculateArea(int hight, int width){
        //rectangle
        return  hight*width;
    }

    public double calculateArea(double radius){
        //circle
        return  Math.PI*radius*radius;
    }

    public double calculateArea(double base, double hight){
        //triangle
        return  0.5*(base*hight);
    }

    public static void main(String[] args) {
        Shape sp = new Shape();
        double area1 = sp.calculateArea(5,3);
        System.out.println(area1);
        double area2 = sp.calculateArea(4);
        System.out.println(area2);
        double area3 = sp.calculateArea(3.0,4.0);
        System.out.println(area3);

    }
}
