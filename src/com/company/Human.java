package com.company;

import com.company.devices.Car;

import java.util.Date;

public class Human {
    private String name;
    private String colorOfSkin;
    private int weight;
    private int size;
    private double salary;
    private Animal pet;
    private Car car;

    public Human(String name, String colorOfSkin, int weight, int size, double salary) {
        this.name = name;
        this.colorOfSkin = colorOfSkin;
        this.weight = weight;
        this.size = size;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColorOfSkin() {
        return colorOfSkin;
    }

    public void setColorOfSkin(String colorOfSkin) {
        this.colorOfSkin = colorOfSkin;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getSalary() {
        System.out.println(new Date() + " " +"Actual date when you get info about money " + salary);
        return salary;
    }

    public void setSalary(double salary) {
        if(salary < 0){
            System.out.println("Stop doing that");
        }else {
            System.out.println("New data was send do accountancy");
            System.out.println("New contract goes to miss Krysia");
            System.out.println("They know already, you don't hide you're money in front of ZUS and US");
            this.salary = salary;
        }

    }

    public static Animal getPet(Animal animal) {
        return new Animal();
    }

    public static Car getCar(Car car) {
        return new Car();
    }

    public void setCar(Car car) {
        if (getSalary() > car.getPrice()){
            System.out.println("You are rich man, nice car you have " + car);
        }else if (getSalary() > car.getPrice()/12){
            System.out.println("You are lucky man, you got a credit for this nice car " + car);
        } else {
            System.out.println("Sorry man go somewhere else");
        }
        this.car = car;
    }
}
