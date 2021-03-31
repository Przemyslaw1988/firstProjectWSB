package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello world!!");
        Animal bob = new Animal("Bob", "lion");
        Animal jack = new Animal("Jack", "dog");
        Human.getPet(bob);
        bob.takeForAWalk();
        bob.feed();
        Car car = new Car(Producer.BMW, "X6", 100000.00);


        Human john = new Human("John", "White", 70, 185, 1500);
        Human kenny = new Human("Kenny", "Black", 80, 180, 5000);
        Human alf = new Human("Alf", "Yellow", 55,160,6500);

        ArrayList<Human> humanList = new ArrayList<>();
        humanList.add(john);
        humanList.add(kenny);
        humanList.add(alf);
        for (Human human : humanList) {
            System.out.println("My name is: " + human.getName() + "Me weight is: " + human.getWeight());
        }
        john.setSalary(-100);
        john.setSalary(10000);
        john.getSalary();
        john.setCar(car);
        kenny.setCar(car);
        Phone xiaomi = new Phone("redmi 10", "smartphone", 1, 6.0);
        Phone samsung = new Phone("s 10", "smartphone", 2, 6.5);
        if (bob.getWeight() < jack.getWeight()) {
            System.out.println("This animal is weigher " + jack.getName() + " weight: " + jack.getWeight());
        }
        System.out.println("This animal is weigher " + bob.getName() + " weight: " + bob.getWeight());

        Human.getCar(car);
    }
}
}