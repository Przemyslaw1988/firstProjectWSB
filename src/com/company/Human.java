package com.company;

public class Human {
    private String name;
    private String colorOfSkin;
    private int weight;
    private int size;

    public Human(String name, String colorOfSkin, int weight, int size) {
        this.name = name;
        this.colorOfSkin = colorOfSkin;
        this.weight = weight;
        this.size = size;
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
}
