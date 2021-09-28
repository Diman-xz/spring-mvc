package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarService {
    public static List<Car> getCountCars (Integer count){
        List<Car> allCars = Car.getAllCars();
        if (count == null || count >= 5) {
            return allCars;
        } else {
            return allCars.subList(0, count);
        }
    }
}
