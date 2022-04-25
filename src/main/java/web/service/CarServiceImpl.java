package web.service;

import org.springframework.stereotype.Service;
import web.entity.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> cars;

    {
        cars.add(new Car("BMW", "M5", "sedan"));
        cars.add(new Car("BMW", "X5M", "SUV"));
        cars.add(new Car("MB", "A-class", "hatchback"));
        cars.add(new Car("Skoda", "Octavia", "liftback"));
        cars.add(new Car("Audi", "RS5", "coupe"));
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }

    @Override
    public List<Car> getNumberOfCars(List<Car> cars, Integer count) {
        if (count == null) {
            return cars;
        } else if (count >= 0) {
            return cars.stream().limit(count).toList();
        } else {
            return cars.stream().limit(0).toList();
        }
    }
}
