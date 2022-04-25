package web.service;

import web.entity.Car;

import java.util.List;

public interface CarService {
    List<Car> getCars();
    public List<Car> getNumberOfCars(List<Car> cars, Integer count);
}
