package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //ej1();
        //ej2();
        //ej3();
        //ej4();
        //ej5();
    }

    public static void ej1(){
        Rectangle rectangle1 = new Rectangle(5.0, 3.6);
        Scanner scan = new Scanner(System.in);

        System.out.println("Width: " + rectangle1.getWidth() + "   Height: " + rectangle1.getHeight());
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());
        System.out.println();

        System.out.print("Input new width: ");
        rectangle1.setWidth(scan.nextDouble());
        System.out.print("Input new height: ");
        rectangle1.setHeight(scan.nextDouble());

        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());
        System.out.println();

        Rectangle rectangle2 = new Rectangle();
        System.out.println("Width: " + rectangle2.getWidth() + "   Height: " + rectangle2.getHeight());
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());
    }

    public static void ej2(){
        Employee employee1 = new Employee("Carlos", "Gutiérrez", "23456345", 25000.00);
        Employee employee2 = new Employee("Ana", "Sánchez", "34234123", 27500.00);

        employee1.showEmployee();
        employee2.showEmployee();

        employee1.increaseSalary(15);
        System.out.println(String.format("%1.2f", employee1.getAnnualSalary()));

    }

    public  static void ej3(){
        ItemVenta nuevoItem = new ItemVenta(1,"Chocolate",3,55.50);
        nuevoItem.showItemVenta();
    }

    public  static void ej4(){
        BankAccount account1 = new BankAccount(1,"Franco", 15000.00);

        System.out.println(account1.credit(2500.00));
        System.out.println(account1.debit(1500.00));
        System.out.println(account1.debit(30000.00));
        account1.showAccount();
    }

    public  static void ej5(){
        Hora reloj = new Hora(15,32,27);
        reloj.mostrarHora();
        reloj.avanzarSegundo();
        reloj.mostrarHora();
        reloj.retrocederSegundo();
        reloj.mostrarHora();
    }
}
