package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    @Override
    public List<Car> getAllCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Camry", "black"));
        cars.add(new Car("Honda", "Accord", "white"));
        cars.add(new Car("BMW", "M5", "yelow"));
        cars.add(new Car("Lada", "Granta", "blue"));
        cars.add(new Car("Renault", "Logan", "silver"));
        return cars;
    }
}
