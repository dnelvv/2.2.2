package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("Chevrolet", 2008, "USA"));
        cars.add(new Car("Bentley", 2014, "USA"));
        cars.add(new Car("BMW", 2018, "USA"));
        cars.add(new Car("VAZ", 1990, "Russia"));
        cars.add(new Car("Skoda", 2017, "Germany"));
    }

    public List<Car> carList(int count){
        if (count >= 5){
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
