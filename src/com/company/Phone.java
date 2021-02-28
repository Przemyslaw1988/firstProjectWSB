package com.company;

public class Phone {
    private String name;
    private String type;
    private int weight;
    private double sizeOfScreen;

    public Phone(String name, String type, int weight, double sizeOfScreen) {
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.sizeOfScreen = sizeOfScreen;
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getSizeOfScreen() {
        return sizeOfScreen;
    }

    public void setSizeOfScreen(int sizeOfScreen) {
        this.sizeOfScreen = sizeOfScreen;
    }
}
