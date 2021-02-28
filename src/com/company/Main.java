package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello world!!");
        Animal bob = new Animal("Bob", "cat", 2, 5);
        Animal jack = new Animal("Jack", "dog", 4, 7);

        Human john = new Human("John", "White", 70, 185  );
        Human kenny = new Human("Kenny", "Black", 80, 180  );

        Phone xiaomi = new Phone("redmi 10", "smartphone", 1, 6.0);
        Phone samsung = new Phone("s 10", "smartphone", 2, 6.5);
    }
}
