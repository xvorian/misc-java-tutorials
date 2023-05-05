package com.amigoscode.beans;

import java.util.function.Function;

public class CarDTO {
    private final Integer id;
    private final String make;
    private final String model;

    private final Double price;

    public CarDTO(Integer id, String make, String model, Double price) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "CarDTO{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    public static CarDTO mapper(Car car){
        return new CarDTO(car.getId(), car.getMake(), car.getModel(),car.getPrice());
    }

    static Function<Car, CarDTO> map = car ->
        new CarDTO(car.getId(), car.getMake(), car.getModel(),car.getPrice());
    }



