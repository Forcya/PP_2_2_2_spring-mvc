package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.entity.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MyController {

    @Autowired
    private CarService carService;

    @RequestMapping(value = "/cars")
    public String deleteEmployee(@RequestParam(value = "count",defaultValue = "5") Integer carsNumber, Model model) {
        model.addAttribute("listCars", carService.getNumberOfCars(carService.getCars(), carsNumber));

        return "cars";
    }
}