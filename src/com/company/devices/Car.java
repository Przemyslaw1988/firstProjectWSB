package com.company.devices;

import com.company.Producer;

import java.util.Objects;

public class Car {

    private Producer producer;
    private String model;
    private Double price;

    public Car(Producer producer, String model, Double price) {
        this.producer = producer;
        this.model = model;
        this.price = price;
    }

    public Car(Producer producer, String model) {
        this.producer = producer;
        this.model = model;
    }

    public Car() {

    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return producer == car.producer &&
                Objects.equals(model, car.model) &&
                Objects.equals(price, car.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, model, price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer=" + producer +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
