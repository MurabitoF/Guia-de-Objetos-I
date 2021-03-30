package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //ej1();
    }

    static void ej1(){
        Rectangle rectangle1 = new Rectangle(5.0, 3.6);
        Scanner scan = new Scanner(System.in);

        System.out.println("Width: " + rectangle1.getWidth() + "   Height: " + rectangle1.getHeight());
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());
        System.out.println("");

        System.out.print("Input new width: ");
        rectangle1.setWidth(scan.nextDouble());
        System.out.print("Input new height: ");
        rectangle1.setHeight(scan.nextDouble());

        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());
        System.out.println("");

        Rectangle rectangle2 = new Rectangle();
        System.out.println("Width: " + rectangle2.getWidth() + "   Height: " + rectangle2.getHeight());
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());
    }

}
