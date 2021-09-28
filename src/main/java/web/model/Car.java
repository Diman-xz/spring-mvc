package web.model;


import org.springframework.ui.ModelMap;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private String brand;
    private String model;
    private String color;

    public Car(String brand, String model, String color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public static List <Car> getAllCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Camry", "black"));
        cars.add(new Car("Honda", "Accord", "white"));
        cars.add(new Car("BMW", "M5", "yelow"));
        cars.add(new Car("Lada", "Granta", "blue"));
        cars.add(new Car("Renault", "Logan", "silver"));
        return cars;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
