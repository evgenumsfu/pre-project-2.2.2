package web.service;

import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> listCars = new ArrayList<>();

    {
        listCars.add(new Car("Darya", "Mazda cx-5", 2015));
        listCars.add(new Car("Evgeniy", "Toyota rav-4", 2008));
        listCars.add(new Car("Valentin", "Renault Logan", 2011));
        listCars.add(new Car("Pavel", "Hyundai Santa Fe", 2010));
        listCars.add(new Car("Aleksey", "Toyota Avensis", 2009));
    }

    @Override
    public List<Car> presetСars(Integer count) {
        return listCars.stream().limit(count).collect(Collectors.toList());
    }
}

