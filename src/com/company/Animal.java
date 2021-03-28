package com.company;

public class Animal {

    private String name;
    private String type;
    private double weight;
    private int size;

    public Animal() {
    }

    private static final double TYPE_OF_LION = 50.0;
    private static final double TYPE_OF_MOUSE = 3.0;
    private static final double TYPE_OF_DOG = 15.0;

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
        if(type.equals("lion")){
            this.weight = TYPE_OF_LION;
            System.out.println("Weight of Lion : " + this.weight);
        }
        if(type.equals("mouse")){
            this.weight = TYPE_OF_MOUSE;
            System.out.println("Weight of Mouse : " + this.weight );
        }
        if(type.equals("dog")){
            this.weight = TYPE_OF_DOG;
            System.out.println("Weight of Dog : " + this.weight);
        }else{
            System.out.println("Animal is dead");
        }
    }

    public void feed(){
        if(this.weight > 0){
        if(type.equals("lion")){
            this.weight = TYPE_OF_LION + 1.0;
        }
        if(type.equals("mouse")){
            this.weight = TYPE_OF_MOUSE + 0.1;
        }
        if(type.equals("dog")){
            this.weight = TYPE_OF_DOG + 0.5;
        }
    }else{
            System.out.println("Animal is dead");
        }
        System.out.println("Weight of " + getType()+ " " + weight);
    }

    public void takeForAWalk(){
        if(this.weight > 0){
            if(type.equals("lion")){
                weight = TYPE_OF_LION - 1.0;}
            if(type.equals("mouse")){
                weight = TYPE_OF_MOUSE - 1.0;}
            if(type.equals("dog")){
                weight = TYPE_OF_DOG - 1.0;}
        }else{
            System.out.println("Animal is dead");
        }
        System.out.println("Weight of " + getType()+ " " + weight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
