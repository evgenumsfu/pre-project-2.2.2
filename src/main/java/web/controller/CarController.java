package web.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

@Controller
public class CarController {

    private final CarService carService;

    @Autowired

    private CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String Cars(@RequestParam(name = "count", defaultValue = "5") int count, Model model) {
        List<Car> allCars = carService.presetСars(count);
        model.addAttribute("cars", allCars);
        return "cars";
    }
}
