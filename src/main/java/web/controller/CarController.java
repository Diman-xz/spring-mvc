package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.service.CarService;


@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCar(ModelMap model, Integer count) {
        model.addAttribute("cars", CarService.getCountCars(count));
        return "cars";
    }
}
