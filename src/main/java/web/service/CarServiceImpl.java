package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> getCountCars(Integer count) {
        List<Car> allCars = carDao.getAllCars();
        if (count == null || count >= 5) {
            return allCars;
        } else {
            return allCars.subList(0, count);
        }
    }
}
