package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello world!!");
        Animal bob = new Animal("Bob", "lion");
        Animal jack = new Animal("Jack", "dog");
        Human.getPet(bob);
        bob.takeForAWalk();
        bob.feed();
        Car car = new Car("BMW", "X6");

        Human john = new Human("John", "White", 70, 185  );
        Human kenny = new Human("Kenny", "Black", 80, 180  );

        Phone xiaomi = new Phone("redmi 10", "smartphone", 1, 6.0);
        Phone samsung = new Phone("s 10", "smartphone", 2, 6.5);
        if(bob.getWeight()<jack.getWeight()) {
            System.out.println("This animal is weigher " + jack.getName() + " weight: " + jack.getWeight());
        }             System.out.println("This animal is weigher " + bob.getName() + " weight: " + bob.getWeight());

        Human.getCar(car);
    }
}
