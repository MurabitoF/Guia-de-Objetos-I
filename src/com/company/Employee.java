package com.company;

public class Employee {
    private String name;
    private String lastName;
    private String dni;
    private Double salary;

    public Employee(String name, String lastName, String dni, Double salary) {
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDni() {
        return dni;
    }

    public Double getSalary() {
        return salary;
    }



    public void showEmployee(){
        //System.out.println("Employee[dni=" + this.dni + ", name=" + this.name + ", last name=" + this.lastName + ", salary=" + this.salary + " ]");
        String output = String.format("Employee[dni=%s, name=%s, lastName=%s, salary=%1.2f]", this.dni, this.name, this.lastName, this.salary);
        System.out.println(output);
    }

    public double getAnnualSalary(){
        return 12 * this.salary;
    }

    public void increaseSalary(double increase){
        this.salary = (double)Math.round((1 + (increase/100)) * this.salary * 100)/100;
    }
}
