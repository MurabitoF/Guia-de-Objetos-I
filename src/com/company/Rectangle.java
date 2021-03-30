package com.company;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea(){
        return this.height * this.width;
    }

    public double getPerimeter(){
        return 2 * (this.width + this.height);
    }
}
